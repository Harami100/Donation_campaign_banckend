package com.app.donation_campaign.userrequirement.service;
import java.util.List;
import com.app.donation_campaign.userrequirement.entity.UserRequirement;

public interface UserRequirementService {
	public List<UserRequirement> findAll();
	
	public UserRequirement findById(int theUserRequirementId);
	
	public void save(UserRequirement theUserRequirement);
	
	public void deleteById(int theUserRequirementId);

	public long findCountOfUserRequirement();

	public int getSumOfProductSubCategoryWise(int category , int subcategory);
}
