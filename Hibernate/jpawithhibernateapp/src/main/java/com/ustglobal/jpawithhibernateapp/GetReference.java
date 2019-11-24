package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class GetReference {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();

		//ProductInfo product = entityManager.getReference(ProductInfo.class, 104); //EntityNotFoundException

		 //ProductInfo product = entityManager.find(ProductInfo.class, 104); //NullPointerException
		 ProductInfo product = entityManager.find(ProductInfo.class, 101);

		System.out.println(product.getClass());
		
		  System.out.println("Id is : "+product.getPid());
		  System.out.println("Name is : "+product.getName());
		  System.out.println("Quantity is : "+product.getQuantity());
		 

		entityManager.close();
	}

}
