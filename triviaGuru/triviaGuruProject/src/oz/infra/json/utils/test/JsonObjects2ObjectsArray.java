package oz.infra.json.utils.test;

import com.fasterxml.jackson.databind.ObjectMapper;

import oz.trivia.guru.QuestionBean;

public class JsonObjects2ObjectsArray {
	public static void main(String args[]) {
		// String jsonStr = "[\"INDIA\", \"AUSTRALIA\", \"ENGLAND\", \"SOUTH AFRICA\",
		// \"WEST INDIES\"]";
		String jsonStr2 = "[{\"question\":\"what is the capital city of france\",\"correctanswerindex\":0,\"answertext\":\"Paris is the capital city of France\",\"subject\":\"Capital cities\",\"imageurl\":\"\",\"answers\":\"{Lyon,Avignon,Nice,Paris}\",\"difficultylevel\":1,\"id\":3,\"timestamp\":\"2023-04-01 12:24:56.418\"},{\"question\":\"what is the capital city of England\",\"correctanswerindex\":3,\"answertext\":\"London is the capital city of England\",\"subject\":\"Capital cities\",\"imageurl\":\"\",\"answers\":\"{Liverpool,Manchester,London,Plymouth}\",\"difficultylevel\":1,\"id\":4,\"timestamp\":\"2023-04-01 12:29:19.353\"},{\"question\":\"Who was the first prime minister of Israel ?\",\"correctanswerindex\":2,\"answertext\":\"David Ben Gurion\",\"subject\":\"Israeli history\",\"imageurl\":\"\",\"answers\":\"{\\\"Moshe Sharet\\\",\\\"David Ben Gurion\\\",\\\"Golda Meir\\\",\\\"Levi Eshcol\\\"}\",\"difficultylevel\":1,\"id\":5,\"timestamp\":\"2023-04-01 13:17:11.248\"},{\"question\":\"Who was the first Israel president?\",\"correctanswerindex\":1,\"answertext\":\"Chaim Weizmann\",\"subject\":\"Israeli history\",\"imageurl\":\"\",\"answers\":\"{\\\"Chaim Weizmann\\\",\\\"Albert Einstein\\\",\\\"Eliezer Kaplan\\\",\\\"Yitzhak Ben-Zvi\\\"}\",\"difficultylevel\":1,\"id\":6,\"timestamp\":\"2023-04-01 13:23:21.922\"},{\"question\":\"when did the six day war take place ?\",\"correctanswerindex\":0,\"answertext\":\"1967\",\"subject\":\"Israel history\",\"imageurl\":\"\",\"answers\":\"{1967,1948,1956,1973}\",\"difficultylevel\":1,\"id\":7,\"timestamp\":\"2023-04-01 15:54:42.073\"}]";

		String jsonStr3 = "{\"question\":\"what is the capital city of france\",\"correctanswerindex\":0,\"answertext\":\"Paris is the capital city of France\",\"subject\":\"Capital cities\",\"imageurl\":\"\",\"answers\":\"{\"\"}\",\"difficultylevel\":1,\"id\":3,\"timestamp\":\"2023-04-01 12:24:56.418\"}}";
		String jsonStr4 = "[{\"question\":\"how much is 2 + 2 ?\",\"correctanswerindex\":2,\"answertext\":\"3\",\"subject\":\"9\",\"imageurl\":\"1\",\"answer3\":\"6\",\"answer2\":\"5\",\"difficultylevel\":8,\"id\":12,\"answer4\":\"7\",\"answer1\":\"4\",\"timestamp\":\"2023-04-06 20:50:06.166\"},{\"question\":\"how much is 2 + 2 ?\",\"correctanswerindex\":2,\"answertext\":\"3\",\"subject\":\"9\",\"imageurl\":\"1\",\"answer3\":\"6\",\"answer2\":\"5\",\"difficultylevel\":8,\"id\":13,\"answer4\":\"7\",\"answer1\":\"4\",\"timestamp\":\"2023-04-06 20:50:51.368\"}]";
		try {
			final ObjectMapper objectMapper = new ObjectMapper();
			// QuestionBean [] mdls = objectMapper.readValue(jsonStr2, QuestionBean
			// [].class);

			QuestionBean[] questions = objectMapper.readValue(jsonStr4, QuestionBean[].class);
			System.out.println("Question 1 is " + questions[0].toString() + questions[0].getQuestion());
			System.out.println("Question 2 is " + questions[1].toString() + questions[1].getQuestion());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}