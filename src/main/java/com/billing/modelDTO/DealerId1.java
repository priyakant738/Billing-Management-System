package com.billing.modelDTO;

import java.util.List;

public class DealerId1 {

	private String dealerFirstName;
	private String dealerLastName;
	private List<RetailerInformation> retailerInformation;
	

	
	public DealerId1(String dealerFirstName, String dealerLastName, List<RetailerInformation> retailerInformation) {
		this.dealerFirstName = dealerFirstName;
		this.dealerLastName = dealerLastName;
		this.retailerInformation = retailerInformation;
	}

	public DealerId1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
     // retailer info
	
	public DealerId1(List<RetailerInformation> retailerInformation) {
		
		this.retailerInformation = retailerInformation;
	}

	//const for dealer
	
	public DealerId1(String dealerFirstName, String dealerLastName) {
		
		this.dealerFirstName = dealerFirstName;
		this.dealerLastName = dealerLastName;
	}

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


	public List<RetailerInformation> getRetailerInformation() {
		return retailerInformation;
	}

	public void setRetailerInformation(List<RetailerInformation> retailerInformation) {
		this.retailerInformation = retailerInformation;
	}

	@Override
	public String toString() {
		return "DealerId1 [dealerFirstName=" + dealerFirstName + ", dealerLastName=" + dealerLastName
				+ ", retailerInformation=" + retailerInformation + "]";
	}
	
	
	
}


