package com.app.donation_campaign.donor.rest;

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


import com.app.donation_campaign.donor.entity.Donor;
import com.app.donation_campaign.donor.service.DonorService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class DonorRestController {
	
	private DonorService donorService;
	
	@Autowired
	public DonorRestController(DonorService theDonorService)
	{
		donorService=theDonorService;
	}
	
	@GetMapping("/donors")
	public List<Donor> findAll() {
		return donorService.findAll();
	}
	
	@GetMapping("/donors/{donorId}")
	public Donor getDonor(@PathVariable int donorId) {
		
		Donor theDonor = donorService.findById(donorId);
		
		if (theDonor == null) {
			throw new RuntimeException("Donor not found - " + donorId);
		}
		
		return theDonor;
	}
	
	@PostMapping("/donors")
	public Donor addDonor(@RequestBody Donor theDonor) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theDonor.setDonor_id(0);
		
		donorService.save(theDonor);
		
		return theDonor;
	}
	
	// add mapping for PUT /users - update existing employee
	
	@PutMapping("/donors")
	public Donor updateDonor(@RequestBody Donor theDonor) {
		
		donorService.save(theDonor);
				
		return theDonor;
	}
	
	@DeleteMapping("/donors/{donorId}")
	public String deleteDonor(@PathVariable int donorId) {
		
		Donor tempDonor = donorService.findById(donorId);
		
		// throw exception if null
		
		if (tempDonor == null) {
			throw new RuntimeException("Donor id not found - " + donorId);
		}
		
		donorService.deleteById(donorId);
		
		return "Deleted donor id - " + donorId;
	}

	@PostMapping("/login")
	public Donor loginDonor(@RequestBody Donor theDonor) {
		
		Donor donor=donorService.loadDonorByDonorEmail(theDonor.getDonor_email());
		return donor;
	}
}
