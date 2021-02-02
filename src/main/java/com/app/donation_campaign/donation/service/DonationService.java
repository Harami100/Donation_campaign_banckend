package com.app.donation_campaign.donation.service;

import java.util.List;

import com.app.donation_campaign.donation.entity.Donation;

public interface DonationService {
public List<Donation> findAll();
	
	public Donation findById(int theDonationId);
	
	public void save(Donation theDonation);
	
	public void deleteById(int theDonationId);

	public int getSumOfProductSubCategoryWise(int category , int subcategory);
}
