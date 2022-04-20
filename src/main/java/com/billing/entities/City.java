package com.billing.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class City extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long city_id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="state_id")
	private State state_id;
	
	@Column(name ="city_code")
	private Long city_code;
	
	@Column(name ="city_name")
	private String city_name;

	public Long getCity_id() {
		return city_id;
	}

	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}

	public State getState_id() {
		return state_id;
	}

	public void setState_id(State state_id) {
		this.state_id = state_id;
	}

	public Long getCity_code() {
		return city_code;
	}

	public void setCity_code(Long city_code) {
		this.city_code = city_code;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	
	
	

}
