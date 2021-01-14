package com.app.donation_campaign.ngo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.donation_campaign.ngo.dao.NgoRepository;
import com.app.donation_campaign.ngo.entity.Ngo;

@Service

public class NgoServiceImpl implements NgoService{

	private NgoRepository ngoRepository;
	
	@Autowired
	public NgoServiceImpl(NgoRepository theNgoRepository)
	{
		ngoRepository=theNgoRepository;
	}
	
	
	@Override
	@Transactional
	public List<Ngo> findAll() {
		// TODO Auto-generated method stub
		return ngoRepository.findAll();
	}

	
	@Override
	public Ngo findById(int theNgoId) {
		// TODO Auto-generated method stub
		Optional<Ngo> result=ngoRepository.findById(theNgoId);
		
		
		Ngo theNgo=null;
		if(result.isPresent())
		{
			theNgo=result.get();
		}
		else
		{
			//we didn't find Ngo
			throw new RuntimeException("Did not find donor id="+theNgo);
		}
		return theNgo;
	}
	
	
	@Override
	public void save(Ngo theNgo) {
		// TODO Auto-generated method stub
		ngoRepository.save(theNgo);
	}

	@Override
	public void deleteById(int theNgoId) {
		// TODO Auto-generated method stub
		ngoRepository.deleteById(theNgoId);
	}


}
