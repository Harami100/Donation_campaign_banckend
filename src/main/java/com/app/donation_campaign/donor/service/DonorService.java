package com.app.donation_campaign.donor.service;

import java.util.List;

import com.app.donation_campaign.donor.entity.Donor;

public interface DonorService {
public List<Donor> findAll();
	
	public Donor findById(int theDonorId);
	
	public void save(Donor theDonor);
	
	public void deleteById(int theDonorId);
	
	public Donor loadDonorByDonorEmail(String email);


}
