package sqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.pack.PracticeHiber.employee;

public class HiberSql {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		org.hibernate.Session s = factory.openSession();
		
		String q=" select * from employee";
		
		NativeQuery n=s.createSQLQuery(q);
		
		
		List<Object[]> list=n.list();
		
		
		for(Object[]employee :list)
		{
			System.out.println(Arrays.toString(employee));
		}
		
		s.close();
		factory.close();

	}

}
