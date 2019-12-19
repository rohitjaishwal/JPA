package com.dev.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.manytoone.EmpExperience;
import com.dev.onetoone.beans.EmpInfoBean;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		EmpInfoBean emp = new EmpInfoBean();
//		EmpInfoBean2 emp2 = new EmpInfoBean2();
		EmpExperience ex = new EmpExperience();
		EmpExperience ex1 = new EmpExperience();
		
		em.getTransaction().begin();
		
		emp.setId(3);
		emp.setName("Arya");
		
		ex.setExpid(5);
		ex.setCompany("TCS");
		ex.setPeriod("1.5 years");
		ex.setEib(emp);
		
		ex1.setExpid(6);
		ex1.setCompany("Symbiosis");
		ex1.setPeriod("1.5 years");
		ex1.setEib(emp);
		
		em.persist(ex);
		em.persist(ex1);
		em.getTransaction().commit();
		emf.close();
	}
}
