package com.lyn.interceptor;

import com.lyn.model.User;
import com.lyn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
 
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
        System.out.println("Entered preHandle form Interceptor");
        //先从session拿�?�用户
        Cookie[] cookies = request.getCookies();
        if(cookies==null){
        	System.out.println("Cookie is null");
        	
        }
        HttpSession session = request.getSession(false);
        if (session == null) {
        	
        	System.out.println("Get Out Of preHandle form Interceptor without session");
        	return true;
        }
        
        String sessionId = session.getId();
        for(Cookie cookie:cookies){
            if (cookie.getName().equals("JSESSIONID")) {
                if(!cookie.getValue().equals(sessionId)){
                	return true;
                }
            }
        }
 
        for (Cookie cookie2:cookies){
            if(cookie2.getName().equals("userid")&&cookie2.getValue()!=null){
                int cookieUserid = Integer.parseInt(cookie2.getValue());
                try{
                    String realPassword = userService.findUser(cookieUserid).getPassword();
                    User user = (User) session.getAttribute("user");
                    if (user.getPassword().equals(realPassword)){
                    	System.out.println("correct password");
                          
                    }else{
                    	return true;
                    }
                }catch (NullPointerException e){
                	return true;
                }
 
            }
        }
        System.out.println("Get Out Of preHandle form Interceptor");
        return true;
 
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
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("进入了postHandle方法�?�?�?�?");
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