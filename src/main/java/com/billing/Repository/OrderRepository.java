package com.billing.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.*;

public interface OrderRepository extends JpaRepository <Order, Long>{
	
//	@Query("select o from Order o where o.orderid = :id")
//	public Order find(@Param("id") Long id);
	

    @Query("select o FROM Order o WHERE o.orderDate BETWEEN :fromDate AND :toDate")
    public List<Order> GetOrdersByDate(@Param("fromDate") String fromDate, @Param("toDate") String toDate);

}
