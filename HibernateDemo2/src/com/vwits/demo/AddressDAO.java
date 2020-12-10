package com.vwits.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddressDAO {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;

	public AddressDAO() {
		

	}

	public void insert(Address a) {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();

		tx = session.beginTransaction();

		session.save(a);

		tx.commit();
		session.close();
		factory.close();
	}

	public void delete(Address a) {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();

		tx = session.beginTransaction();

		session.delete(a);

		tx.commit();
		session.close();
		factory.close();
	}

	public void update(Address a) {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();

		tx = session.beginTransaction();

		session.update(a);

		tx.commit();
		session.close();
		factory.close();
	}

	public List getAll() {
		cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		session = factory.openSession();

		tx = session.beginTransaction();

		List l = session.createQuery("From Address").list();

		tx.commit();
		session.close();
		factory.close();
		return l;
	}

}
