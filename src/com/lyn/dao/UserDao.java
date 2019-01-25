package com.lyn.dao;

import com.lyn.model.User;


public interface UserDao {

	public void addUser(User user);
	
	public User findUser(long id);
	
	public void upadteUser(User user);
}
