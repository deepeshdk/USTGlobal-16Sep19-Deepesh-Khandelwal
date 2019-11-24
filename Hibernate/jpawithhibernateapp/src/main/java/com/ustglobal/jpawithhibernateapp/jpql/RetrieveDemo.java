package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class RetrieveDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ProductInfo";
		Query query = entityManager.createQuery(jpql);
		List<ProductInfo> list = query.getResultList();
		for(ProductInfo lists : list) {
			System.out.println("Id is : "+lists.getPid());		
			System.out.println("Name is : "+lists.getName());
			System.out.println("Quantity is : "+lists.getQuantity());
			System.out.println("-----------------");
		}
		entityManager.close();
		
	}

}
