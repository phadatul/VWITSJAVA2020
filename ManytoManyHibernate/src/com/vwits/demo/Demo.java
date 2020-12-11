package com.vwits.demo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Address a1=new Address(9, "Nagpur", 123456);
		Address a2=new Address(10, "Pune", 654321);
		Address a3=new Address(11, "Mumbai", 567890);
		Address a4=new Address(12, "Delhi", 178765);
		
		Set<Address> s1=new HashSet<Address>();
		s1.add(a1);
		s1.add(a4);
		

		Set<Address> s2=new HashSet<Address>();
		s2.add(a3);
		s2.add(a2);
		Employee e1=new Employee(8, "MNO", 78000, s1);
		Employee e2=new Employee(55, "ABC", 33000, s1);
		Employee e3=new Employee(3, "PQR", 56000, s2);
		
		
		session.save(e1);
		
		session.save(e2);
		
		session.save(e3);
		tx.commit();
		
		session.close();
		factory.close();
	}

}
