package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestManyToMany {

	public static void main(String[] args) {

		Course c = new Course();
		c.setCid(10);
		c.setCname("Java");
		
		Course c1 = new Course();
		c1.setCid(20);
		c1.setCname("SQL");
		
		ArrayList<Course> alCourse = new ArrayList<Course>();
		alCourse.add(c);
		alCourse.add(c1);
		
		Student s = new Student();
		s.setSid(3);
		s.setSname("Monika");
		s.setCourse(alCourse);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Course course = entityManager.find(Course.class, 10);
			System.out.println(course.getCid());
			System.out.println(course.getCname());
			System.out.println("Record Fetched");
			//entityManager.persist(s);
			//System.out.println("Record Saved");
			entityTransaction.commit();
			} catch(Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
			entityManager.close();
	}

}
