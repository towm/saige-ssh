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

import com.lyn.model.Task;
import com.lyn.model.User;
import com.lyn.service.UserService;
import com.lyn.service.TaskService;
/**
 * @author    Yaning Liu
 *
 * @filename  ManagerController.java
 *
 * @date      2019-03-01
 *
 */

@Controller
@RequestMapping("/jsp/manager")
public class ManagerController {
	
	@Resource(name="userService")
	private UserService userService;
	
	@Resource(name="taskService")
	private TaskService taskService;
    
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET,value="index.do")
	ModelAndView indexHandler() {
		ModelAndView model = new ModelAndView("forward:index.jsp");
		return model;
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET,value="insert")
	ModelAndView insertHandler() {
		ModelAndView model = new ModelAndView("forward:insert_task.jsp");
		return model;
	}
	
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "taskList")  
    public ModelAndView taskList(Task task){
		ModelAndView model = new ModelAndView("forward:task_list.jsp");
		List<Task> tasks = taskService.getTaskList();
	    model.addObject("tasks",tasks);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "userList")  
    public ModelAndView userList(User user){
		ModelAndView model = new ModelAndView("forward:user_manage.jsp");
		List<User> users = userService.getUserList();
	    model.addObject("users",users);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "taskInsert")  
    public ModelAndView taskInsert(User user){
		ModelAndView model = new ModelAndView("forward:insert_task.jsp");
		List<User> users = userService.getUserList();
	    model.addObject("users",users);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "addUser")  
    public ModelAndView addUser2(User user){
		ModelAndView model = new ModelAndView("redirect:userList.do");
		this.userService.addUser(user);
	    model.addObject("user",user);
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "delUser")  
    public ModelAndView delUser(int id){
		ModelAndView model = new ModelAndView("forward:userList.do");
		this.userService.delUser(this.userService.findUser(id));
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "getUser")  
    public ModelAndView getUser(int id){
		ModelAndView model = new ModelAndView("forward:user_update.jsp");
		model.addObject(this.userService.findUser(id));
        return model;
    }
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "updateTaskStatus")  
    public ModelAndView updateTask2(int id, int status){
		Task t = this.taskService.findTask(id);
		switch(status) {
		case 0:t.setProgress("Not Started");break;
		case 2:t.setProgress("In Progress 50%");break;
		case 3:t.setProgress("In Progress 80%");break;
		case 4:t.setProgress("Completed");break;
		case 1:t.setProgress("In Progress 20%");break;
		}
		ModelAndView model = new ModelAndView("redirect:taskList.do");
		this.taskService.upadteTask(t);
        return model;
    }
}
