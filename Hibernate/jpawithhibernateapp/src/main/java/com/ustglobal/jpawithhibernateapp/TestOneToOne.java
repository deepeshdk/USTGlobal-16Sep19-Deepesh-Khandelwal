package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(5);
		vc.setVname("Deepesh");
		Person p = new Person();
		p.setPid(1);
		p.setName("Deepesh");
		p.setVoterCard(vc);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class, 5);   // For Bi directional
			System.out.println("Person Id is : "+vCard.getPerson().getPid());
			System.out.println("Person Name is : "+vCard.getPerson().getName());
			System.out.println("Record fetched");

			//entityManager.persist(p);        For unidirectional
			//System.out.println("Record Saved");
			entityTransaction.commit();
			} catch(Exception e) {
				e.printStackTrace();
				entityTransaction.rollback();
			}
			entityManager.close();
		}
 }


