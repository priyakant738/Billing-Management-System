package com.billing.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.billing.entities.Area;


public interface AreaRepository extends JpaRepository<Area, Long>{
	
//	@Query("select a from Area a where a.areaid = :id")
//	public Area find(@Param("id") Long id);
	
	
//	@Query("SELECT new com.billing.response(a.areaName c.cityName) from AREA a JOIN a.city c")
//	public String getJoinInformation();

}
