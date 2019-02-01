package com.lyn.service;

import java.util.List;

import com.lyn.model.User;

public interface UserService {

	public void addUser(User user);
	
	public User findUser(long id);
	
	public void upadteUser(User user);
	
	public void delUser(User user);
	
	public List<User> getUesrList();
}
