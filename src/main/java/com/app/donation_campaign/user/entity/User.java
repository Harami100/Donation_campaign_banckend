package com.app.donation_campaign.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	
	@Column(name = "user_name")
	private String user_name;
	
	
	@Column(name = "user_address")
	private String user_address;
	
	@Column(name = "user_email")
	private String user_email;
	
	@Column(name = "user_phone_no")
	private long user_phoneNo;
	
	@Column(name = "user_password")
	private String user_password;

	public User() {
		super();
	}

	public User(int user_id, String user_name, String user_address, String user_email, long user_phoneNo,
			String user_password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_address = user_address;
		this.user_email = user_email;
		this.user_phoneNo = user_phoneNo;
		this.user_password = user_password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public long getUser_phoneNo() {
		return user_phoneNo;
	}

	public void setUser_phoneNo(long user_phoneNo) {
		this.user_phoneNo = user_phoneNo;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_address=" + user_address
				+ ", user_email=" + user_email + ", user_phoneNo=" + user_phoneNo + ", user_password=" + user_password
				+ "]";
	}

	}
