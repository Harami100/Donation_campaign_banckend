package com.app.donation_campaign.donor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donor")
public class Donor {

	@Id
	@Column(name = "donor_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int donor_id;
	
	@Column (name = "donor_name")
	private String donor_name;
	
	@Column(name = "donor_address")
	private String donor_address;
	
	@Column(name = "donor_phone_no")
	private long donor_phoneNo;
	
	@Column(name = "donor_email")
	private String donor_email;
	
	@Column(name = "donor_password")
	private String donor_password;

	public Donor() {
		super();
	}

	public Donor(String donor_name, String donor_address, long donor_phoneNo, String donor_email,
			String donor_password) {
		super();
		this.donor_name = donor_name;
		this.donor_address = donor_address;
		this.donor_phoneNo = donor_phoneNo;
		this.donor_email = donor_email;
		this.donor_password = donor_password;
	}

	public int getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}

	public String getDonor_name() {
		return donor_name;
	}

	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}

	public String getDonor_address() {
		return donor_address;
	}

	public void setDonor_address(String donor_address) {
		this.donor_address = donor_address;
	}

	public long getDonor_phoneNo() {
		return donor_phoneNo;
	}

	public void setDonor_phoneNo(long donor_phoneNo) {
		this.donor_phoneNo = donor_phoneNo;
	}

	public String getDonor_email() {
		return donor_email;
	}

	public void setDonor_email(String donor_email) {
		this.donor_email = donor_email;
	}

	public String getDonor_password() {
		return donor_password;
	}

	public void setDonor_password(String donor_password) {
		this.donor_password = donor_password;
	}

	@Override
	public String toString() {
		return "Donor [donor_id=" + donor_id + ", donor_name=" + donor_name + ", donor_address=" + donor_address
				+ ", donor_phoneNo=" + donor_phoneNo + ", donor_email=" + donor_email + ", donor_password="
				+ donor_password + "]";
	}

		
	
}
