package com.billing.modelDTO;

import com.billing.entities.Category;
import com.billing.entities.Dealer;
import com.billing.entities.Product;
import com.billing.entities.Retailer;

public class DealerRetailerModel {
	
	private String dealerFirstName;
	private String dealerLastName;
	private String dealerAddress;
	private Long pincode;
	
	private String shopName;
	private String firstName;
	private String lastName; 
	private String retailerAddress;
	private Long retailerPincode;
	
	private String categoryCode;
	private String categoryName;
	
	private String productGrossamount;
	private String productNetamount;
	private String productDiscount;
	private String status;
	
	
	public DealerRetailerModel(String dealerFirstName, String dealerLastName, String dealerAddress, Long pincode,
			String shopName, String firstName, String lastName, String retailerAddress, Long retailerPincode,
			String categoryCode, String categoryName, String productGrossamount, String productNetamount,
			String productDiscount, String status) {
		super();
		this.dealerFirstName = dealerFirstName;
		this.dealerLastName = dealerLastName;
		this.dealerAddress = dealerAddress;
		this.pincode = pincode;
		this.shopName = shopName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.retailerAddress = retailerAddress;
		this.retailerPincode = retailerPincode;
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
		this.productGrossamount = productGrossamount;
		this.productNetamount = productNetamount;
		this.productDiscount = productDiscount;
		this.status = status;
	}
	public DealerRetailerModel(String dealerFirstname2, String dealerLastName2, Retailer retailerId) {
		// TODO Auto-generated constructor stub
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
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getProductGrossamount() {
		return productGrossamount;
	}
	public void setProductGrossamount(String productGrossamount) {
		this.productGrossamount = productGrossamount;
	}
	public String getProductNetamount() {
		return productNetamount;
	}
	public void setProductNetamount(String productNetamount) {
		this.productNetamount = productNetamount;
	}
	public String getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(String productDiscount) {
		this.productDiscount = productDiscount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
