package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.Area;

public interface AreaRepository extends JpaRepository<Area, Long>{
	
	@Query("select a from Area a where a.area_id = :id")
	public Area find(@Param("id") Long id);

}
