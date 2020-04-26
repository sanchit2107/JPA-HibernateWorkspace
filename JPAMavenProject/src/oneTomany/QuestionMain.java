package oneTomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class QuestionMain {

	public static void main(String[] args) {
		QuestionDao qd=new QuestionDaoImpl();
		Question q=new Question(102, "What is Servlet", "Urvashi");
		List<Answer> li=new ArrayList<Answer>();
		li.add(new Answer("Sevlet is Server Side PL", q));
		li.add(new Answer("Sevlet is Multithreded", q));
		li.add(new Answer("Sevlet runs in web container", q));
		q.setAnswer(li);
		
		String result=qd.createQuestion(q);
		System.out.println(result);
		
		 
	}

}
