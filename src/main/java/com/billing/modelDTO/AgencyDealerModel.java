package com.billing.modelDTO;



public class AgencyDealerModel {
	
	private String agencyName;
	private String dealerFirstName;
	private String dealerLastName;
	private String categoryName;
	private String productName;
	private Long productGrossamount;
	private Long productNetamount;
	private Long productDiscount;
	private String status;
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getProductGrossamount() {
		return productGrossamount;
	}
	public void setProductGrossamount(Long productGrossamount) {
		this.productGrossamount = productGrossamount;
	}
	public Long getProductNetamount() {
		return productNetamount;
	}
	public void setProductNetamount(Long productNetamount) {
		this.productNetamount = productNetamount;
	}
	public Long getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(Long productDiscount) {
		this.productDiscount = productDiscount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public AgencyDealerModel(String agencyName, String dealerFirstName, String dealerLastName, String categoryName,
			String productName, Long productGrossamount, Long productNetamount, Long productDiscount, String status) {
		super();
		this.agencyName = agencyName;
		this.dealerFirstName = dealerFirstName;
		this.dealerLastName = dealerLastName;
		this.categoryName = categoryName;
		this.productName = productName;
		this.productGrossamount = productGrossamount;
		this.productNetamount = productNetamount;
		this.productDiscount = productDiscount;
		this.status = status;
	}
	
	
	
	
	
	
}
