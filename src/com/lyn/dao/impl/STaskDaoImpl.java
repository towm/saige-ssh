package com.lyn.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lyn.dao.STaskDao;
import com.lyn.model.Product;
import com.lyn.model.STask;

/**
 * @author    Yaning Liu
 *
 * @filename  STaskDaoImpl.java
 *
 * @date      2019-02-22
 *
 */

@Repository
public class STaskDaoImpl implements STaskDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addSTask(STask stask) {
		sessionFactory.getCurrentSession().save(stask);
	}

	public STask findSTask(long id) {
		
		return (STask)sessionFactory.getCurrentSession().get(STask.class, id);
	}
	
	public void delSTask(STask stask) {
		sessionFactory.getCurrentSession().delete(stask);
	}
	
	public void upadteSTask(STask stask) {
		  Session session = sessionFactory.openSession();
		    Transaction tx = session.beginTransaction();

		    //update/insert operations here

		    session.update(stask);

		    tx.commit();

		    session.close();
		
	}
	


	/* (non-Javadoc)
	 * @see com.lyn.dao.STaskDao#getSTaskList()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<STask> getSTaskList() {
		Session s = this.sessionFactory.getCurrentSession();
		return (List<STask>) s.createSQLQuery("select * FROM _stask;").addEntity(STask.class).list();
		
	}

	/* (non-Javadoc)
	 * @see com.lyn.dao.STaskDao#getSubSTaskList()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<STask> getSubSTaskList(int i) {
		Session s = this.sessionFactory.getCurrentSession();
		
		return (List<STask>) s.createSQLQuery("select * FROM _stask where _listid = "+String.valueOf(i)+";").addEntity(STask.class).list();
		
	}

	/* (non-Javadoc)
	 * @see com.lyn.dao.STaskDao#upadteStock(com.lyn.model.STask, com.lyn.model.Product)
	 */
	@Override
	public void upadteStock(int id, int quality) {
		 Session session = sessionFactory.openSession();
		    Transaction tx = session.beginTransaction();
		    
		    Product p = (Product)sessionFactory.getCurrentSession().get(Product.class, id);
		    //update/insert operations here
		    p.setQuality(p.getQuality()+quality);
		    session.update(p);

		    tx.commit();

		    session.close();
		
	}
}
