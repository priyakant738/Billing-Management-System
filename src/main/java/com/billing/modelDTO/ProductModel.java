package com.billing.modelDTO;

import com.billing.entities.Agency;
import com.billing.entities.Category;

public class ProductModel {

	private String productName;
	private Long productCode;
	private Long productPrice;
	private String productDesc;
	private String productStatus;
	
	private String categoryName;
	private String agencyName;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getProductCode() {
		return productCode;
	}
	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public ProductModel(String productName, Long productCode, Long productPrice, String productDesc,
			String productStatus, String categoryName, String agencyName) {
		super();
		this.productName = productName;
		this.productCode = productCode;
		this.productPrice = productPrice;
		this.productDesc = productDesc;
		this.productStatus = productStatus;
		this.categoryName = categoryName;
		this.agencyName = agencyName;
	}
	
	
	
	
	
}
