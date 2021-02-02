package com.app.donation_campaign.userrequirement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userrequirement")

public class UserRequirement {

	@Id
	@Column(name = "userrequirement_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userrequirement_id;
	
	@Column (name = "category_id")
	private int category_id;
	
	@Column (name = "subcategory_id")
	private int subcategory_id;
	
	@Column (name = "product_quantity")
	private int product_quantity;
	
	@Column (name = "user_id")
	private int user_id;
	
	@Column (name = "user_description")
	private String user_description;
	
	@Column (name = "aadhar_no")
	private long aadhar_no;

	public UserRequirement() {
		super();
	}

	public UserRequirement(int userrequirement_id, int category_id, int subcategory_id, int product_quantity,
			int user_id, String user_description, long aadhar_no) {
		super();
		this.userrequirement_id = userrequirement_id;
		this.category_id = category_id;
		this.subcategory_id = subcategory_id;
		this.product_quantity = product_quantity;
		this.user_id = user_id;
		this.user_description = user_description;
		this.aadhar_no = aadhar_no;
	}

	public int getUserrequirement_id() {
		return userrequirement_id;
	}

	public void setUserrequirement_id(int userrequirement_id) {
		this.userrequirement_id = userrequirement_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(int subcategory_id) {
		this.subcategory_id = subcategory_id;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_description() {
		return user_description;
	}

	public void setUser_description(String user_description) {
		this.user_description = user_description;
	}

	public long getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	@Override
	public String toString() {
		return "UserRequirement [userrequirement_id=" + userrequirement_id + ", category_id=" + category_id
				+ ", subcategory_id=" + subcategory_id + ", product_quantity=" + product_quantity + ", user_id="
				+ user_id + ", user_description=" + user_description + ", aadhar_no=" + aadhar_no + "]";
	}
	
}

