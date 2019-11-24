package com.ustglobal.crudoperationwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.crudoperationwithhibernate.dto.StudentInfo;

public class UpdateOperation {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			StudentInfo student = entityManager.find(StudentInfo.class, 4);
			student.setSname("Vishal");
			student.setDate_of_birth("14-05-1997");
			System.out.println("Record Updated");
			entityTransaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
