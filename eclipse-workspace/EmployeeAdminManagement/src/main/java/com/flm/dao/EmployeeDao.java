package com.flm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.flm.model.Employee;
import com.flm.model.User;
import com.flm.utils.Constants;
import com.flm.utils.DBConnection;

public class EmployeeDao {
	public void saveUser(User user) {
		Connection connection;
		DBConnection dbconnection=new DBConnection();
		try {
			connection = dbconnection.getConnection();
			PreparedStatement statement=connection.prepareStatement(Constants.getAllEmployees);
			
			ResultSet rs=statement.executeQuery();
			List<Employee> l1=new ArrayList<Employee>();
			while(rs.next()) {
				int empId=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				String email=rs.getString(4);
				String phonenumber=rs.getString(5);
				double salary=rs.getDouble(6);
				Employee emp=new Employee(empId,name,age,email,phonenumber,salary);
				l1.add(emp);
				
			}
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
