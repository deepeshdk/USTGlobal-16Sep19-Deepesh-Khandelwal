package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToMany {

	public static void main(String[] args) {

		PencilBox pb = new PencilBox();
		pb.setBid(1);
		pb.setBname("Nataraj");
		
		Pencil p = new Pencil();
		p.setPid(10);
		p.setColor("Red");
		p.setPencilBox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(11);
		p1.setColor("Black");
		p1.setPencilBox(pb);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			/*
			 * entityManager.persist(p); entityManager.persist(p1); //For Uni-directional
			 * System.out.println("Record Saved");
			 */
			PencilBox pBox = entityManager.find(PencilBox.class, 1);   // For Bi-directional
			System.out.println("Pencil Id is : "+pBox.getPencil());
			System.out.println("Record fetched");
			entityTransaction.commit();
			} catch(Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
			entityManager.close();

	}

}
