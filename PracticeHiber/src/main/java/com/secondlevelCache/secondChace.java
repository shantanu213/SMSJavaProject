package com.secondlevelCache;

import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.pack.PracticeHiber.employee;

import net.sf.ehcache.hibernate.EhCacheRegionFactory;

public class secondChace {

	public static void main(String[] args) {
		
		 
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		org.hibernate.Session s1 = factory.openSession();
		
		employee e1 = s1.get(employee.class, 101);
        System.out.println(e1.getPosition());
		s1.close();

		org.hibernate.Session s2 = factory.openSession();
		
		employee e2 = s2.get(employee.class, 101);
        System.out.println(e2.getEmpname());
		s2.close();
	}

}
