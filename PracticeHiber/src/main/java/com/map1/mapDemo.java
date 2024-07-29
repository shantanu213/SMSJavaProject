package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mapDemo {

	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		emp e1=new emp();
		emp e2=new emp();
		
		e1.setEmpId(100);
		e1.setName("raju");
		
		e2.setEmpId(101);
		e2.setName("sallu");
		
		project p1=new project();
		project p2=new project();
		
		p1.setPid(201);
	    p1.setName("library project");
	    
	    p2.setPid(202);
	    p2.setName("chatboat");
	    
	    List<emp> l1=new ArrayList<emp>();
	    List<project> A2=new ArrayList<project>();
		l1.add(e1);
		l1.add(e2);
		
		A2.add(p1);
		A2.add(p2);
		
		e1.setProjects(A2);
		p2.setEmps(l1);
		
		org.hibernate.Session s = factory.openSession();
		org.hibernate.Transaction tx1 = s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);

		tx1.commit();
		s.close();
		factory .close();
	}

}
