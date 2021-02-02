package com.app.donation_campaign.ngorequirement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.donation_campaign.ngorequirement.dao.NgoRequirementRepository;
import com.app.donation_campaign.ngorequirement.service.NgoRequirementServiceImpl;

@Entity
@Table(name = "ngorequirement")
public class NgoRequirement 
{
	@Id
	@Column(name = "ngorequirement_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ngorequirement_id;
	
	@Column(name = "category_id")
	private int category_id;
	
	@Column(name = "subcategory_id")
	private int subcategory_id;
	
	@Column(name = "product_quantity")
	private int product_quantity;
	
	@Column(name = "ngo_id")
	private int ngo_id;
	
	@Column(name = "ngo_description")
	private String ngo_description;
	
	@Column(name = "ngo_uid")
	private String ngo_uid;
	
	public NgoRequirement() {
		super();
	}

	public NgoRequirement(int ngorequirement_id, int category_id, int subcategory_id, int product_quantity, int ngo_id,
			String ngo_description, String ngo_uid) {
		super();
		this.ngorequirement_id = ngorequirement_id;
		this.category_id = category_id;
		this.subcategory_id = subcategory_id;
		this.product_quantity = product_quantity;
		this.ngo_id = ngo_id;
		this.ngo_description = ngo_description;
		this.ngo_uid = ngo_uid;
	}
	
	public int getNgorequirement_id() {
		return ngorequirement_id;
	}

	public void setNgorequirement_id(int ngorequirement_id) {
		this.ngorequirement_id = ngorequirement_id;
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

	public int getNgo_id() {
		return ngo_id;
	}

	public void setNgo_id(int ngo_id) {
		this.ngo_id = ngo_id;
	}

	public String getNgo_description() {
		return ngo_description;
	}

	public void setNgo_description(String ngo_description) {
		this.ngo_description = ngo_description;
	}

	public String getNgo_uid() {
		return ngo_uid;
	}

	public void setNgo_uid(String ngo_uid) {
		this.ngo_uid = ngo_uid;
	}

	@Override
	public String toString() {
		return "Ngorequirement [ngorequirement_id=" + ngorequirement_id + ", category_id=" + category_id
				+ ", subcategory_id=" + subcategory_id + ", product_quantity=" + product_quantity + ", ngo_id=" + ngo_id
				+ ", ngo_description=" + ngo_description + ", ngo_uid=" + ngo_uid + "]";
	}
	
	
}
