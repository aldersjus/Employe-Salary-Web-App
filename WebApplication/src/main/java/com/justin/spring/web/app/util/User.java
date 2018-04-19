package com.justin.spring.web.app.util;

import javax.validation.constraints.NotNull;

import com.justin.spring.web.app.validation.MyValidator;

/**
 * This is used to ensure that only valid entries are made at login.
 * Represents a user.
 * @author Justin Alderson
 *
 */
public class User {

	@NotNull(message="Enter Name")
	private String user;

	@MyValidator
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "User(Name: " + user + ", Password: " + password + ")";
		
	}
}
