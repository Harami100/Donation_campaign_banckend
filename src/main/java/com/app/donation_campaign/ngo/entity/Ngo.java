package com.app.donation_campaign.ngo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ngo")
public class Ngo {
	
	@Id
	@Column(name = "ngo_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ngo_id;
	
	@Column(name = "ngo_name")
	private String ngo_name;
	
	@Column(name = "ngo_address")
	private String ngo_address;
	
	@Column(name = "ngo_phone_no")
	private long ngo_phoneNo;
	
	@Column(name = "ngo_email")
	private String ngo_email;
	
	@Column(name = "ngo_password")
	private String ngo_password;
	
	@Column(name = "ngo_description")
	private String ngo_description;

	public Ngo() {
		super();
	}

	public Ngo(String ngo_name, String ngo_address, long ngo_phoneNo, String ngo_email, String ngo_password,
			String ngo_description) {
		super();
		this.ngo_name = ngo_name;
		this.ngo_address = ngo_address;
		this.ngo_phoneNo = ngo_phoneNo;
		this.ngo_email = ngo_email;
		this.ngo_password = ngo_password;
		this.ngo_description = ngo_description;
	}

	public int getNgo_id() {
		return ngo_id;
	}

	public void setNgo_id(int ngo_id) {
		this.ngo_id = ngo_id;
	}

	public String getNgo_name() {
		return ngo_name;
	}

	public void setNgo_name(String ngo_name) {
		this.ngo_name = ngo_name;
	}

	public String getNgo_address() {
		return ngo_address;
	}

	public void setNgo_address(String ngo_address) {
		this.ngo_address = ngo_address;
	}

	public long getNgo_phoneNo() {
		return ngo_phoneNo;
	}

	public void setNgo_phoneNo(long ngo_phoneNo) {
		this.ngo_phoneNo = ngo_phoneNo;
	}

	public String getNgo_email() {
		return ngo_email;
	}

	public void setNgo_email(String ngo_email) {
		this.ngo_email = ngo_email;
	}

	public String getNgo_password() {
		return ngo_password;
	}

	public void setNgo_password(String ngo_password) {
		this.ngo_password = ngo_password;
	}

	public String getNgo_description() {
		return ngo_description;
	}

	public void setNgo_description(String ngo_description) {
		this.ngo_description = ngo_description;
	}

	@Override
	public String toString() {
		return "Ngo [ngo_id=" + ngo_id + ", ngo_name=" + ngo_name + ", ngo_address=" + ngo_address + ", ngo_phoneNo="
				+ ngo_phoneNo + ", ngo_email=" + ngo_email + ", ngo_password=" + ngo_password + ", ngo_description="
				+ ngo_description + "]";
	}
	
	
	

}
