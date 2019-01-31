package com.lyn.dao.impl;


import java.util.List;

import org.hibernate.Session;
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
	

	@SuppressWarnings("unchecked")
	public List<User> getUesrList(){
		Session s = this.sessionFactory.getCurrentSession();
		return (List<User>) s.createSQLQuery("select * FROM _user;").addEntity(User.class).list();
	}
}
