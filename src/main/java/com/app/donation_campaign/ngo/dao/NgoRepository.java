package com.app.donation_campaign.ngo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.donation_campaign.ngo.entity.Ngo;

public interface NgoRepository extends JpaRepository<Ngo, Integer>{

}
