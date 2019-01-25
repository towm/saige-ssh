package com.lyn.dao.impl;


/**
 * @author    Yaning Liu
 *
 * @filename  ProductDaoImpl.java
 *
 * @date      2019-01-25
 *
 */
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lyn.dao.ProductDao;
import com.lyn.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(Product product) {
		this.sessionFactory.getCurrentSession().save(product);
	}
	
	public Product findById(int id) {
		return (Product)this.sessionFactory.getCurrentSession().get(Product.class, id);
	}
	
	public List<Product> findByName(String name) {
		 String hql = "from _product where 1=1";
	        if(name!=null&&!("").equals(name)){
	            hql=hql+" and _name='"+name+"'";
	        }
	        Query query = sessionFactory.getCurrentSession().createQuery(hql);
	        List<Product> list = (List<Product>)query.list();
	        return  list;

	}

	/* (non-Javadoc)
	 * @see com.lyn.dao.ProductDao#update(com.lyn.model.Product)
	 */
	@Override
	public void update(Product product) {
		sessionFactory.getCurrentSession().update(product);
		
	}
}
