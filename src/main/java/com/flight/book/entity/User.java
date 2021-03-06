package com.flight.book.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String userName;
	private String password;
	private String role;
	public User(String userName, String password, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public User() {

	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
