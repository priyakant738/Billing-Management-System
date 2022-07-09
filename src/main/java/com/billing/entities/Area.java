package com.billing.entities;

import javax.persistence.*;

@Entity
@Table(name = "Area"  , uniqueConstraints={
	    @UniqueConstraint(columnNames = {"area_Code", "area_Name"})
	})

public class Area extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name="area_id")
	private Long areaId;
	
	@ManyToOne
	@JoinColumn(name="city")
	private City cityId;
	
	@Column(name ="area_Code")
	private Long areaCode;
	
	@Column(name ="area_Name")
	private String areaName;

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
	}

	public Long getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	

	

	

}
