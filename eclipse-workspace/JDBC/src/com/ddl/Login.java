package com.ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.JdbcUtil;

//By using statement we are getting SQLInjection due to concatination  while entering login details  where hackers are accessing the data
//so we are using prepared statement and gave "?" also
public class Login {
 public static void main(String[] args) throws SQLException {
	 System.out.println("enter username");
		Scanner sc=new Scanner(System.in);
		String usern=sc.nextLine();
		System.out.println("enter password");
		
		String passwo=sc.nextLine();
	 JdbcUtil jdbcutil=new JdbcUtil();
	 Connection connection=jdbcutil.getConnection();
	 String query="Select * from users where username=? and password=?";
	 PreparedStatement statement=connection.prepareStatement(query);
	 statement.setString(1, usern);
	 statement.setString(2, passwo);
	 ResultSet rs=statement.executeQuery();
	 if(rs.next()) {
		 System.out.println("loggedin");
	 }
	 else {
		 System.out.println("Wrong credentials");
	 }
	 
 }
}
