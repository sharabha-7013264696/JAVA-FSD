package com.ddl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.JdbcUtil;

public class Table {
	

	public static void main(String[] args)  {
		JdbcUtil jdbcutil=new JdbcUtil();
		try {
			
			Connection connection=jdbcutil.getConnection();
			Statement statement=connection.createStatement();
			String query="Create table users(username varchar(20), password varchar(20))";
			statement.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

