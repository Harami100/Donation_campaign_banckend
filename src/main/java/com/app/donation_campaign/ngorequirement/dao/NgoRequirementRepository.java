package com.app.donation_campaign.ngorequirement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.donation_campaign.ngorequirement.entity.NgoRequirement;

public interface NgoRequirementRepository extends JpaRepository<NgoRequirement, Integer>{

	@Query(value = "select COALESCE(SUM(product_quantity), 0)  from ngorequirement where category_id=? and subcategory_id=?;",nativeQuery = true)
	public  int getSumOfProdReqSubCategoryWise(int category, int subCategory);
}
