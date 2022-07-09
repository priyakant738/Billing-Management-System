package com.billing.entities;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Product", uniqueConstraints={
	    @UniqueConstraint(columnNames = {"Product_Name", "Product_Code"})
	})
public class Product extends BaseClass<String>{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="product_id")
	private Long productId;
	
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category categoryId;
	
	@ManyToOne
	@JoinColumn(name = "agency_id")
	private Agency agencyId;
	 
	@Column(name ="Product_Name")
	private String productName;
	
	@Column(name ="Product_Code")
	private Long productCode;	
	
	@Column(name ="Product_Price")
	private Long productPrice;
	
	@Column(name ="Product_Desc")
	private String productDesc;
	
	@Column(name ="Product_Status")
	private String productStatus;





	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}

	public Agency getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Agency agencyId) {
		this.agencyId = agencyId;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getProduct_Code() {
		return productCode;
	}

	public void setProduct_Code(Long product_Code) {
		this.productCode = product_Code;
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

	

	
	
}
