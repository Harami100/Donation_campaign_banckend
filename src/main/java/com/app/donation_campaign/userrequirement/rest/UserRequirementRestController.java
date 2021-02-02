package com.app.donation_campaign.userrequirement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.donation_campaign.userrequirement.entity.UserRequirement;
import com.app.donation_campaign.userrequirement.service.UserRequirementService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class UserRequirementRestController {
	
	private UserRequirementService userRequirementService;
	
	@Autowired
	public UserRequirementRestController(UserRequirementService theUserRequirementService)
	{
		userRequirementService=theUserRequirementService;
	}
	
	@GetMapping("/userRequirements")
	public List<UserRequirement> findAll() {
		return userRequirementService.findAll();
	}
	
	@GetMapping("/userRequirements/{userRequirementId}")
	public UserRequirement getUserRequirement(@PathVariable int userRequirementId) {
		
		UserRequirement theUserRequirement = userRequirementService.findById(userRequirementId);
		
		if (theUserRequirement == null) {
			throw new RuntimeException("User Requirement Service not found - " + userRequirementId);
		}
		
		return theUserRequirement;
	}
	
	@PostMapping("/userRequirements")
	public UserRequirement addUserRequirement(@RequestBody UserRequirement theUserRequirement) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theUserRequirement.setUserrequirement_id(0);;
		
		userRequirementService.save(theUserRequirement);
		
		return theUserRequirement;
	}
	
	// add mapping for PUT /users - update existing employee
	
	@PutMapping("/userRequirement")
	public UserRequirement updateUserRequirement(@RequestBody UserRequirement theUserRequirement) {
		
		userRequirementService.save(theUserRequirement);
				
		return theUserRequirement;
	}
	
	@DeleteMapping("/userRequirements/{userRequirementId}")
	public String deleteUserRequirement(@PathVariable int userRequirementId) {
		
		UserRequirement tempUserRequirement = userRequirementService.findById(userRequirementId);
		
		// throw exception if null
		
		if (tempUserRequirement == null) {
			throw new RuntimeException("User Requirement Service id not found - " + userRequirementId);
		}
		
		userRequirementService.deleteById(userRequirementId);
		
		return "Deleted User Requirement Service id - " + userRequirementId;
	}

	@GetMapping("/totalUserRequirement")
	public long findTotalUserRequirements() {
		return userRequirementService.findCountOfUserRequirement();
	}
	
	@PostMapping("/getTotalQuantityUserReq")
	public int getTotalQuantityUserReq(int category, int subcategory) {
		return userRequirementService.getSumOfProductSubCategoryWise(category, subcategory);
	}
}

