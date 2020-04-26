package oneTomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import config.MyFactory;

public class QuestionDaoImpl implements QuestionDao {
	EntityManager em=MyFactory.getEntityManager();
	@Override
	public String createQuestion(Question q) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(q);
		tx.commit();
		return "Question Created!!!!!!!";
	}

	@Override
	public Question getQuestion(int qid) {
		Question q=em.find(Question.class, qid);
		return q;
	}	
}
