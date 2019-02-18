package com.lyn.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lyn.dao.PTaskDao;
import com.lyn.model.PTask;

/**
 * @author    Yaning Liu
 *
 * @filename  PTaskDaoImpl.java
 *
 * @date      2019-02-16
 *
 */

@Repository
public class PTaskDaoImpl implements PTaskDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addPTask(PTask ptask) {
		sessionFactory.getCurrentSession().save(ptask);
	}

	public PTask findPTask(long id) {
		
		return (PTask)sessionFactory.getCurrentSession().get(PTask.class, id);
	}
	
	public void delPTask(PTask ptask) {
		sessionFactory.getCurrentSession().delete(ptask);
	}
	
	public void upadtePTask(PTask ptask) {
		  Session session = sessionFactory.openSession();
		    Transaction tx = session.beginTransaction();

		    //update/insert operations here

		    session.update(ptask);

		    tx.commit();

		    session.close();
		
	}
	


	/* (non-Javadoc)
	 * @see com.lyn.dao.PTaskDao#getPTaskList()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PTask> getPTaskList() {
		Session s = this.sessionFactory.getCurrentSession();
		return (List<PTask>) s.createSQLQuery("select * FROM _ptask;").addEntity(PTask.class).list();
		
	}

	/* (non-Javadoc)
	 * @see com.lyn.dao.PTaskDao#getSubPTaskList()
	 */
	@Override
	public List<PTask> getSubPTaskList(int i) {
		Session s = this.sessionFactory.getCurrentSession();
		
		return (List<PTask>) s.createSQLQuery("select * FROM _ptask where _listid = "+String.valueOf(i)+";").addEntity(PTask.class).list();
		
	}
}
