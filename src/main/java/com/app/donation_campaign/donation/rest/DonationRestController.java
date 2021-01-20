package com.app.donation_campaign.donation.rest;

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

import com.app.donation_campaign.donation.entity.Donation;
import com.app.donation_campaign.donation.service.DonationService;
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class DonationRestController {
	
	private DonationService donationService;

	
	@Autowired
	public DonationRestController (DonationService theDonationService)
	{
		donationService=theDonationService;
	}
	
	@GetMapping("/donations")
	public List<Donation> findAll() {
		return donationService.findAll();
	}
	
	@GetMapping("/donations/{donationId}")
	public Donation getDonation(@PathVariable int donationId) {
		
		Donation theDonation = donationService.findById(donationId);
		
		if (theDonation == null) {
			throw new RuntimeException("Donation not found - " + donationId);
		}
		
		return theDonation;
	}
	
	@PostMapping("/donations")
	public Donation addDonation(@RequestBody Donation theDonation) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theDonation.setDonation_id(0);
		
		donationService.save(theDonation);
		
		return theDonation;
	}
	
	// add mapping for PUT /donation - update existing donation
	
	@PutMapping("/donations")
	public Donation updateDonation(@RequestBody Donation theDonation) {
		
		donationService.save(theDonation);
				
		return theDonation;
	}
	
	@DeleteMapping("/donations/{donationId}")
	public String deleteDonation(@PathVariable int donationId) {
		
		Donation tempDonation = donationService.findById(donationId);
		
		// throw exception if null
		
		if (tempDonation == null) {
			throw new RuntimeException("Donation id not found - " + donationId);
		}
		
		donationService.deleteById(donationId);
		
		return "Deleted donation id - " + donationId;
	}


}
