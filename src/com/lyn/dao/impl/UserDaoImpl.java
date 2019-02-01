package com.lyn.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
	
	public void delUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}
	
	public void upadteUser(User user) {
		  Session session = sessionFactory.openSession();
		    Transaction tx = session.beginTransaction();

		    //update/insert operations here

		    session.update(user);

		    tx.commit();

		    session.close();
		
	}
	

	@SuppressWarnings("unchecked")
	public List<User> getUesrList(){
		Session s = this.sessionFactory.getCurrentSession();
		return (List<User>) s.createSQLQuery("select * FROM _user;").addEntity(User.class).list();
	}
}
