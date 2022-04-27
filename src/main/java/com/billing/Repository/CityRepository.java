package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billing.entities.City;
import com.billing.entities.State;


	public interface CityRepository extends JpaRepository<City, Long>{
		
		@Query("select c from City c where c.city_id = :id")
		public City find(@Param("id") Long id);
		
		//City findStateId(State stateId);

}
