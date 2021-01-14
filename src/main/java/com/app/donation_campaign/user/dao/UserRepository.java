package com.app.donation_campaign.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.donation_campaign.user.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
