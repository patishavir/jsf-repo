package oz.trivia.guru;

import java.io.Serializable;
import java.util.logging.Logger;

public class QuestionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(QuestionBean.class.getName());
	private int id;

	private String question = "how much is 2 + 2 ?";
	private String imageurl;
	private int correctanswerindex;
	private String answertext;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private int difficultylevel;
	private String subject;
	private String timestamp;
	private String language;

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

	public final String getAnswertext() {
		return answertext;
	}

	public final int getCorrectanswerindex() {
		return correctanswerindex;
	}

	public final int getDifficultylevel() {
		return difficultylevel;
	}

	public final int getId() {
		return id;
	}

	public final String getImageurl() {
		return imageurl;
	}

	public final String getLanguage() {
		return language;
	}

	public final String getQuestion() {
		return question;
	}

	public final String getSubject() {
		return subject;
	}

	public final String getTimestamp() {
		return timestamp;
	}

	public final void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public final void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public final void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public final void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public final void setAnswertext(String answertext) {
		this.answertext = answertext;
	}

	public final void setCorrectanswerindex(int correctanswerindex) {
		this.correctanswerindex = correctanswerindex;
	}

	public final void setDifficultylevel(int difficultylevel) {
		this.difficultylevel = difficultylevel;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public final void setLanguage(String language) {
		this.language = language;
	}

	public final void setQuestion(String question) {
		this.question = question;
	}

	public final void setSubject(String subject) {
		this.subject = subject;
	}

	public final void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}