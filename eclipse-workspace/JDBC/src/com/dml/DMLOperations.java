package com.dml;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.JdbcUtil;

public class DMLOperations {

	public static void main(String[] args)  {
		JdbcUtil jdbcutil=new JdbcUtil();
		try {
			
			Connection connection=jdbcutil.getConnection();
			Statement statement=connection.createStatement();
			String query="Update questions set category='sohh' where id='1'";
			statement.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
