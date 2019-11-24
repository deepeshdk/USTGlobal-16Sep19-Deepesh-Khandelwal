package com.ustglobal.crudoperationwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.crudoperationwithhibernate.dto.StudentInfo;

public class InsertOperation {

	public static void main(String[] args) {

		StudentInfo student = new StudentInfo();
		student.setSid(4);
		student.setSname("Rahul");
		student.setDate_of_birth("08-05-1996");
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			System.out.println("Record Saved");
			entityTransaction.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
