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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Category")
//    , uniqueConstraints={
//	    @UniqueConstraint(columnNames = {"category_Code", "category_Name"})
//	})
public class Category extends BaseClass<String> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private Long categoryId;


	
	@ManyToOne
	@JoinColumn(name = "agency_id")
	private Agency agencyId;
	
	
	@Column(name ="category_Code")
	private String categoryCode;
	
	@Column(name ="category_Name")
	private String categoryName;
	
	@Column(name ="status")
	private String status;

	
	

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Agency getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Agency agencyId) {
		this.agencyId = agencyId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
}