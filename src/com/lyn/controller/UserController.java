package com.lyn.controller;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyn.model.User;
import com.lyn.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	//¶ÔUserService½Ó¿Ú£¬µ±Ö»ÓÐÒ»¸öÊµÏÖÀà¼Ì³Ð½Ó¿ÚÊ±£¬¿ÉÒÔÊ¹ÓÃ@Autowired£¬½Ó¿ÚÊµÏÖÀà@Service×¢½â¼´¿É¡£
	//¶à¸öµÄÊ±ºòÊ¹ÓÃ@Resource(name="userService2")À´Ö¸¶¨µ÷ÄÇ¸ö×Ó½Ó¿Ú£¬½Ó¿ÚÊµÏÖÀà@Service("userService2")×¢½â¼´¿É¡£
	//@Autowired
	//private UserService userService;
	
	@Resource(name="userService")
	private UserService userService;
	
	
	@Resource(name="userService2")
	private UserService userService2;
	
	// http://localhost:8080/lyn-ssh/user/addUser.do
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "addUser")
	public String addUser(){
		System.out.println("**********findUser***********");
		JSONObject obj = new JSONObject();
		User user = new User("user", "123456", "ba保密", "1127447798@qq.com");
		userService.addUser(user);
		User user2 = new User("user2", "123456", "±£ÃÜ", "1127447798@qq.com");
		userService2.addUser(user2);
		
	
		return obj.toString();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "url")  
    public String addUser(User user){
		System.out.println(user.getEmail());
	
        return "userlist";
    }
}
