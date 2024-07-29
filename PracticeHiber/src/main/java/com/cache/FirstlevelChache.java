package com.cache;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pack.PracticeHiber.employee;

public class FirstlevelChache {

	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		org.hibernate.Session s = factory.openSession();
		
		
		employee e1=s.get(employee.class,101);
		System.out.println(e1.getCity());
		
		System.out.println("working on something");
		
		employee e2=s.get(employee.class,101);
		System.out.println(e2.getEmpname());
		
	
		s.close();
	}

}

