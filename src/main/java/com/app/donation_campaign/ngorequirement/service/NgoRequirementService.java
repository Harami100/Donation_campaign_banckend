package com.app.donation_campaign.ngorequirement.service;

import java.util.List;

import com.app.donation_campaign.ngorequirement.entity.NgoRequirement;

public interface NgoRequirementService {

	public List<NgoRequirement> findAll();
	
	public NgoRequirement findById(int theNgoRequirementId);
	
	public void save(NgoRequirement theNgoRequirement);
	
	public void deleteById(int theNgoRequirementId);
}
