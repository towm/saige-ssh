package com.lyn.controller;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.lyn.model.User;
import com.lyn.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	//¶ÔUserService½Ó¿Ú£¬µ±Ö»ÓÐÒ»¸öÊµÏÖÀà¼Ì³Ð½Ó¿ÚÊ±£¬¿ÉÒÔÊ¹ÓÃ@Autowired£¬½Ó¿ÚÊµÏÖÀà@Service×¢½â¼´¿É¡£
	//¶à¸öµÄÊ±ºòÊ¹ÓÃ@Resource(name="userService2")À´Ö¸¶¨µ÷ÄÇ¸ö×Ó½Ó¿Ú£¬½Ó¿ÚÊµÏÖÀà@Service("userService2")×¢½â¼´¿É¡£
//	@Autowired
//	private UserService userService;
//	
	@Resource(name="userService")
	private UserService userService;

	
	// http://localhost:8080/lyn-ssh/user/addUser.do
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "validUser")
	public ModelAndView validUser(HttpServletResponse response, String id,String password){
		
		
		ModelAndView model =null;
		User user = this.userService.findUser(Integer.parseInt(id));
		System.out.println(user.getPassword()+user.getName());
		System.out.println(password);
		if( !user.getPassword().equals(password)) 
			{
			     model = new ModelAndView("forward:/jsp/common/sign_in_error.jsp");
			     return model;
			}
		
		Cookie foo = new Cookie("id", String.valueOf(user.getId())); //bake cookie
		foo.setMaxAge(2000); //set expire time to 1000 sec
				
		response.addCookie(foo); //put cookie in response 
	    model = new ModelAndView("forward:/jsp/manager/manager_index.jsp");
		model.addObject("user",user);
		return model;
	}
	

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "login")
    public ModelAndView login(HttpServletRequest request,String id, String password, HttpServletResponse response){
    	ModelAndView model =null;
		User user = this.userService.findUser(Integer.parseInt(id));
		if(user==null) 
		{
		     model = new ModelAndView("forward:/jsp/common/sign_in_error.jsp");
		     return model;
		}
		System.out.println(user.getPassword()+user.getName());
		System.out.println(password);
		if(!user.getPassword().equals(password)) 
			{
			     model = new ModelAndView("forward:/jsp/common/sign_in_error.jsp");
			     return model;
			}
		HttpSession session = request.getSession();
        session.setAttribute("userid",id);
        session.setAttribute("password",password);
        session.setAttribute("user", user);
       Cookie useridCookie = new Cookie("userid",id);
       useridCookie.setMaxAge(500);
       useridCookie.setPath("/");
       response.addCookie(useridCookie);

       Cookie[] cookies = request.getCookies();
       System.out.println("external SessionId:"+session.getId());
       for (Cookie cookie:cookies){
           if(cookie.getName().equals("JSESSIONID")){
               System.out.println("Cookie inside session id:"+session.getId());
               cookie.setValue(session.getId());
               cookie.setPath("/");
               cookie.setMaxAge(500);
               response.addCookie(cookie);
           }
       }
	    model = new ModelAndView("forward:/jsp/manager/manager_index.jsp");
		model.addObject("user",user);
		return model;
    }

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "logout")
    public ModelAndView logout(HttpServletRequest request,HttpServletResponse response){
        //删除cookie
        Cookie useridCookie = new Cookie("userid","");
        System.out.println("remove cookie");
        useridCookie.setMaxAge(0);
        useridCookie.setPath("/");
        response.addCookie(useridCookie);
        request.getSession().removeAttribute("userid");
        request.getSession().removeAttribute("password");
        ModelAndView model =null;
        model = new ModelAndView("redirect:/jsp/common/sign_in.jsp");
		return model;
    }

	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "signUp")  
    public ModelAndView addUser(User user){
		ModelAndView model = new ModelAndView("forward:/common/jsp/common/sign_up_succ.jsp");
		this.userService.addUser(user);
	    model.addObject("user",user);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "addUser")  
    public ModelAndView addUser2(User user){
		ModelAndView model = new ModelAndView("redirect:/user/userList.do");
		this.userService.addUser(user);
	    model.addObject("user",user);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "userList")  
    public ModelAndView userList(User user){
		ModelAndView model = new ModelAndView("forward:/jsp/manager/manager_user.jsp");
		List<User> users = userService.getUserList();
	    model.addObject("users",users);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "delUser")  
    public ModelAndView delUser(int id){
		ModelAndView model = new ModelAndView("forward:/user/userList.do");
		this.userService.delUser(this.userService.findUser(id));
        return model;
    }

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "getUser")  
    public ModelAndView getUser(int id){
		ModelAndView model = new ModelAndView("forward:/jsp/manager/manager_user_update.jsp");
		model.addObject(this.userService.findUser(id));
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "updateUser")  
    public ModelAndView updateUser(User user){
		ModelAndView model = new ModelAndView("redirect:/user/userList.do");
		this.userService.upadteUser(user);
        return model;
    }
	
	@RequestMapping(method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	   }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "logincookie")
    public String autoLogin(HttpServletRequest request,HttpServletResponse response){
        System.out.println("Enter Controller!");
        Cookie[] cookies = request.getCookies();
        if(cookies==null){
            return "redirect:login";
        }
        HttpSession session = request.getSession(false);
        String sessionId = session.getId();
 
        for(Cookie cookie:cookies){
            if (cookie.getName().equals("JSESSIONID")) {
                if(!cookie.getValue().equals(sessionId)){
                    return "redirect:login";
                }
            }
        }
 
        for (Cookie cookie2:cookies){
            if(cookie2.getName().equals("username")&&cookie2.getValue()!=null){
                int cookieUsername = Integer.parseInt(cookie2.getValue());
                try{
                    String realPassword = userService.findUser(cookieUsername).getPassword();
                    if (session.getAttribute("password").equals(realPassword)){
                        return "welcome";
                    }else{
                        return "redirect:login.jsp";
                    }
 
                }catch (NullPointerException e){
                    return "redirect:login.jsp";
                }
 
            }
        }
 
        return "redirect:login.jsp";
    }
}
