package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import bean.Student;
import config.MyFactory;

public class StudentDao {
	EntityManager em=MyFactory.getEntityManager();
	public String createStudent(Student s) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(s);
		tx.commit();
		return "Student Saved!!!!";		
		
	}
	public Student getStudent(int sid) {
		Student stu=em.find(Student.class, sid);	
		return stu;
	}
	public String delStudent(int sid) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Student stu=em.find(Student.class, sid);
		em.remove(stu);
		tx.commit();
		return "Student Deleted!!!!!!!!!";
		
	}
	public String updateStudentAge(int sid,int age,String name) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Student stu=em.find(Student.class, sid);
		stu.setName(name);
		em.persist(stu);
		stu.setAge(age);
		tx.commit();
		return "Student Updated!!!!!!!!!";
			
	}
	public List<Student> getAllStudent() {
		Query q=em.createQuery("from Student s");
		List<Student> li=q.getResultList();
		return li;
	}
	public List<Student> getStudentByMarks() {
		Query q=em.createQuery("from Student s where s.marks>60");
		List<Student> li=q.getResultList();
		return li;
	}
}




