package com.durin.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	// MySQL Driver 6.0 이상 "com.mysql.cj.Driver";

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false";
	// MySQL 6.1 이상
	// "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&&serverTimezone=Asia/Seoul";

	private static final String USER = "durin93";
	private static final String PW = "durin93";

	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
