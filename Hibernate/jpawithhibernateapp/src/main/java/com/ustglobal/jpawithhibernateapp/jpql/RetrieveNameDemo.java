package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class RetrieveNameDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "Select pname from ProductInfo";
		Query query = entityManager.createQuery(jpql);
		List<String> list = query.getResultList();
		for(String lists : list) {
			System.out.println("Name is : "+lists);
			System.out.println("-----------------");
		}
		entityManager.close();
		
	}
}
