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
import javax.persistence.Table;

@Entity
@Table(name = "AgencyDealer")
public class AgencyDealer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long agencydealer_id;
	  
   @OneToMany(targetEntity = AgencyDealer.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   @JoinColumn(name = "agency_id")
   private List<Agency> agency_id = new ArrayList<>();
   
   @OneToMany(targetEntity = AgencyDealer.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   @JoinColumn(name = "dealer_id")
   private List<Dealer> dealer_id = new ArrayList<>();
   
   @OneToMany(targetEntity = AgencyDealer.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   @JoinColumn(name = "cagegory_id")
   private List<Category> category_id = new ArrayList<>();
 
   @OneToMany(targetEntity = AgencyDealer.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   @JoinColumn(name = "product_id")
   private List<Product> product_id = new ArrayList<>();
	
	
	@Column(name ="product_grossamount")
	private Long product_grossamount;
	 
	@Column(name ="product_getamount")
	private Long product_netamount;
	 
	@Column(name ="product_discount")
	private Long product_discount;
	
	@Column(name ="status")
	private String status;

	public Long getAgency_dealer_id() {
		return agencydealer_id;
	}

	public void setAgency_dealer_id(Long agency_dealer_id) {
		this.agencydealer_id = agency_dealer_id;
	}

	public List<Agency> getAgency_id() {
		return agency_id;
	}

	public void setAgency_id(List<Agency> agency_id) {
		this.agency_id = agency_id;
	}

	public List<Dealer> getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(List<Dealer> dealer_id) {
		this.dealer_id = dealer_id;
	}

	public List<Category> getCategory_id() {
		return category_id;
	}

	public void setCategory_id(List<Category> category_id) {
		this.category_id = category_id;
	}

	public List<Product> getProduct_id() {
		return product_id;
	}

	public void setProduct_id(List<Product> product_id) {
		this.product_id = product_id;
	}

	public Long getProduct_grossamount() {
		return product_grossamount;
	}

	public void setProduct_grossamount(Long product_grossamount) {
		this.product_grossamount = product_grossamount;
	}

	public Long getProduct_netamount() {
		return product_netamount;
	}

	public void setProduct_netamount(Long product_netamount) {
		this.product_netamount = product_netamount;
	}

	public Long getProduct_discount() {
		return product_discount;
	}

	public void setProduct_discount(Long product_discount) {
		this.product_discount = product_discount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	

}
