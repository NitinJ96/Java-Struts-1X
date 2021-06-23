package com.example.jdbc.JDBC.Tempalate;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.stereotype.Component;

@Component
public class ChatBotDaoImpl implements ChatBotDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ChatBotDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public List<ChatBotPojo> getAllBotPojos() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from dbo.MDAT006_USG_HIST", new ChatBotMapper());
	}

	@Override
	public int[][] batchUpdate(List<ChatBotPojo> chatbots, int batchSize) {
		// TODO Auto-generated method stub
		int[][] updateCounts = jdbcTemplate.batchUpdate(
				"Update MDAT006_USG_HIST set DAT006_STR_RSPND_X=(?) where DAT006_USG_HIST_K= (?)",
                chatbots,
                batchSize,
                new ParameterizedPreparedStatementSetter<ChatBotPojo>() {
                    public void setValues(PreparedStatement ps, ChatBotPojo chatbot) 
                        throws SQLException {
                        try {
							ps.setString(1, readFileAsString("C:\\Users\\BCP\\Desktop\\Java Program\\ChatBot DB\\ChatBot DB Connection\\Binary Files\\"
											+chatbot.getDAT006_USG_HIST_K()+".txt"));
							ps.setLong(2, chatbot.getDAT006_USG_HIST_K());
							System.out.println(chatbot.getDAT006_USG_HIST_K()+" Updated" + 
									readFileAsString("C:\\Users\\BCP\\Desktop\\Java Program\\ChatBot DB\\ChatBot DB Connection\\Binary Files\\"
											+chatbot.getDAT006_USG_HIST_K()+".txt"));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                    }
                });
        return updateCounts;
	}
	
	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
//	    data = new String(Files.readAllBytes(Paths.get(fileName)));  
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			data = data + sc.nextLine() + "\n";
		}
		sc.close();
		return data;
	}

}
