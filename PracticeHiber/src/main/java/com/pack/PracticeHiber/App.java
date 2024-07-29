package com.pack.PracticeHiber;

import java.util.Date;

import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("project start");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

//		employee e1 = new employee();
//		e1.setEmpid(203);
//		e1.setEmpname("anuj");
//		e1.setPosition("devloper");
//		e1.setCity("nagpur");
//		
//		employee e2 = new employee();
//		e2.setEmpid(102);
//		e2.setEmpname("vikram");
//		e2.setPosition("devloper");
//		e2.setCity("nagpur");
//		
//		employee e3 = new employee();
//		e3.setEmpid(103);
//		e3.setEmpname("santosh");
//		e3.setPosition("hacker");
//		e3.setCity("mumbai");
//		
//		
//		employee e4 = new employee();
//		e4.setEmpid(104);
//		e4.setEmpname("durgesh");
//		e4.setPosition("tester");
//		e4.setCity("mumbai");
//		
//		employee e5 = new employee();
//		e5.setEmpid(105);
//		e5.setEmpname("priya");
//		e5.setPosition("devloper");
//		e5.setCity("nagpur");
//		
//		employee e6 = new employee();
//		e6.setEmpid(106);
//		e6.setEmpname("namita");
//		e6.setPosition("devloper");
//		e6.setCity("nagpur");
//		
//		employee e7 = new employee();
//		e7.setEmpid(107);
//		e7.setEmpname("rahul");
//		e7.setPosition("devloper");
//		e7.setCity("nagpur");
//		
//		employee e8 = new employee();
//		e8.setEmpid(108);
//		e8.setEmpname("prem");
//		e8.setPosition("devloper");
//		e8.setCity("nagpur");
//		
//		employee e9 = new employee();
//		e9.setEmpid(109);
//		e9.setEmpname("reddy");
//		e9.setPosition("devloper");
//		e9.setCity("nagpur");
//		
		address1 a2 = new address1();
		a2.setAddressId(103);
		a2.setStreet("ambazari");
		a2.setCity("nagpur1");
		a2.setZ(11.2);
		a2.setAddDate(new Date());
//		
//		address1 a3 = new address1();
//		a3.setAddressId(103);
//		a3.setStreet("ambazari");
//		a3.setCity("nagpur1");
//		a3.setZ(11.2);
//		a3.setAddDate(new Date());
//		
//		address1 a4 = new address1();
//		a4.setAddressId(103);
//		a4.setStreet("ambazari");
//		a4.setCity("nagpur1");
//		a4.setZ(11.2);
//		a4.setAddDate(new Date());
//		
//		address1 a5 = new address1();
//		a5.setAddressId(103);
//		a5.setStreet("ambazari");
//		a5.setCity("nagpur1");
//		a5.setZ(11.2);
//		a5.setAddDate(new Date());

		org.hibernate.Session session = factory.openSession();
		org.hibernate.Transaction tx1 = session.beginTransaction();
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		session.save(e4);
//		session.save(e5);
//		session.save(e6);
//		session.save(e7);
//		session.save(e8);
//		session.save(e9);
		
		session.save(a2);
		
		

		tx1.commit();
		session.close();

	}
}
