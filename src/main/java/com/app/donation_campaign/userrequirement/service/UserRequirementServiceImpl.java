package com.app.donation_campaign.userrequirement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.donation_campaign.userrequirement.dao.UserRequirementRepository;
import com.app.donation_campaign.userrequirement.entity.UserRequirement;

@Service
public class UserRequirementServiceImpl implements UserRequirementService{

	
	private UserRequirementRepository userRequirementRepository;

	@Autowired
	public UserRequirementServiceImpl(UserRequirementRepository theUserRequirementRepository)
	{
		userRequirementRepository=theUserRequirementRepository;
	}
	
	@Override
	@Transactional
	public List<UserRequirement> findAll() {
		// TODO Auto-generated method stub
		return userRequirementRepository.findAll();
	}

	@Override
	public UserRequirement findById(int theUserRequirementId) {
		// TODO Auto-generated method stub
		Optional<UserRequirement> result=userRequirementRepository.findById(theUserRequirementId);
		
		UserRequirement theUserRequirement=null;
		
		if(result.isPresent())
		{
			theUserRequirement=result.get();
		}
		else
		{
			//we didn't find User Requirement
			throw new RuntimeException("Did not find User Requirement id="+theUserRequirement);
		}
		return theUserRequirement;
	}

	@Override
	public void save(UserRequirement theUserRequirement) {
		// TODO Auto-generated method stub
		userRequirementRepository.save(theUserRequirement);
	}

	@Override
	public void deleteById(int theUserRequirementId) {
		// TODO Auto-generated method stub
		userRequirementRepository.deleteById(theUserRequirementId);
	}

	@Override
	public long findCountOfUserRequirement() {
		// TODO Auto-generated method stub
		return userRequirementRepository.count();
	}

	@Override
	public int getSumOfProductSubCategoryWise(int category, int subcategory) {
		// TODO Auto-generated method stub
		return userRequirementRepository.getSumOfProdReqSubCategoryWise( category , subcategory);
	}

}

