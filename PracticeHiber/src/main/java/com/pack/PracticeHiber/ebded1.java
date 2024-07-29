package com.pack.PracticeHiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ebded1 
{

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
		employee e1=new employee();
		e1.setEmpid(10011);
		e1.setEmpname("prakash ");
		
		Trainig t1=new Trainig();
		t1.setSoftware("java");
		t1.setDuration("2 month");
		e1.setTre(t1);
		
		employee e2=new employee();
		e2.setEmpid(10012);
		e2.setEmpname("jayant ");
		
		Trainig t2=new Trainig();
		t2.setSoftware("python");
		t2.setDuration("1 month");
		e2.setTre(t2);
		
		org.hibernate.Session s = factory.openSession();
		org.hibernate.Transaction tx = s.beginTransaction();
		s.save(e1);
		s.save(e2);

		tx.commit();
		s.close();
		

	}

}
