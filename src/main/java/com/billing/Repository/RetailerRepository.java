package com.billing.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.billing.entities.Retailer;

public interface RetailerRepository extends JpaRepository<Retailer, Long>{
	
//	@Query("select r from Retailer r where r.retailerid = :id")
//	public Retailer find(@Param("id") Long id);
	

}
