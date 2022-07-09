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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "retailers", uniqueConstraints={
	    @UniqueConstraint(columnNames = {"shop_name", "first_Name", "last_Name"})
	})
public class Retailer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="retailer_id")
	private Long retailerId;
	
	@Column(name ="shop_name")
	private String shopName;
	
	@Column(name ="first_Name")
	private String firstName;
	
	@Column(name ="last_Name")
	private String lastName; 
	
	@Column(name ="retailer_Address")
	private String retailerAddress;
	
	@Column(name ="retailer_PinCode")
	private Long retailerPincode;
	
	@OneToOne
	@JoinColumn(name="state_id")
	private State stateId;
	
	@OneToOne
	@JoinColumn(name="city_id")
	private City cityId;

	
	public Long getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(Long retailerId) {
		this.retailerId = retailerId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRetailerAddress() {
		return retailerAddress;
	}

	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}

	public Long getRetailerPincode() {
		return retailerPincode;
	}

	public void setRetailerPincode(Long retailerPincode) {
		this.retailerPincode = retailerPincode;
	}

	

	public State getStateId() {
		return stateId;
	}

	public void setStateId(State stateId) {
		this.stateId = stateId;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
	}

	

	

	
	

}