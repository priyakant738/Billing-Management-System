package com.billing.modelDTO;

import com.billing.entities.City;

public class AreaModel {
	
	private Long areaCode;
	private String areaName;
	private String cityName;
	
	
	public AreaModel(Long areaCode, String areaName, String cityName) {
		super();
		this.areaCode = areaCode;
		this.areaName = areaName;
		this.cityName = cityName;
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
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
	

}
