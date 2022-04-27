package com.billing.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Retailers")
public class Retailer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long retailer_id;
	
	@Column(name ="shop_name")
	private String shop_name;
	
	@Column(name ="first_name")
	private String first_name;
	
	@Column(name ="last_name")
	private String last_name; 
	
	@Column(name ="retailer_arddress")
	private String retailer_address;
	
	@Column(name ="retailer_pinCode")
	private Long retailer_pincode;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private State state_id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private City city_id;

	public Long getRetailer_id() {
		return retailer_id;
	}

	public void setRetailer_id(Long retailer_id) {
		this.retailer_id = retailer_id;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getRetailer_address() {
		return retailer_address;
	}

	public void setRetailer_address(String retailer_address) {
		this.retailer_address = retailer_address;
	}

	public Long getRetailer_pincode() {
		return retailer_pincode;
	}

	public void setRetailer_pincode(Long retailer_pincode) {
		this.retailer_pincode = retailer_pincode;
	}

	public State getState_id() {
		return state_id;
	}

	public void setState_id(State state_id) {
		this.state_id = state_id;
	}

	public City getCity_id() {
		return city_id;
	}

	public void setCity_id(City city_id) {
		this.city_id = city_id;
	}

	
	
	
	
	

}