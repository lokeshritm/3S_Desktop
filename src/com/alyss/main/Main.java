package com.alyss.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {
	public static void main(String[] args) {
		Student student=new Student();
		student.setName("Alyss Edu");
		
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		
		student=(Student) session.get(Student.class, 1);
		System.out.print("Studnet Object having studnet name as: " +student.getName());
		
		student.setName("Alyss EduSolutions Pvt. Ltd:");
		session.update(student);
//		session.save(student);
		session.getTransaction().commit();
		session.close();
		
	}
}
