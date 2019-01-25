package com.lyn.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lyn.dao.UserDao;
import com.lyn.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public User findUser(long id) {
		
		return (User)sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void upadteUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}
	
	
}
