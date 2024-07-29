package pagination;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pack.PracticeHiber.employee;

public class HQLPagi 
{
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		org.hibernate.Session s = factory.openSession();
		org.hibernate.Transaction tx1 = s.beginTransaction();
		
		Query quer=s.createQuery("from employee");
		quer.setFirstResult(0);
		quer.setMaxResults(4);
		
		List <employee> list=quer.list();
		
		for(employee e:list)
		{
			System.out.println(e.getEmpid()+"  "+e.getEmpname());
		}
				
		s.close();		
		factory.close();
		
	}
}
