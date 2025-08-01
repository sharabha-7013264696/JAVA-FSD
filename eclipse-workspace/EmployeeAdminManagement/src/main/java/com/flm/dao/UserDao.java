package com.flm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

import com.flm.model.User;
import com.flm.utils.Constants;
import com.flm.utils.DBConnection;

public class UserDao {
	public void saveUser(User user) {
		Connection connection;
		DBConnection dbconnection=new DBConnection();
		try {
			connection = dbconnection.getConnection();
			PreparedStatement statement=connection.prepareStatement(Constants.InsertUser);
			statement.setString(1,user.getEmail());
			statement.setString(2,user.getPassword());
			statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean validateUser(User user) {
		Connection connection;
		DBConnection dbconnection=new DBConnection();
		try {
			connection=dbconnection.getConnection();
			PreparedStatement statement=connection.prepareStatement(Constants.ValidateUser);
			statement.setString(1,user.getEmail());
			ResultSet rs=statement.executeQuery();
			String email=null;
			String password=null;
			while(rs.next()) {
				email=rs.getString(1);
				password=rs.getString(2);
			}
			if(Objects.equals(user.getEmail(),email) && Objects.equals(user.getPassword(),password)) {
				return true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
