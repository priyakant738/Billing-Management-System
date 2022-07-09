package com.billing.modelDTO;

import com.billing.entities.City;
import com.billing.entities.State;

public class AgencyModel {
	
	private String agencyName;
	private String ownerFirstName;
	private String ownerLastName;
	private String agencyAddress;
	private String agencyPincode;
	private String pancard;
	private String gstinNumber;
	
	private String stateName;
	private String cityName;
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getOwnerFirstName() {
		return ownerFirstName;
	}
	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}
	public String getOwnerLastName() {
		return ownerLastName;
	}
	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}
	public String getAgencyAddress() {
		return agencyAddress;
	}
	public void setAgencyAddress(String agencyAddress) {
		this.agencyAddress = agencyAddress;
	}
	public String getAgencyPincode() {
		return agencyPincode;
	}
	public void setAgencyPincode(String agencyPincode) {
		this.agencyPincode = agencyPincode;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getGstinNumber() {
		return gstinNumber;
	}
	public void setGstinNumber(String gstinNumber) {
		this.gstinNumber = gstinNumber;
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
	public AgencyModel(String agencyName, String ownerFirstName, String ownerLastName, String agencyAddress,
			String agencyPincode, String pancard, String gstinNumber, String stateName, String cityName) {
		super();
		this.agencyName = agencyName;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.agencyAddress = agencyAddress;
		this.agencyPincode = agencyPincode;
		this.pancard = pancard;
		this.gstinNumber = gstinNumber;
		this.stateName = stateName;
		this.cityName = cityName;
	}
	
	

}
