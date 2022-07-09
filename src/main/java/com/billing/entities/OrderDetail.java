package com.billing.entities;



import java.util.List;

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
@Table(name = "OrderDetail")
public class OrderDetail extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="orderdetail_id")
	private Long orderdetailId;
	
	@OneToOne
	@JoinColumn(name = "product_id")
	private Product productId;
	
	@Column(name ="product_Qty")
	private Long productQty;
	
	@Column(name ="product_Amount")
	private Long productAmount;
	
	@Column(name ="product_Grossamount")
	private Long productGrossamount;
	
	@Column(name ="product_Discount")
	private Long productDiscount;
	
	@Column(name ="product_Netamount")
	private Long productNetamount;

	@OneToMany
	private List<Order> orderId;

	
	

	

	public Long getOrderdetailId() {
		return orderdetailId;
	}

	public void setOrderdetailId(Long orderdetailId) {
		this.orderdetailId = orderdetailId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Long getProductQty() {
		return productQty;
	}

	public void setProductQty(Long productQty) {
		this.productQty = productQty;
	}

	public Long getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(Long productAmount) {
		this.productAmount = productAmount;
	}

	public Long getProductGrossamount() {
		return productGrossamount;
	}

	public void setProductGrossamount(Long productGrossamount) {
		this.productGrossamount = productGrossamount;
	}

	public Long getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(Long productDiscount) {
		this.productDiscount = productDiscount;
	}

	public Long getProductNetamount() {
		return productNetamount;
	}

	public void setProductNetamount(Long productNetamount) {
		this.productNetamount = productNetamount;
	}

	public List<Order> getOrderId() {
		return orderId;
	}

	public void setOrderId(List<Order> orderId) {
		this.orderId = orderId;
	}



	

	
	
	

}
