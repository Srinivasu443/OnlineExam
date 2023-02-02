package com.client.entities;

import java.util.Date;




public class User {
	
	
	private int id;
	
	private String name;
	private String email;
	private String password;
	private String state;
	private String city;
	private String dob;
	private int yearOfCompletion;
	private long mobileNo;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getYearOfCompletion() {
		return yearOfCompletion;
	}
	public void setYearOfCompletion(int yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public User(int id, String name, String email, String password, String state, String city, String dob,
			int yearOfCompletion, long mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.state = state;
		this.city = city;
		this.dob = dob;
		this.yearOfCompletion = yearOfCompletion;
		this.mobileNo = mobileNo;
	}
	public User() {
		
	}
	
	

}
