package com.app.donation_campaign.subcategory.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.donation_campaign.subcategory.entity.SubCategory;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {

}
