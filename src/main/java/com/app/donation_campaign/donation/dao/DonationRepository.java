package com.app.donation_campaign.donation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.donation_campaign.donation.entity.Donation;

public interface DonationRepository extends JpaRepository<Donation, Integer> {
	
	@Query(value = "select COALESCE(SUM(product_quantity), 0)  from donation where product_category=? and product_subcategory=?;",nativeQuery = true)
	public int getSumOfProductSubCategoryWise(int category, int subCategory);
}
