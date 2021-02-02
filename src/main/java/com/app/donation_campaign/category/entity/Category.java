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
    @JoinColumn(name="category_id")
	private List<SubCategory> subcategory_list=new ArrayList<>();


/*	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="parent_id")
	private List<SubCategory> subCategories = new ArrayList<>();
*/
	
	
	public Category(int category_id, String category_name, List<SubCategory> subcategory_list) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.subcategory_list = subcategory_list;
	}


	public Category() {
		super();
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


	public List<SubCategory> getSubcategory_list() {
		return subcategory_list;
	}

	public void setSubcategory_list(List<SubCategory> subcategory_list) {
		this.subcategory_list = subcategory_list;
	}

	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", subcategory_list="
				+ subcategory_list + "]";
	}

}
