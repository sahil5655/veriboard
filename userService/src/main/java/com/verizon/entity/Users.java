package com.verizon.entity;

import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {
	private BigInteger _id;
	private String username;
	private String password;
	
	public Users() { }

	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public BigInteger get_id() {
		return _id;
	}

	public void set_id(BigInteger _id) {
		this._id = _id;
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

	@Override
	public String toString() {
		return "Users [_id=" + _id + ", username=" + username + ", password=" + password + "]";
	}
	
	
	

}
