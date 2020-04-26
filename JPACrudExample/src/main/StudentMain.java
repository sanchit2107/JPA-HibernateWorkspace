package main;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import bean.Student;
import config.MyFactory;
import dao.StudentDao;

public class StudentMain {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter ID"); int
		 * sid=sc.nextInt();
		 */
		 
		EntityManager em=MyFactory.getEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		/*
		 * Query
		 * q=em.createQuery("from Student s where s.marks between :low and :high");
		 * q.setParameter("low", l); q.setParameter("high", h);
		 */
		/*
		 * Query q=em.createQuery("delete from Student s where s.sid=:id");
		 * q.setParameter("id",sid); int rows=q.executeUpdate();
		 * System.out.println("Rows Deleted-->"+rows); tx.commit();
		 */
		
		/*
		 * List<Student> li=q.getResultList(); for(Student s:li) {
		 * System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.
		 * getMarks()); }
		 */
		
		Query q=em.createNamedQuery("getAllStudent");
		q.setParameter("n", "S%");
		List<Student> li=q.getResultList(); 
		for(Student s:li) {
			System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getMarks()); 
		}
	}

}






