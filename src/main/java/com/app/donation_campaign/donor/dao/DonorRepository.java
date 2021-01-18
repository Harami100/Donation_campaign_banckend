package com.app.donation_campaign.donor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.donation_campaign.donor.entity.Donor;

public interface DonorRepository  extends JpaRepository<Donor, Integer>
{
	@Query(value = "select * from donor d where d.donor_email=?",nativeQuery = true)
	public Donor findByDonorEmail(String email);
}
