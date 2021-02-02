package com.app.donation_campaign.ngorequirement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.donation_campaign.ngo.entity.Ngo;
import com.app.donation_campaign.ngorequirement.dao.NgoRequirementRepository;
import com.app.donation_campaign.ngorequirement.entity.NgoRequirement;
@Service
public class NgoRequirementServiceImpl implements NgoRequirementService{
	
	private NgoRequirementRepository ngoRequirementRepository;
	
	@Autowired
	public NgoRequirementServiceImpl(NgoRequirementRepository theNgoRequirementRepository) {
		// TODO Auto-generated constructor stub
		ngoRequirementRepository=theNgoRequirementRepository;
	}

	@Override
	@Transactional
	public List<NgoRequirement> findAll() {
		// TODO Auto-generated method stub
		return ngoRequirementRepository.findAll();
	}

	@Override
	public NgoRequirement findById(int theNgorequirementId) {
		// TODO Auto-generated method stub
		Optional<NgoRequirement> result=ngoRequirementRepository.findById(theNgorequirementId);
		
		
		NgoRequirement theNgoRequirement=null;
		if(result.isPresent())
		{
			theNgoRequirement=result.get();
		}
		else
		{
			//we didn't find Ngo
			throw new RuntimeException("Did not find donor id="+theNgoRequirement);
		}
		return theNgoRequirement;
	}

	@Override
	public void save(NgoRequirement theNgoRequirement) {
		// TODO Auto-generated method stub
		ngoRequirementRepository.save(theNgoRequirement);
	}

	@Override
	public void deleteById(int theNgoRequirementId) {
		// TODO Auto-generated method stub
		ngoRequirementRepository.deleteById(theNgoRequirementId);
	}

	@Override
	public int getSumOfProductSubCategoryWise(int category, int subcategory) {
		// TODO Auto-generated method stub
		return ngoRequirementRepository.getSumOfProdReqSubCategoryWise( category , subcategory);
	}
}
