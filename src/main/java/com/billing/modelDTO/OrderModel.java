package com.billing.modelDTO;

public class OrderModel {
	
	private String agencyName;
	private String ownerFirstName;
	private String ownerLastName;
	private String agencyAddress;
	private String agencyPincode;
	
	
	private String dealerFirstName;
	private String dealerLastName;
	private String dealerAddress;
	private Long pincode;
	
	private String shopName;
	private String firstName;
	private String lastName; 
	private String retailerAddress;
	private Long retailerPincode;
	
	private Long grossAmount;
	private Long discountAmount;
	private Long netAmount;
	private String orderNumber;
	private String orderDate;
	private String orderStatus;
	private String orderType;
	private String orderDuedate;
	private String paymentType;
	private String paymentDate;
	private String paymentMode;
	private String paymentStatus;
	
	
	
	
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getOwnerFirstName() {
		return ownerFirstName;
	}
	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}
	public String getOwnerLastName() {
		return ownerLastName;
	}
	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}
	public String getAgencyAddress() {
		return agencyAddress;
	}
	public void setAgencyAddress(String agencyAddress) {
		this.agencyAddress = agencyAddress;
	}
	public String getAgencyPincode() {
		return agencyPincode;
	}
	public void setAgencyPincode(String agencyPincode) {
		this.agencyPincode = agencyPincode;
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
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRetailerAddress() {
		return retailerAddress;
	}
	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}
	public Long getRetailerPincode() {
		return retailerPincode;
	}
	public void setRetailerPincode(Long retailerPincode) {
		this.retailerPincode = retailerPincode;
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
	public OrderModel(String agencyName, String ownerFirstName, String ownerLastName, String agencyAddress,
			String agencyPincode, String dealerFirstName, String dealerLastName, String dealerAddress, Long pincode,
			String shopName, String firstName, String lastName, String retailerAddress, Long retailerPincode,
			Long grossAmount, Long discountAmount, Long netAmount, String orderNumber, String orderDate,
			String orderStatus, String orderType, String orderDuedate, String paymentType, String paymentDate,
			String paymentMode, String paymentStatus) {
		super();
		this.agencyName = agencyName;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.agencyAddress = agencyAddress;
		this.agencyPincode = agencyPincode;
		this.dealerFirstName = dealerFirstName;
		this.dealerLastName = dealerLastName;
		this.dealerAddress = dealerAddress;
		this.pincode = pincode;
		this.shopName = shopName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.retailerAddress = retailerAddress;
		this.retailerPincode = retailerPincode;
		this.grossAmount = grossAmount;
		this.discountAmount = discountAmount;
		this.netAmount = netAmount;
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.orderType = orderType;
		this.orderDuedate = orderDuedate;
		this.paymentType = paymentType;
		this.paymentDate = paymentDate;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
	}
	public OrderModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
	
	
	
	
	

}
