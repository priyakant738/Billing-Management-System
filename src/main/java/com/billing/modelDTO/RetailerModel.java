package com.billing.modelDTO;

import com.billing.entities.City;
import com.billing.entities.State;

public class RetailerModel {
	
	
	private String shopName;
	private String firstName;
	private String lastName; 
	private String retailerAddress;
	private Long retailerPincode;
	private String stateName;
	private String cityName;
	
	
	public RetailerModel(String shopName, String firstName, String lastName, String retailerAddress,
			Long retailerPincode, String stateName, String cityName) {
		super();
		this.shopName = shopName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.retailerAddress = retailerAddress;
		this.retailerPincode = retailerPincode;
		this.stateName = stateName;
		this.cityName = cityName;
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
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	
	
}
