package com.QA;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class map {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		question q1 = new question();
		q1.setqId(5);
		q1.setQuestion("what is python");

		Answer a1 = new Answer();
		a1.setAnswerID(6);
		a1.setAnswer("python is a programing language");

		Answer a2 = new Answer();
		a1.setAnswerID(7);
		a1.setAnswer("python is used to create softwear");

		List<Answer> l = new ArrayList<Answer>();
		l.add(a1);
		l.add(a2);
		q1.setAnswers(l);

		org.hibernate.Session s = factory.openSession();
		org.hibernate.Transaction tx1 = s.beginTransaction();
		s.save(q1);
		s.save(a1);
		s.save(a2);

		tx1.commit();

		question Q=s.get(question.class,5);
		System.out.println(Q.getQuestion());
		System.out.println(Q.getqId());
		
		System.out.println(Q.getAnswers().size());
		
		
		
		s.close(); 

	}

}
