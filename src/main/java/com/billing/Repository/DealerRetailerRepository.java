package com.billing.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.billing.entities.Dealer;
import com.billing.entities.DealerRetailer;
import com.billing.modelDTO.DealerRetailerModel;


public interface DealerRetailerRepository extends JpaRepository<DealerRetailer, Long>{
	

	@Query("select dr from DealerRetailer dr where dr.dealerId.dealerId = :id")
	public List<DealerRetailer>featchRetailerByDealer(@Param("id") Long id);

//	public List<DealerRetailer> findByDealerId(Long Id);
	
//	 List<DealerRetailer> featchRetailerByDealer(Long Id);
	
//	public List<DealerRetailer>featchRetailerByDealer(Long Id);
	
	

}
