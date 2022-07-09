package com.billing.entities;

import java.util.List;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "agency_dealer")
public class AgencyDealer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="agencydealer_id")
	private Long agencydealerId;
	  
   @OneToOne
   @JoinColumn(name = "agency_id")
   private Agency agencyId;
   
   @OneToOne
   @JoinColumn(name = "dealer_id")
   private Dealer dealerId;
   
   @OneToOne
   @JoinColumn(name = "cagegory_id")
   private Category categoryId;
 
   @OneToOne
   @JoinColumn(name = "product_id")
   private Product productId;
	
	
	@Column(name ="product_Grossamount")
	private Long productGrossamount;
	 
	@Column(name ="product_Netamount")
	private Long productNetamount;
	 
	@Column(name ="product_Discount")
	private Long productDiscount;
	
	@Column(name ="status")
	private String status;


	public Long getAgencydealerId() {
		return agencydealerId;
	}

	public void setAgencydealerId(Long agencydealerId) {
		this.agencydealerId = agencydealerId;
	}



	

	

	public Agency getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Agency agencyId) {
		this.agencyId = agencyId;
	}

	public Dealer getDealerId() {
		return dealerId;
	}

	public void setDealerId(Dealer dealerId) {
		this.dealerId = dealerId;
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

	
	
	

}
