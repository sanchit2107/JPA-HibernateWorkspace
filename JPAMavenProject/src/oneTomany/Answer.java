package oneTomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "atable1")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ansId;
	private String answerName;
	@ManyToOne
	@JoinColumn(name = "questionId")
	private Question question;
	public Answer() {}
	public Answer(String answerName, Question question) {
		super();
		this.answerName = answerName;
		this.question=question;
	}
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	
}
