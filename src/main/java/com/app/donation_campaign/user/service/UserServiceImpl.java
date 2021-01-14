package com.app.donation_campaign.user.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.donation_campaign.user.dao.UserRepository;
import com.app.donation_campaign.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	@Autowired
	 public UserServiceImpl( UserRepository theUserRepository) {
		// TODO Auto-generated constructor stub
		userRepository=theUserRepository;
	}
	
	@Override
	@Transactional
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findById(int theUserId) {
		// TODO Auto-generated method stub
		Optional<User> result=userRepository.findById(theUserId);
		
		
		User theUser=null;
		if(result.isPresent())
		{
			theUser=result.get();
		}
		else
		{
			//we didn't find user
			throw new RuntimeException("Did not find user id="+theUser);
		}
		return theUser;
	}

	@Override
	public void save(User theUser) {
		// TODO Auto-generated method stub
		userRepository.save(theUser);
	}

	@Override
	public void deleteById(int theUserId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(theUserId);
	}
	


}
