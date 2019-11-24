package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class ReAttaching {

	public static void main(String[] args) {
		
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		ProductInfo product = entityManager.find(ProductInfo.class, 101);
		boolean check = entityManager.contains(product);
		System.out.println(check);
		entityManager.detach(product);
		boolean check1 = entityManager.contains(product);
		System.out.println(check1);
		ProductInfo product1 = entityManager.merge(product);
		product1.setName("Pen");
		System.out.println("Record Updated");
		entityTransaction.commit();
	} catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
 }
}