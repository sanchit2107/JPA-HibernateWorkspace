package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		
		  EntityTransaction tx=em.getTransaction(); 
		  tx.begin(); 
		/*
		 * Address add=new Address(104, "Delhi", "India",110010); Employee e=new
		 * Employee("Prashant",62000, add); add.setEmployee(e); em.persist(e);
		 */
		  Employee e=em.find(Employee.class, 17);
		  System.out.println(e.getName()+"\t"+e.getAddress().getCity());
		  em.remove(e);
		  tx.commit();		
		  System.out.println("Employee Created!!!!!");
		
		

	}

}
