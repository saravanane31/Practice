package com.saravanan;

public class QuestionDetails {
	private String examName;
	private Long questionId;
	private String question;
	private Integer notAnsweredCount;
	private Integer wronglyAnsweredCount;
	
	public QuestionDetails() {
		super();
	}
	public QuestionDetails(String examName,Long questionId, String question, Integer notAnsweredCount, Integer wronglyAnsweredCount) {
		super();
		this.examName = examName;
		this.questionId = questionId;
		this.question = question;
		this.notAnsweredCount = notAnsweredCount;
		this.wronglyAnsweredCount = wronglyAnsweredCount;
	}
	public Integer getWronglyAnsweredCount() {
		return wronglyAnsweredCount;
	}
	public void setWronglyAnsweredCount(Integer wronglyAnsweredCount) {
		this.wronglyAnsweredCount = wronglyAnsweredCount;
	}
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Integer getCount() {
		return notAnsweredCount;
	}
	public void setCount(Integer count) {
		this.notAnsweredCount = count;
	}
}
