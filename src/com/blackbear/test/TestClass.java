package com.blackbear.test;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.blackbear.entity.UserDomain;

public class TestClass {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	private ApplicationContext context = null;
	
	@Test
	public void dataSource() throws SQLException{
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml")); 
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DataSource data = context.getBean(DataSource.class);
		
		SessionFactory sessionFactory = context.getBean(SessionFactory.class);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
//		PicDomain pic = new PicDomain("www.baidu.com");
//		session.save(pic);
		
		UserDomain user = new UserDomain("段若瑄", 25);
		session.save(user);
		
		tx.commit();
		session.close();
	}
}
