package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pack.PracticeHiber.employee;

public class HQL {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		org.hibernate.Session s = factory.openSession();

		String query = "from employee";

		Query q = s.createQuery(query);

		List<employee> list = q.list();

		for (employee e : list) {
			System.out.println(e.getEmpname() + " " + e.getPosition() + " " + e.getEmpid());
		}
		System.out.println("------------------------------");

		Transaction tx=s.beginTransaction();
//		Query q1=s.createQuery("delete from employee  where city='mumbai' and empid='107'");
//		int r=q1.executeUpdate();
//		System.out.println("deleted ");
//		System.out.println(r);

//	    update
//		Query q1=s.createQuery("update employee set city='delhi' where empname='anuj'");
//		int r=q1.executeUpdate();
//		System.out.println(r+"update ");
	
		Query q3=s.createQuery("select Question ,qId, Answer from question  as qId INNER JOIN qId.Answer ");
		int r=q3.executeUpdate();
		List<Object[]>list3=q3.getResultList();
		
		for(Object[] arr:list3)
		{
			System.out.println(Arrays.toString(arr));
		}
		
		
		tx.commit();

		s.close();
		factory.close();

	}

}
