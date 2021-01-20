package com.app.donation_campaign.ngo.rest;

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

import com.app.donation_campaign.ngo.entity.Ngo;
import com.app.donation_campaign.ngo.service.NgoService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class NgoRestController {

private NgoService ngoService;
	
	@Autowired
	public NgoRestController(NgoService theNgoService)
	{
		ngoService=theNgoService;
	}
	
	@GetMapping("/ngos")
	public List<Ngo> findAll() {
		return ngoService.findAll();
	}
	
	@GetMapping("/ngos/{ngoId}")
	public Ngo getNgo(@PathVariable int ngoId) {
		
		Ngo theNgo = ngoService.findById(ngoId);
		
		if (theNgo == null) {
			throw new RuntimeException("NGO not found - " + ngoId);
		}
		
		return theNgo;
	}
	
	@PostMapping("/ngos")
	public Ngo addNgo(@RequestBody Ngo theNgo) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theNgo.setNgo_id(0);
		
		ngoService.save(theNgo);
		
		return theNgo;
	}
	
	// add mapping for PUT /users - update existing employee
	
	@PutMapping("/ngos")
	public Ngo updateNgo(@RequestBody Ngo theNgo) {
		
		ngoService.save(theNgo);
				
		return theNgo;
	}
	
	@DeleteMapping("/ngos/{ngoId}")
	public String deleteNgo(@PathVariable int ngoId) {
		
		Ngo tempNgo = ngoService.findById(ngoId);
		
		// throw exception if null
		
		if (tempNgo == null) {
			throw new RuntimeException("NGO id not found - " + ngoId);
		}
		
		ngoService.deleteById(ngoId);
		
		return "Deleted ngo id - " + ngoId;
	}

}
