package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.SelectionQuery;

import com.model.Employees;
import com.util.HibernateUtil;

public class Application {
	
	
	public static void main(String[] args) {
		//singleInsert();
		//singleGet();
		//singleUpdate();
		//singleDelete();
		
		// till now we seen getting only one row data , by using HQL we will get all data.
		//insertHQL();
		//updateHQL();
		selectHQL();
	    
		
	}

	private static void singleInsert() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    Employees emp=new Employees("kiamsm",900.0);
	    session.beginTransaction();
	    session.persist(emp);
	    session.getTransaction().commit();
	    
	    System.out.println("inserted");
	    
	   
	}
	
	
	private static void singleGet() {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Employees emp=session.find(Employees.class,4);
	    System.out.println("get data from database"+emp);
	    
	   
	}
	private static void singleUpdate() {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Employees emp=session.find(Employees.class,4);
		emp.setSalary(77.667);
		session.beginTransaction();
		session.merge(emp);
		session.getTransaction().commit();
	    System.out.println("update data from database"+emp);
	    
	   
	}
  
	public static void singleDelete() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Employees emp=new Employees(5,"kiamsm",900.0);
		session.beginTransaction();
		session.remove(emp);
		session.getTransaction().commit();
		System.out.println("delete data from database");
	}
	
	public static void insertHQL() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("Insert into Employees(name,salary) values(?1,?2)");
		query.setParameter(1, "loppp");
		query.setParameter(2,90.8);
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("insert data to"
				+ " database");

	}
	public static void updateHQL() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		MutationQuery query = session.createMutationQuery("Update Employees set name=?1 where id=?2");
		query.setParameter(1, "loppp");
		query.setParameter(2,5);
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("update data to"
				+ " database");
	}
	
	public static void selectHQL() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		SelectionQuery<Employees> query = session.createSelectionQuery("FROM Employees",Employees.class);
		List<Employees> list = query.list();
		System.out.println(list);
	}
	

	
}
