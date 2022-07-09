package com.billing.entities;

import javax.persistence.*;

@Entity
@Table(name = "dealerretailer")
public class DealerRetailer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="dealerretailer_Id")
	private Long dealerretailerid;
	
	@OneToOne
	@JoinColumn(name = "dealer_id")
	private Dealer dealerId;
	
	@OneToOne
	@JoinColumn(name = "retailer_id")
	private Retailer retailerId;
	
	@OneToOne
	@JoinColumn(name = "category_id")
	private Category categoryId;
	
	@OneToOne
	@JoinColumn(name = "product_id")
	private Product productId;

	@Column(name ="product_Grossamount")
	private String productGrossamount;
	
	@Column(name ="product_Netamount")
	private String productNetamount;
	
	@Column(name ="product_Discount")
	private String productDiscount;
	
	@Column(name ="status")
	private String status;

	public Long getDealerretailerid() {
		return dealerretailerid;
	}

	public void setDealerretailerid(Long dealerretailerid) {
		this.dealerretailerid = dealerretailerid;
	}

	

	public Dealer getDealerId() {
		return dealerId;
	}

	public void setDealerId(Dealer dealerId) {
		this.dealerId = dealerId;
	}

	public Retailer getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(Retailer retailerId) {
		this.retailerId = retailerId;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
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
