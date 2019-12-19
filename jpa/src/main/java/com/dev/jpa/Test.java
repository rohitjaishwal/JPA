package com.dev.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.manytomany.TrainingInfo;
import com.dev.onetoone.beans.EmpInfoBean;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		List<EmpInfoBean> elist = new ArrayList<EmpInfoBean>();
		TrainingInfo ti1 = new TrainingInfo();
		TrainingInfo ti2 = new TrainingInfo();
		EmpInfoBean emp1 = new EmpInfoBean();
		EmpInfoBean emp2 = new EmpInfoBean();
		
		em.getTransaction().begin();
		
		emp1.setId(4);
		emp1.setName("Vikram");
		
		emp2.setId(5);
		emp2.setName("Shanaya");
		
		elist.add(emp1);
		elist.add(emp2);
		
		ti1.setTid(1);
		ti1.setTname("JavaFS");
		ti1.setElist(elist);
		
		ti2.setTid(2);
		ti2.setTname("MEAN Stack");
		ti2.setElist(elist);
		
		em.persist(ti1);
		em.persist(ti2);
		
		em.getTransaction().commit();
		emf.close();
	}
}
