package com.app.donation_campaign.donation.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.donation_campaign.donation.dao.DonationRepository;
import com.app.donation_campaign.donation.entity.Donation;


@Service
public class DonationServiceImpl implements DonationService {
private DonationRepository donationRepository;
	
	@Autowired
	public DonationServiceImpl(DonationRepository theDonationRepository) {
		// TODO Auto-generated constructor stub
		this.donationRepository=theDonationRepository;
	}
	
	@Override
	@Transactional
	public List<Donation> findAll() {
		// TODO Auto-generated method stub
		return donationRepository.findAll();
	}

	
	@Override
	public Donation findById(int theDonationId) {
		// TODO Auto-generated method stub
		Optional<Donation> result=donationRepository.findById(theDonationId);
		
		
		Donation theDonation=null;
		if(result.isPresent())
		{
			theDonation=result.get();
		}
		else
		{
			//we didn't find Donation
			throw new RuntimeException("Did not find donor id="+theDonation);
		}
		return theDonation;
	}
	
	
	@Override
	public void save(Donation theDonation) {
		// TODO Auto-generated method stub
		donationRepository.save(theDonation);
	}

	@Override
	public void deleteById(int theDonationId) {
		// TODO Auto-generated method stub
		donationRepository.deleteById(theDonationId);
	}


}
