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
	
	//对UserService接口，当只有一个实现类继承接口时，可以使用@Autowired，接口实现类@Service注解即可。
	//多个的时候使用@Resource(name="userService2")来指定调那个子接口，接口实现类@Service("userService2")注解即可。
	//@Autowired
	//private UserService userService;
	
	@Resource(name="userService")
	private UserService userService;
	
	
	@Resource(name="userService2")
	private UserService userService2;
	
	//测试URL：http://localhost:8080/sas1.1/user/addUser.do
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "addUser")
	public String addUser(){
		System.out.println("**********findUser***********");
		JSONObject obj = new JSONObject();
		User user = new User("user", "123456", "保密", "1127447798@qq.com");
		userService.addUser(user);
		User user2 = new User("user2", "123456", "保密", "1127447798@qq.com");
		userService2.addUser(user2);
		return obj.toString();
	}
}
