package com.app.donation_campaign.donor.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.donation_campaign.donor.entity.Donor;

public interface DonorRepository  extends JpaRepository<Donor, Integer>
{

}
