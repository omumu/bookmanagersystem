package com.java.model;
/**
 * 用户实体
 * @author 高 木木
 *
 */
public class user {
	private  int id;
	private  String username;
	private  String password;
	
	
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public user(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	

}
