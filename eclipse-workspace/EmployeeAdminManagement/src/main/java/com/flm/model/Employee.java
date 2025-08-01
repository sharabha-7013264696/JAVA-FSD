package com.flm.model;

public class Employee {
	private int id;
	
	private String name;
	private int age;
	private String email;
	private String phoneNumber;
	private double Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", Salary=" + Salary + "]";
	}
	public Employee(int id, String name, int age, String email, String phoneNumber, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.Salary = salary;
	}
	public Employee() {
		
	}
	
	

}
