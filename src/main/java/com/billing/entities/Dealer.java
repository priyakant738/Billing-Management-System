package com.billing.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Dealer")
public class Dealer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dealer_id;	
	
	@Column(name ="dealer_firstName")
	private String dealer_firstname;
	
	@Column(name ="dealer_lastName")
	private String dealer_lastname;
	
	@Column(name ="dealer_address")
	private String dealer_address;
	
	@Column(name ="PinCode")
	private Long pincode;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city_id;

	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state_id;

	public Long getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(Long dealer_id) {
		this.dealer_id = dealer_id;
	}

	public String getDealer_firstname() {
		return dealer_firstname;
	}

	public void setDealer_firstname(String dealer_firstname) {
		this.dealer_firstname = dealer_firstname;
	}

	public String getDealer_lastname() {
		return dealer_lastname;
	}

	public void setDealer_lastname(String dealer_lastname) {
		this.dealer_lastname = dealer_lastname;
	}

	public String getDealer_address() {
		return dealer_address;
	}

	public void setDealer_address(String dealer_address) {
		this.dealer_address = dealer_address;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public City getCity_id() {
		return city_id;
	}

	public void setCity_id(City city_id) {
		this.city_id = city_id;
	}

	public State getState_id() {
		return state_id;
	}

	public void setState_id(State state_id) {
		this.state_id = state_id;
	}

	
	
}