package com.app.donation_campaign.user.service;

import java.util.List;

import com.app.donation_campaign.user.entity.User;

public interface UserService {
public List<User> findAll();
	
	public User findById(int theUserId);
	
	public void save(User theUser);
	
	public void deleteById(int theUserId);

	public long findCountOfUser();

}
