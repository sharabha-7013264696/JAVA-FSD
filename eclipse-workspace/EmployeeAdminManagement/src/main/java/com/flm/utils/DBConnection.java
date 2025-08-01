package com.flm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
 public Connection connection=null;
 public  Connection getConnection() throws SQLException, ClassNotFoundException {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 if(connection==null) {
		 connection=DriverManager.getConnection(Constants.url,Constants.username,Constants.password);
	 }
	 return connection;
 }

}
