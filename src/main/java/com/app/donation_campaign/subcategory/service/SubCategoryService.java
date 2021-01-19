package com.app.donation_campaign.subcategory.service;

import java.util.List;

import com.app.donation_campaign.category.entity.Category;
import com.app.donation_campaign.subcategory.entity.SubCategory;

public interface SubCategoryService {
public List<SubCategory> findAll();
	
	public SubCategory findById(int theSubCategoryId);
	
	public void save(SubCategory theSubCategory);
	
	public void deleteById(int theSubCategoryId);

}
