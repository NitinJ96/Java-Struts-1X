package com.example.jdbc.JDBC.Tempalate;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ChatBotMapper implements RowMapper<ChatBotPojo>{

	@Override
	public ChatBotPojo mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ChatBotPojo chatbot = new ChatBotPojo();
		chatbot.setDAT006_USG_HIST_K(rs.getLong(1));
		chatbot.setDAT006_CHAT_HIST_O(rs.getBytes(6));
		return chatbot;
	}

}
