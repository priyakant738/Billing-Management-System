package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	@Query("select c from Category c where c.category_id = :id")
	public Category find(@Param("id")Long id);

}
