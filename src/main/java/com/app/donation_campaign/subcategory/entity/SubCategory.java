package com.app.donation_campaign.subcategory.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.app.donation_campaign.category.entity.Category;



@Entity
@Table(name = "subcategory")
public class SubCategory {
	@Id
	@Column(name = "subcategory_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subcategory_id;
	
	@Column (name = "subcategory_name")
	private String subcategory_name;
	
	@Column (name = "category_id")
	private int category_id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumns({@JoinColumn( referencedColumnName = "category_id")})
	private Category category;

	public SubCategory() {
		super();
	}

	public SubCategory(String subcategory_name, int category_id) {
		super();
		this.subcategory_name = subcategory_name;
		this.category_id = category_id;
	}
	
	public SubCategory(int subcategory_id, String subcategory_name, int category_id) {
		super();
		this.subcategory_id = subcategory_id;
		this.subcategory_name = subcategory_name;
		this.category_id = category_id;
	}

	/*public SubCategory(int subcategory_id, String subcategory_name, int category_id, Category category) {
		super();
		this.subcategory_id = subcategory_id;
		this.subcategory_name = subcategory_name;
		this.category_id = category_id;
		this.category = category;
	}*/

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

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "SubCategory [subcategory_id=" + subcategory_id + ", subcategory_name=" + subcategory_name
				+ ", category_id=" + category_id + "]";
	} 
	
}
