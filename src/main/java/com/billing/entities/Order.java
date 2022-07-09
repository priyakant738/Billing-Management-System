package com.billing.entities;




import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="order_id")
	private Long orderId;
	
	@OneToOne
	@JoinColumn(name="agency_id")
	private Agency agencyId;
	
	@OneToOne
	@JoinColumn(name="dealer_id")
	private Dealer dealerId;
	
	@OneToOne
	@JoinColumn(name="retailer_id")
	private Retailer retailerId;
	
	@Column(name ="gross_Amount")
	private Long grossAmount;
	
	@Column(name ="discount_Amount")
	private Long discountAmount;
	
	@Column(name ="net_Amount")
	private Long netAmount;
	
	@Column(name ="order_Number")
	private String orderNumber;
	
	@Column(name ="order_Date")
	private String orderDate;
	
	@Column(name ="order_Status")
	private String orderStatus;
	

	@Column(name ="order_Type")
	private String orderType;
	
	@Column(name ="order_Duedate")
	private String orderDuedate;
	
	@Column(name ="payment_Type")
	private String paymentType;
	
	
	@Column(name ="payment_Date")
	private String paymentDate;
	
	@Column(name ="payment_Id")
	private Long paymentid;
	
	@Column(name ="payment_Mode")
	private String paymentMode;
	
	@Column(name ="payment_Status")
	private String paymentStatus;


	

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
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

	public Retailer getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(Retailer retailerId) {
		this.retailerId = retailerId;
	}

	public Long getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(Long grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Long getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Long discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Long getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(Long netAmount) {
		this.netAmount = netAmount;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderDuedate() {
		return orderDuedate;
	}

	public void setOrderDuedate(String orderDuedate) {
		this.orderDuedate = orderDuedate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Long getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(Long paymentid) {
		this.paymentid = paymentid;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	

	

	
	
	
	
	
}
