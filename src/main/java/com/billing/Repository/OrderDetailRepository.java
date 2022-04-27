package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.City;
import com.billing.entities.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{
	
//	@Query("select o from OrderDetail o where o.orderdetail_id = :id")
//	public City find(@Param("id") Long id);
	

}
