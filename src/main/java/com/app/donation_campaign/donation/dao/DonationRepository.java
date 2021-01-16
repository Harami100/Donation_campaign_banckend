package com.app.donation_campaign.donation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.donation_campaign.donation.entity.Donation;

public interface DonationRepository extends JpaRepository<Donation, Integer> {

}
