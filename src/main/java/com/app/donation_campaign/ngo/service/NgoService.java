package com.app.donation_campaign.ngo.service;

import java.util.List;

import com.app.donation_campaign.ngo.entity.Ngo;

public interface NgoService {
	public List<Ngo> findAll();
	
	public Ngo findById(int theNgoId);
	
	public void save(Ngo theNgo);
	
	public void deleteById(int theNgoId);

}
