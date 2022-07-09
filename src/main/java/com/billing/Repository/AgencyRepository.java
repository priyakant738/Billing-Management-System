package com.billing.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.Agency;


public interface AgencyRepository extends JpaRepository<Agency, Long>{
	
	
	
//	//SELECT E.firstName FROM Employee E"
//	@Query("select E.agency_name FROM agency E")
//	public List<Agency> getAgencyByName(@Param("E") String agency_name);

}

