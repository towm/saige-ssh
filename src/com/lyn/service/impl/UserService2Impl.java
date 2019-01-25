package com.lyn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyn.dao.UserDao;
import com.lyn.model.User;
import com.lyn.service.UserService;

@Service("userService2")
public class UserService2Impl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(User user) {
		System.out.println("**********userService2.addUser***********");
		userDao.addUser(user);	
	}

	public User findUser(long id) {
		return userDao.findUser(id);
	}

	public void upadteUser(User user) {
		userDao.upadteUser(user);		
	}


}
