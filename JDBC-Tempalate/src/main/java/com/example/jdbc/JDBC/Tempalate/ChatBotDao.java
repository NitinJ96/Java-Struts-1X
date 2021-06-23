package com.example.jdbc.JDBC.Tempalate;

import java.util.List;

public interface ChatBotDao {
	int[][] batchUpdate(List<ChatBotPojo> chatbots, int batchSize);
	List<ChatBotPojo> getAllBotPojos();
}
