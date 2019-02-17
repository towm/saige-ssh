package com.lyn.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lyn.dao.TaskDao;
import com.lyn.model.Task;

/**
 * @author    Yaning Liu
 *
 * @filename  TaskDaoImpl.java
 *
 * @date      2019-02-16
 *
 */

@Repository
public class TaskDaoImpl implements TaskDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addTask(Task task) {
		sessionFactory.getCurrentSession().save(task);
	}

	public Task findTask(long id) {
		
		return (Task)sessionFactory.getCurrentSession().get(Task.class, id);
	}
	
	public void delTask(Task task) {
		sessionFactory.getCurrentSession().delete(task);
	}
	
	public void upadteTask(Task task) {
		  Session session = sessionFactory.openSession();
		    Transaction tx = session.beginTransaction();

		    //update/insert operations here

		    session.update(task);

		    tx.commit();

		    session.close();
		
	}
	


	/* (non-Javadoc)
	 * @see com.lyn.dao.TaskDao#getTaskList()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Task> getTaskList() {
		Session s = this.sessionFactory.getCurrentSession();
		return (List<Task>) s.createSQLQuery("select * FROM _task;").addEntity(Task.class).list();
		
	}
}
