package com.dev.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dev.manytomany.TrainingInfo;
import com.dev.manytoone.EmpExperience;
import com.dev.onetoone.beans.EmpInfoBean;
import com.dev.onetoone.beans.EmpInfoBean2;

public class FinalRun {
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		List<EmpInfoBean> elist = new ArrayList<EmpInfoBean>();
		TrainingInfo ti1 = new TrainingInfo();
		TrainingInfo ti2 = new TrainingInfo();
		EmpInfoBean emp1 = new EmpInfoBean();
		EmpInfoBean emp2 = new EmpInfoBean();
		EmpInfoBean emp = new EmpInfoBean();
		EmpExperience ex = new EmpExperience();
		EmpExperience ex1 = new EmpExperience();
		EmpInfoBean2 emp3 = new EmpInfoBean2();
		
		em.getTransaction().begin();
		
		emp1.setId(6);
		emp1.setName("Ajit");
		
		emp2.setId(7);
		emp2.setName("Manisha");
		
		emp.setId(8);
		emp.setName("Vivian");
		
		emp3.setEid(12);
		emp3.setEname("Rahul");
		emp3.setEib(emp1);

		elist.add(emp1);
		elist.add(emp2);
		
		ti1.setTid(3);
		ti1.setTname("MERN Stack");
		ti1.setElist(elist);
		
		ti2.setTid(4);
		ti2.setTname(".Net FS");
		ti2.setElist(elist);
		
		
		ex.setExpid(7);
		ex.setCompany("TCS");
		ex.setPeriod("1.5 years");
		ex.setEib(emp);
		
		ex1.setExpid(8);
		ex1.setCompany("Symbiosis");
		ex1.setPeriod("1.5 years");
		ex1.setEib(emp);
		
		em.persist(emp3);
		
		em.persist(ex);
		em.persist(ex1);
		
		em.persist(ti1);
		em.persist(ti2);
		
		em.getTransaction().commit();
		emf.close();
	}
}
