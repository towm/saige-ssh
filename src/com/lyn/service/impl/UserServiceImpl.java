package com.lyn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyn.dao.UserDao;
import com.lyn.model.User;
import com.lyn.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(User user) {
		System.out.println("**********UserService.addUser***********");
		userDao.addUser(user);
	}

	public User findUser(long id) {
		return userDao.findUser(id);
	}

	public void upadteUser(User user) {
		userDao.upadteUser(user);		
	}
    
	public void delUser(User user) {
		userDao.delUser(user);
	}
	
	public List<User> getUserList(){
		return this.userDao.getUserList();
	}


}
