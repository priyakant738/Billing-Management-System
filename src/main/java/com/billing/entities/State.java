package com.billing.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "State",
          uniqueConstraints={
	    @UniqueConstraint(columnNames = {"state_Code", "state_Name"})
	}) 
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class State extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "state_id")
	private Long stateId;
	
	@Column(name ="state_Code")
	private String stateCode;
	
	@Column(name ="state_Name")
	private String stateName;

	
	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode; 
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	
	
	


}
