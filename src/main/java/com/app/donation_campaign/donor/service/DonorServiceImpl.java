package com.app.donation_campaign.donor.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.donation_campaign.donor.dao.DonorRepository;
import com.app.donation_campaign.donor.entity.Donor;
@Service
public class DonorServiceImpl implements DonorService{
	private DonorRepository donorRepository;

	@Autowired
	public DonorServiceImpl(DonorRepository theDonorRepository)
	{
		donorRepository=theDonorRepository;
	}
	
	@Override
	@Transactional
	public List<Donor> findAll() {
		// TODO Auto-generated method stub
		return donorRepository.findAll();
	}

	@Override
	public Donor findById(int theDonorId) {
		// TODO Auto-generated method stub
		Optional<Donor> result=donorRepository.findById(theDonorId);
		
		Donor theDonor=null;
		
		if(result.isPresent())
		{
			theDonor=result.get();
		}
		else
		{
			//we didn't find donor
			throw new RuntimeException("Did not find donor id="+theDonor);
		}
		return theDonor;
	}

	@Override
	public void save(Donor theDonor) {
		// TODO Auto-generated method stub
		donorRepository.save(theDonor);
	}

	@Override
	public void deleteById(int theDonorId) {
		// TODO Auto-generated method stub
		donorRepository.deleteById(theDonorId);
	}

	@Override
	public Donor loadDonorByDonorEmail(String email) {
		// TODO Auto-generated method stub
		Donor donor=donorRepository.findByDonorEmail(email);
		if (donor== null) {
            return null;
        }
		return donor;
	}

	@Override
	public long findCountOfDonor() {
		// TODO Auto-generated method stub
		return donorRepository.count();
	}
	

}
