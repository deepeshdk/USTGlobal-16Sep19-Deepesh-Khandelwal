package com.ustglobal.crudoperationwithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.crudoperationwithhibernate.dto.StudentInfo;

public class SelectOperation {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		StudentInfo student = entityManager.find(StudentInfo.class, 2);
		System.out.println("Id is : "+student.getSid());
		System.out.println("Name is : "+student.getSname());
		System.out.println("DOB is : "+student.getDate_of_birth());

	}

}
