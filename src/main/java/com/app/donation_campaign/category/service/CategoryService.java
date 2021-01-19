package com.app.donation_campaign.category.service;

import java.util.List;

import com.app.donation_campaign.category.entity.Category;

public interface CategoryService {
public List<Category> findAll();
	
	public Category findById(int theCategoryId);
	
	public void save(Category theCategory);
	
	public void deleteById(int theCategoryId);

}
