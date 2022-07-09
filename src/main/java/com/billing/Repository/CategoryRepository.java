package com.billing.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.Category;
import com.billing.entities.DealerRetailer;


public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
//	@Query("select c from Category c where c.categoryid = :id")
//	public Category find(@Param("id")Long id);
	
	
	
//
//
//	public List<Category> fetchByagency(Category category);

}
