package com.billing.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.billing.entities.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, Long>{

//	@Query("select d from Dealer d where d.dealer_id = :id")
//	public Dealer findById(@Param("id") Long dealer_id);
	
	@Query("select d from Dealer d where d.dealer_id = :id")
	public Dealer find(@Param("id") Long id);
	
}
