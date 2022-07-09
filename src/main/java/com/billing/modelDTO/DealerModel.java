package com.billing.modelDTO;



public class DealerModel {
	
	private String dealerFirstName;
	private String dealerLastName;
	private String dealerAddress;
	private Long pincode;
	private String cityName;
	private String stateName;
	public String getDealerFirstName() {
		return dealerFirstName;
	}
	public void setDealerFirstName(String dealerFirstName) {
		this.dealerFirstName = dealerFirstName;
	}
	public String getDealerLastName() {
		return dealerLastName;
	}
	public void setDealerLastName(String dealerLastName) {
		this.dealerLastName = dealerLastName;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public DealerModel(String dealerFirstName, String dealerLastName, String dealerAddress, Long pincode,
			String cityName, String stateName) {
		super();
		this.dealerFirstName = dealerFirstName;
		this.dealerLastName = dealerLastName;
		this.dealerAddress = dealerAddress;
		this.pincode = pincode;
		this.cityName = cityName;
		this.stateName = stateName;
	}
	
	
}
