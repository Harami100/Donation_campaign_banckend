package com.app.donation_campaign.subcategory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subcategory")
public class SubCategory {
	@Id
	@Column(name = "subcategory_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subcategory_id;
	
	@Column (name = "subcategory_name")
	private String subcategory_name;
	
	@Column (name = "parent_id")
	private int parent_id;
	
	public SubCategory() {
		super();
	}

	public SubCategory(int subcategory_id, String subcategory_name, int parent_id) {
		super();
		this.subcategory_id = subcategory_id;
		this.subcategory_name = subcategory_name;
		this.parent_id = parent_id;
	}

	public int getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(int subcategory_id) {
		this.subcategory_id = subcategory_id;
	}

	public String getSubcategory_name() {
		return subcategory_name;
	}

	public void setSubcategory_name(String subcategory_name) {
		this.subcategory_name = subcategory_name;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	@Override
	public String toString() {
		return "SubCategory [subcategory_id=" + subcategory_id + ", subcategory_name=" + subcategory_name
				+ ", parent_id=" + parent_id + "]";
	} 
	
}
