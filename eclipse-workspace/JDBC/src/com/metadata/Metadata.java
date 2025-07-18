package com.metadata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.util.JdbcUtil;

public class Metadata {
	public static void main(String[] args) {
		JdbcUtil jdbcutil=new JdbcUtil();
		
		try {
			Connection connection = jdbcutil.getConnection();
			String query="Select * from questions";
			PreparedStatement statement=connection.prepareStatement(query);
			ResultSet rs=statement.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			int count=metaData.getColumnCount();
			for(int i=1;i<=count;i++) {
				System.out.print(metaData.getColumnName(i));
				System.out.print("/t");
			}
			System.out.println();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"/t"+rs.getString(2));
			}
			System.out.println(metaData.getColumnTypeName(1));
			System.out.println(metaData.getTableName(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
