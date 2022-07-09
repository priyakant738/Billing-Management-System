package com.billing.modelDTO;

public class RetailerInformation {

	private String retailerFirstName;
	private String retailerLastName;
	private String shopName;
	
	
	public RetailerInformation(String retailerFirstName, String retailerLastName, String shopName) {
		super();
		this.retailerFirstName = retailerFirstName;
		this.retailerLastName = retailerLastName;
		this.shopName = shopName;
	}

	public String getRetailerFirstName() {
		return retailerFirstName;
	}
	public void setRetailerFirstName(String retailerFirstName) {
		this.retailerFirstName = retailerFirstName;
	}
	public String getRetailerLastName() {
		return retailerLastName;
	}
	public void setRetailerLastName(String retailerLastName) {
		this.retailerLastName = retailerLastName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	
}

