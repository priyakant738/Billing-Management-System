package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.Agency;


public interface AgencyRepository extends JpaRepository<Agency, Long>{
	
	@Query("select a from Agency a where a.agency_id = :id")
	public Agency find(@Param("id") Long id);

}
