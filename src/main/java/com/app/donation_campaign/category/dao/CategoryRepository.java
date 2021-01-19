package com.app.donation_campaign.category.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.donation_campaign.category.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
