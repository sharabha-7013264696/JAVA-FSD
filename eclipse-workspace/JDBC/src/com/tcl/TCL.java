package com.tcl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.JdbcUtil;

public class TCL { 
	public static void main(String[] args)  {
		JdbcUtil jdbcutil=new JdbcUtil();
		try {
			Connection connection=jdbcutil.getConnection();
			connection.setAutoCommit(false);
			String query="Update questions set category=? where id=?";
			PreparedStatement statement=connection.prepareStatement(query);
			statement.setString(1, "ldddd");
			statement.setString(2, "3");
			statement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
