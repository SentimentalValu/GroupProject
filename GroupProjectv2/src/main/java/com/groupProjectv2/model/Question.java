/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupProjectv2.model;

/**
 *
 * @author jackf
 */

public class Question {
	private int QuestionNo;
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private int CorrectAnswer;
	
	@Override
	public String toString() {
		return "Question [QuestionNo=" + QuestionNo + ", Question=" + Question + ", Option1=" + Option1 + ", Option2="
				+ Option2 + ", Option3=" + Option3 + ", CorrectAnswer=" + CorrectAnswer + "]";
	}

	public int getQuestionNo() {
		return QuestionNo;
	}

	public void setQuestionNo(int questionNo) {
		QuestionNo = questionNo;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String option1) {
		Option1 = option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String option2) {
		Option2 = option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String option3) {
		Option3 = option3;
	}

	public int getCorrectAnswer() {
		return CorrectAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		CorrectAnswer = correctAnswer;
	}
	
	
}

