package com.mapping.xml;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		person p=new person(23,"anuj","delhi","12345647");
		
		org.hibernate.Session s = factory.openSession();
		org.hibernate.Transaction tx1 = s.beginTransaction();
		s.save(p);
		s.close();
		tx1.commit();
		
	}

}
