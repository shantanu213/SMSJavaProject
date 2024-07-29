package com.QA;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class question {
	@Id
	private int qId;
	private String Question;

//	@OneToone
//    private Answer answer;

	@OneToMany(fetch = FetchType.EAGER)
	private List<Answer> answers;

	public question() {
		super();
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public question(int qId, String question, List<Answer> answers) {
		super();
		this.qId = qId;
		Question = question;
		this.answers = answers;
	}
}
