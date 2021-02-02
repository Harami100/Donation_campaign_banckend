package com.app.donation_campaign.ngorequirement.rest;

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

import com.app.donation_campaign.ngorequirement.entity.NgoRequirement;
import com.app.donation_campaign.ngorequirement.service.NgoRequirementService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
//@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class NgoRequirementRestController {
	private NgoRequirementService ngoRequirementService;
	
	@Autowired
	public NgoRequirementRestController(NgoRequirementService theNgoRequirementService)
	{
		ngoRequirementService=theNgoRequirementService;
	}

	@GetMapping("/ngoRequirements")
	public List<NgoRequirement> findAll() {
		return ngoRequirementService.findAll();
	}
	
	@GetMapping("/ngoRequirements/{ngoRequirementId}")
	public NgoRequirement getNgoRequirement(@PathVariable int ngoRequirementId) {
		
		NgoRequirement theNgoRequirement = ngoRequirementService.findById(ngoRequirementId);
		
		if (theNgoRequirement == null) {
			throw new RuntimeException("NGO Requirement Service not found - " + ngoRequirementId);
		}
		
		return theNgoRequirement;
	}
	
	@PostMapping("/ngoRequirements")
	public NgoRequirement addNgo(@RequestBody NgoRequirement theNgoRequirement) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theNgoRequirement.setNgorequirement_id(0);
		
		ngoRequirementService.save(theNgoRequirement);
		
		return theNgoRequirement;
	}
	
	// add mapping for PUT /users - update existing employee
	
	@PutMapping("/ngoRequirements")
	public NgoRequirement updateNgo(@RequestBody NgoRequirement theNgoRequirement) {
		
		ngoRequirementService.save(theNgoRequirement);
				
		return theNgoRequirement;
	}
	
	@DeleteMapping("/ngoRequirements/{ngoRequirementId}")
	public String deleteNgo(@PathVariable int ngoRequirementId) {
		
		NgoRequirement tempNgoRequirement = ngoRequirementService.findById(ngoRequirementId);
		
		// throw exception if null
		
		if (tempNgoRequirement == null) {
			throw new RuntimeException("NGO Requirement Service id not found - " + ngoRequirementId);
		}
		
		ngoRequirementService.deleteById(ngoRequirementId);
		
		return "Deleted NGO requirement Service id - " + ngoRequirementId;
	}
	
	@PostMapping("/getTotalQuantityNgoReq")
	public int getTotalQuantityNgoReq(int category, int subcategory) {
		return ngoRequirementService.getSumOfProductSubCategoryWise(category, subcategory);
	}
}
