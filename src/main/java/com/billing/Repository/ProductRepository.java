package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
	
	@Query("select p from Product p where p.product_id = :id")
	public Product find(@Param("id") Long id);

}
