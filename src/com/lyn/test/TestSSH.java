package com.lyn.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyn.model.User;


public class TestSSH{

	private ApplicationContext ctx = null;
	
	@Test
	public void testDataSource(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("应用上下文-----"+ctx+"----");
		DataSource dataSource = ctx.getBean(DataSource.class);
		try {
			System.out.println("数据源：-----"+dataSource.getConnection().toString()+"-----");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SessionFactory sessionFactory = ctx.getBean(SessionFactory.class);
		System.out.println("sessionFactory:____"+sessionFactory+"_______sessionFactory");
		Session session = sessionFactory.openSession();
		session.close();
	}
	
}
