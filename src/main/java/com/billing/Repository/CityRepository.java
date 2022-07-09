package com.billing.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.billing.entities.City;



	public interface CityRepository extends JpaRepository<City, Long>{
		
//		@Query("select c from City c where c.cityid = :id")
//		public City find(@Param("id") Long id);
//		
		
//		@Query("select c from City c WHERE c.city_code =:n and c.city_name =:p")
//		public List<City> getCityByName(@Param("n") String name, @Param("p") String city);
		
		//City findStateId(State stateId);

}
