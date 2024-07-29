package com.pack.PracticeHiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fethcing {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		org.hibernate.Session session = factory.openSession();

		employee e1 = session.get(employee.class, 108);
		System.out.println(e1.getEmpname());

		address1 a1 = session.load(address1.class, 5);
		System.out.println(a1.getCity());

		session.close();

	}

}
