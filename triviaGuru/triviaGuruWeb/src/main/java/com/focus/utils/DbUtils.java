package com.focus.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.focus.entity.QuestionBean;

public class DbUtils {
	private static final Logger logger = Logger.getLogger(DbUtils.class.getName());

	private static Connection getConnection() {
		Connection connection = null;
		try {
			InitialContext cxt = new InitialContext();
			logger.info("------------------- starting getConnection ...");
			logger.info("------------------- context:".concat(cxt.toString()));
			DataSource ds = (DataSource) cxt.lookup("java:/comp/env/jdbc/postgres");
			logger.info("------------------- DataSource:".concat(ds.toString()));

			connection = ds.getConnection();
			logger.info("------------------- connection:".concat(connection.toString()));
		} catch (final Exception ex) {
			ex.printStackTrace();
			logger.info("------------------ exception message:".concat(ex.getMessage()));
		}
		return connection;

	}

	public static FacesMessage addQuestion(final QuestionBean questionq) {
		logger.info("starting addQuestion ...");
		Connection connection = getConnection();
		final String sqlInsert = "INSERT INTO questions (question, imageUrl, correctAnswerIndex, answerText, answer1, answer2, answer3, answer4, difficultyLevel, subject, timeStamp ) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		FacesMessage resultMessage = null;
		try {
			PreparedStatement pst = connection.prepareStatement(sqlInsert);
			pst.setString(1, questionq.getQuestion());
			pst.setString(2, questionq.getImageUrl());
			pst.setInt(3, questionq.getCorrectAnswerIndex());
			pst.setString(4, questionq.getAnswerText());
			logger.info(" { q.getAnswer1(), q.getAnswer2(),  q.getAnswer3(), q.getAnswer4() ");
			pst.setString(5, questionq.getAnswer1());
			pst.setString(6, questionq.getAnswer2());
			pst.setString(7, questionq.getAnswer3());
			pst.setString(8, questionq.getAnswer4());
			pst.setInt(9, questionq.getDifficultyLevel());
			pst.setString(10, questionq.getSubject());
			pst.setTimestamp(11, new Timestamp(System.currentTimeMillis()));
			logger.info(pst.toString());
			int row = pst.executeUpdate();
			resultMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "insert has succeeded.<br/>",
					String.valueOf(row).concat(" rows have been successfully inserted !"));

		} catch (Exception ex) {
			ex.printStackTrace();
			logger.warning(ex.getMessage());
			resultMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "insert has failed.<br/>", ex.getMessage().concat(" !"));

		}
		logger.info(resultMessage.getDetail() + " " + resultMessage.getDetail());
		return resultMessage;
	}
}
