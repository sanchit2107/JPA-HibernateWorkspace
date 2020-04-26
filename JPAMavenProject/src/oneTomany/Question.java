package oneTomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "qTable1")
public class Question {
	@Id
	private int questionId;
	private String qName;
	private String postedBy;
	@OneToMany(mappedBy = "question",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Answer> answer;
	public Question() {}
	public Question(int questionId, String qName, String postedBy) {
		super();
		this.questionId = questionId;
		this.qName = qName;
		this.postedBy = postedBy;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	
}
