package com.lyn.interceptor;

import com.lyn.model.Product;
import com.lyn.model.ProgressBar;
import com.lyn.model.STask;
import com.lyn.model.User;
import com.lyn.service.PTaskService;
import com.lyn.service.ProductService;
import com.lyn.service.STaskService;
import com.lyn.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
/**
 * @author    Yaning Liu
 *
 * @filename  AuthercationIntercetptor.java
 *
 * @date      2019-02-08
 *
 */

 
public class AuthorizedInterceptor implements HandlerInterceptor {
	private List<String> exceptUrls;  
	  
    public List<String> getExceptUrls() {  
        return exceptUrls;  
    }  
  
    public void setExceptUrls(List<String> exceptUrls) {  
        this.exceptUrls = exceptUrls;  
    }  
    @Resource(name="pTaskService")
	private PTaskService pTaskService;
	
	@Resource(name="sTaskService")
	private STaskService sTaskService;
	
	@Resource(name="productService")
	private ProductService productService;
	
    @Autowired
    private UserService userService;
 
    /**
     * preHandle方法是进行处�?�器拦截用的，顾�??�?义，该方法在Controller处�?�之�?进行调用，SpringMVC中的Interceptor拦截器是链�?的，�?�以�?�时存在，
     多个Interceptor，然�?�SpringMVC会根�?�声明的顺�?一个接一个的执行，而且所有的Interceptor中的preHandler方法都会在Controller方法之�?调用
     如果返回的是false的�?就能够中断这个请求
     * @param request
     * @param response
     * @param o
     * @return
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        
    	 String requestUri = request.getRequestURI();  
         if(requestUri.startsWith(request.getContextPath())){  
             requestUri = requestUri.substring(request.getContextPath().length(), requestUri.length());  
         }  
         //系统根目录  
         if (StringUtils.pathEquals("/",requestUri)) {  
             return true;  
         }  
         //放行exceptUrls中配置的url  
         for (String url:exceptUrls  
              ) {  
        	 System.out.println(url);
        	 System.out.println(requestUri);
             if(url.endsWith("/**")){  
                 if (requestUri.startsWith(url.substring(0, url.length() - 3))) {  
                     return true;  
                 }  
             } else if (requestUri.startsWith(url)) {  
                 return true;  
             }  
         }  
    	System.out.println("Entered preHandle form Interceptor");
        Cookie[] cookies = request.getCookies();
        if(cookies==null){
        	System.out.println("Cookie is null");
        	
        }
        HttpSession session = request.getSession(false);
        if (session == null) {
        	
        	System.out.println("No Session!");
        	response.sendRedirect("http://localhost:8080/lyn-ssh/jsp/common/sign_in.jsp");
        	return false;
        }
        String sessionId = session.getId();
        for(Cookie cookie:cookies){
            if (cookie.getName().equals("JSESSIONID")) {
                if(!cookie.getValue().equals(sessionId)){
                	response.sendRedirect("http://localhost:8080/lyn-ssh/jsp/common/sign_in.jsp");
                	return false;
                }
            }
        }
        for (Cookie cookie2:cookies){
            if(cookie2.getName().equals("userid")&&cookie2.getValue()!=null){
                int cookieUserid = Integer.parseInt(cookie2.getValue());
                try{
                    int sessionUserid = Integer.parseInt((String) session.getAttribute("userid"));
                    System.out.println(sessionUserid);
                    if (sessionUserid==cookieUserid){
                    	System.out.println("matched");
                          return true;
                    }else{
                    	response.sendRedirect("http://localhost:8080/lyn-ssh/jsp/common/sign_in.jsp");
                    	return false;
                    }
                }catch (NullPointerException e){
                	response.sendRedirect("http://localhost:8080/lyn-ssh/jsp/common/sign_in.jsp");
                	return false;
                }
 
            }
        }
        System.out.println("Password Is incorrect");
        response.sendRedirect("http://localhost:8080/lyn-ssh/jsp/common/sign_in.jsp");
        return false;
 
    }
 
    /**
     *这个方法�?�会在当�?的这个Interceptor的preHandler方法返回值为true的时候�?执行。
     postHandler是进行处�?�器拦截用的。它的执行时间实在处�?�器进行处�?�之�?�，也就是在Controller
     的方法调用之�?�执行，但是他会在DispatcherServler进行视图渲染之�?执行，也就是说在这个方法中，
     你�?�以对返回的ModelAndView进行�?作。
     *这个方法的链�?结构跟正常访问的方�?�是相�??的，也就是说先声明的Interceptor拦截器该方法�??而会�?�调用，
     这里与struts2里�?�的拦截器的执行过程有点�?。
     *�?�是struts2里�?�的intercept方法中�?手动调用的ActionInvocation的invoke方法，Struts2中调用
     ActionInvocation的invoke方法就是调用下一个Inteceptor或者是调用actio,然�?�在Interceptor之�?
     调用的内容都写在invoke之�?，�?在Interceptor之�?�调用的都�?�载invoke方法之�?�
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    	HttpSession session = request.getSession(false);
    	if(session.getAttribute("userid")==null)
    		return;
    	int sessionUserid = Integer.parseInt((String) session.getAttribute("userid"));
    	User user = this.userService.findUser(sessionUserid);
    	session.setAttribute("username", user.getName());
    }
 
    /**
     *这个方法需�?preHandler方法的返回值是true的时候�?会执行。该方法将整个请求完�?之�?�
     * 也就是DispatcherServlet渲染了视图�?执行
     * 这个方法的主�?用途是用于清�?�资�?的，当然这个方法也�?�能在当�?这个Interceptor的preHandler方法的返回值
     * 是true的时候�?会执行
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("进入了afterCompletion方法�?�?�?�?");
    }

}