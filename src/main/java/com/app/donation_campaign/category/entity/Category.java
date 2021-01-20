package com.app.donation_campaign.category.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.app.donation_campaign.subcategory.entity.SubCategory;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int category_id;
	
	@Column (name = "category_name")
	private String category_name;

	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="parent_id")
	private List<SubCategory> subCategories = new ArrayList<>();

	
	
	public Category() {
		super();
	}

	 
	public Category(int category_id, String category_name, List<SubCategory> subCategories) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.subCategories = subCategories;
	}


	public Category(int category_id, String category_name) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

//	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="company")
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", subCategories="
				+ subCategories + "]";
	}

	
	
	


}
