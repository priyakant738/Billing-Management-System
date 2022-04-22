package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.DealerRetailer;


public interface DealerRetailerRepository extends JpaRepository<DealerRetailer, Long>{
	
	

}
