package State;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map1.emp;

public class StateDemo {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
		emp e1=new emp();
        e1.setEmpId(101);
        e1.setName("aman");
//      emp:transient state
      
        Session s =factory.openSession();
        Transaction t= s.beginTransaction();
        s.save(e1);
//      persistent
        e1.setName("juhi");
        t.commit();	
        s.close();
//        DEtached
        e1.setName("seed");
       	
		factory.close();
		
	}

}
