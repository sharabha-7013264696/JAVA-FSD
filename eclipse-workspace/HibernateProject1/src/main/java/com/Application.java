package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employees;
import com.util.HibernateUtil;

public class Application {
	
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    Employees emp=new Employees("kiamsm",900.0);
	    session.beginTransaction();
	    session.persist(emp);
	    session.getTransaction().commit();
	    
	    System.out.println("inserted");
	    
	}

	
}
