package com.app.donation_campaign.userrequirement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.donation_campaign.userrequirement.entity.UserRequirement;

public interface UserRequirementRepository extends JpaRepository<UserRequirement, Integer>{
	@Query(value = "select COALESCE(SUM(product_quantity), 0)  from userrequirement where category_id=? and subcategory_id=?;",nativeQuery = true)
	public int getSumOfProdReqSubCategoryWise(int category, int subCategory);
}
