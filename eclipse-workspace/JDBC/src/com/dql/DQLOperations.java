package com.dql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.JdbcUtil;

public class DQLOperations {
	public static void main(String[] args)  {
		
		try {
			JdbcUtil jdbcutil=new JdbcUtil();
			Connection connection=jdbcutil.getConnection();
			Statement statement=connection.createStatement();
			String query="Select * from questions";
			ResultSet resultset=statement.executeQuery(query);
			while (resultset.next()) {
				int id=resultset.getInt(1);
				String name=resultset.getString(2);
				System.out.println(id+"\t"+name);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
