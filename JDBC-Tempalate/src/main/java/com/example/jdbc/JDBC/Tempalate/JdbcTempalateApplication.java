package com.example.jdbc.JDBC.Tempalate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JdbcTempalateApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JdbcTempalateApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ChatBotDao chatBotDao = context.getBean(ChatBotDao.class);
		
		System.out.println("List of data is:");
		List<ChatBotPojo> chatbots = chatBotDao.getAllBotPojos();
		
		
//		for (ChatBotPojo chatbot : chatBotDao.getAllBotPojos()) {
////			FileConversion(chatbot.getDAT006_USG_HIST_K(),chatbot.getDAT006_CHAT_HIST_O());
//			System.out.println(chatbot.getDAT006_USG_HIST_K()+"="+chatbot.getDAT006_CHAT_HIST_O());
//		}
		
		chatBotDao.batchUpdate(chatbots, 100);
		context.close();
	}
	
	public static void FileConversion(Long id, byte[] filebytes) {
		OutputStream targetFile;
		try {
			targetFile = new FileOutputStream(
					"C:\\Users\\BCP\\Desktop\\Java Program\\ChatBot DB\\ChatBot DB Connection\\JDBC Templete Conversion Files\\"
							+ String.valueOf(id) + ".txt");
			targetFile.write(filebytes); // write the array of bytes to file
			targetFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // define the output stream
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
