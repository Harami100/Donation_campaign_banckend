package com.app.donation_campaign.donation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="donation")
public class Donation {

	@Id
	@Column(name = "donation_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int donation_id;
	
	@Column (name = "product_category")
	private int product_category;
	
	@Column (name = "product_name")
	private String product_name;
	
	@Column (name = "product_quantity")
	private int product_quantity;
	
	@Column (name = "donor_id")
	private int donor_id;

	public Donation() {
		super();
	}

	public Donation(int donation_id, int product_category, String product_name, int product_quantity, int donor_id) {
		super();
		this.donation_id = donation_id;
		this.product_category = product_category;
		this.product_name = product_name;
		this.product_quantity = product_quantity;
		this.donor_id = donor_id;
	}

	public int getDonation_id() {
		return donation_id;
	}

	public void setDonation_id(int donation_id) {
		this.donation_id = donation_id;
	}

	public int getProduct_category() {
		return product_category;
	}

	public void setProduct_category(int product_category) {
		this.product_category = product_category;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public int getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}

	@Override
	public String toString() {
		return "Donation [donation_id=" + donation_id + ", product_category=" + product_category + ", product_name="
				+ product_name + ", product_quantity=" + product_quantity + ", donor_id=" + donor_id + "]";
	}
	
	
	
	
}
