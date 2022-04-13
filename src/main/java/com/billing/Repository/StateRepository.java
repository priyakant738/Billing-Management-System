package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.billing.entities.State;

public interface StateRepository extends JpaRepository<State, Long>{
	
	@Query("select d from Dealer d where d.dealer_id = :id")
	public State find(@Param("id") Long id);

}
