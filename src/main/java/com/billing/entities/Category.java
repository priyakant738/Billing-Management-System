package com.billing.entities;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category extends BaseClass<String> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long category_id;


	
	@ManyToOne
	@JoinColumn(name = "agency_id")
	private Agency agency_id;
	
	
	@Column(name ="category_code")
	private String category_code;
	
	@Column(name ="category_name")
	private String category_name;
	
	@Column(name ="status")
	private String status;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Product> product;

//	@ManyToOne
//	private AgencyDealer AgencyDealer;
//	
//	@ManyToOne
//	private DealerRetailer DealerRetailer;

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public Agency getAgency_id() {
		return agency_id;
	}

	public void setAgency_id(Agency agency_id) {
		this.agency_id = agency_id;
	}

	public String getCategory_code() {
		return category_code;
	}

	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

//	public AgencyDealer getAgencyDealer() {
//		return AgencyDealer;
//	}
//
//	public void setAgencyDealer(AgencyDealer agencyDealer) {
//		AgencyDealer = agencyDealer;
//	}
//
//	public DealerRetailer getDealerRetailer() {
//		return DealerRetailer;
//	}
//
//	public void setDealerRetailer(DealerRetailer dealerRetailer) {
//		DealerRetailer = dealerRetailer;
//	}

	
	
	
	

}
