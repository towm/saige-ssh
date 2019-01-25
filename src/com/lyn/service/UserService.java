package com.lyn.service;

import com.lyn.model.User;

public interface UserService {

	public void addUser(User user);
	
	public User findUser(long id);
	
	public void upadteUser(User user);
}
