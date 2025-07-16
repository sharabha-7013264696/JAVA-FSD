package com.ddl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.util.JdbcUtil;

public class Signup {
	public static void main(String[] args)  {
		JdbcUtil jdbcutil=new JdbcUtil();
		try {
			System.out.println("enter username");
			Scanner sc=new Scanner(System.in);
			String usern=sc.nextLine();
			System.out.println("enter password");
			
			String passwo=sc.nextLine();
			Connection connection=jdbcutil.getConnection();
			Statement statement=connection.createStatement();
			String query="Insert into users values ('"+usern+"','"+passwo+"')";
			statement.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
