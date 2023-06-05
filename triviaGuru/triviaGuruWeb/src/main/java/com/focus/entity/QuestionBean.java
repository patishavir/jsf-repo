package com.focus.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.focus.utils.DbUtils;

@ManagedBean(name = "questionBean", eager = true)
@SessionScoped
public class QuestionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(QuestionBean.class.getName());
	private static final List<String> languages = Arrays.asList("HE", "EN");
	private static final List<String> subjects = Arrays.asList("ערים בישראל", "פוליטיקה ישראלית");

	private String question = "how much is 2 + 2 ?";
	private String imageUrl;
	private int correctAnswerIndex;
	private String answerText;
	private String answer1;
	private String answer2;

	private String answer3;
	private String answer4;
	private int difficultyLevel;

	private String subject;

	private String language;

	public void addQuestion() {
		logger.info("starting addQuestion ...");
		DbUtils.addQuestion(this);
	}

	public final String getAnswer1() {
		return answer1;
	}

	public final String getAnswer2() {
		return answer2;
	}

	public final String getAnswer3() {
		return answer3;
	}

	public final String getAnswer4() {
		return answer4;
	}

	public final String getAnswerText() {
		return answerText;
	}

	public final int getCorrectAnswerIndex() {
		return correctAnswerIndex;
	}

	public final int getDifficultyLevel() {
		return difficultyLevel;
	}

	public final String getImageUrl() {
		return imageUrl;
	}

	public final String getLanguage() {
		return language;
	}

	public final List<String> getLanguages() {
		return languages;
	}

	public final String getQuestion() {
		return question;
	}

	public final String getSubject() {
		return subject;
	}

	public final List<String> getSubjects() {
		return subjects;
	}

	public final void setAnswer1(String answer1) {
		System.out.println("answer1 set to:" + answer1);
		this.answer1 = answer1;
	}

	public final void setAnswer2(String answer2) {
		System.out.println("answer2 set to:" + answer2);
		this.answer2 = answer2;
	}

	public final void setAnswer3(String answer3) {
		System.out.println("answer3 set to:" + answer3);
		this.answer3 = answer3;
	}

	public final void setAnswer4(String answer4) {
		System.out.println("answer4 set to:" + answer4);
		this.answer4 = answer4;
	}

	public final void setAnswerText(String answerText) {
		System.out.println("answerText set to:" + answerText);
		this.answerText = answerText;
	}

	public final void setCorrectAnswerIndex(int correctAnswerIndex) {
		System.out.println("correctAnswerIndex set to:" + correctAnswerIndex);
		this.correctAnswerIndex = correctAnswerIndex;
	}

	public final void setDifficultyLevel(int difficultyLevel) {
		System.out.println("difficultyLevel set to:" + difficultyLevel);
		this.difficultyLevel = difficultyLevel;
	}

	public final void setImageUrl(String imageUrl) {
		System.out.println("imageUrl set to:" + imageUrl);
		this.imageUrl = imageUrl;
	}

	public final void setLanguage(String language) {
		System.out.println("language set to:" + language);
		this.language = language;
	}

	public final void setQuestion(String question) {
		System.out.println("question set to:" + question);
		this.question = question;
	}

	public final void setSubject(String subject) {
		System.out.println("subject set to:" + subject);
		this.subject = subject;
	}
}