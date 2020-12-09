package com.vwits.demo;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
	public static void main(String[] args)   {
		
		Configuration cfg=new Configuration();
		
		try {
			
			SessionFactory sessionFactory=cfg.configure().buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Employee e=new Employee(19, "BBCd", 88000);
			
			Transaction tx=session.beginTransaction();
			
			//session.save(e);
			session.update(e);
			//session.delete(e);
			List l=session.createQuery("FROM Employee").list();
			System.out.println(l);
			
			
			tx.commit();
			session.close();
			sessionFactory.close();
			
			
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
