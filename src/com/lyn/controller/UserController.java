package com.lyn.controller;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	@RequestMapping(method = RequestMethod.GET, value = "validUser")
	public String addUser(){
		System.out.println("**********findUser***********");
		JSONObject obj = new JSONObject();
	
		
	
		return obj.toString();
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
		ModelAndView model = new ModelAndView("forward:/jsp/user/user_manage.jsp");
		this.userService.addUser(user);
	    model.addObject("user",user);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "userList")  
    public ModelAndView userList(User user){
		ModelAndView model = new ModelAndView("forward:/jsp/user/user_manage.jsp");
		List<User> users = userService.getUesrList();
	    model.addObject("users",users);
        return model;
    }
	
	
	@RequestMapping(method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	   }
}
