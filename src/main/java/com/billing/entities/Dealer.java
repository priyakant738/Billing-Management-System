package com.billing.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Dealer", uniqueConstraints={
	    @UniqueConstraint(columnNames = {"dealer_FirstName", "dealer_LastName"
	    		,"dealer_Address"})
	})
public class Dealer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="dealer_id")
	private Long dealerId;	
	
	@Column(name ="dealer_FirstName")
	private String dealerFirstName;
	
	@Column(name ="dealer_LastName")
	private String dealerLastName;
	
	@Column(name ="dealer_Address")
	private String dealerAddress;
	
	@Column(name ="PinCode")
	private Long pincode;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City cityId;

	@ManyToOne
	@JoinColumn(name = "state_id")
	private State stateId;

	

	public Long getDealerId() {
		return dealerId;
	}

	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerFirstname() {
		return dealerFirstName;
	}

	public void setDealerFirstname(String dealerFirstname) {
		this.dealerFirstName = dealerFirstname;
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

	public String getDealerFirstName() {
		return dealerFirstName;
	}

	public void setDealerFirstName(String dealerFirstName) {
		this.dealerFirstName = dealerFirstName;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
	}

	public State getStateId() {
		return stateId;
	}

	public void setStateId(State stateId) {
		this.stateId = stateId;
	}

	@Override
	public String toString() {
		return "Dealer [cityId=" + cityId 
		+ ", dealerAddress=" + dealerAddress 
		+ ", dealerFirstName=" + dealerFirstName
				+ ", dealerId=" + dealerId 
				+ ", dealerLastName=" + dealerLastName 
				+ ", pincode=" + pincode
				+ ", stateId=" + stateId + "]";
	}

	

	
   
	

	
}