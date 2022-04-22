package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.*;

public interface OrderRepository extends JpaRepository <Order, Long>{
	
	@Query("select o from Order o where o.order_id = :id")
	public Order find(@Param("id") Long id);

}
