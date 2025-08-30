package com.Programming.OOP.Encapsulation;

public class LoginPage 
{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//business logic
	public void doLogin(String un,String psw)
	{
		System.out.println("Hello "+un+" Welcome!");
	}
	

}
