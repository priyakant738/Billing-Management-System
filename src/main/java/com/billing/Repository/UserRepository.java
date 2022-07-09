package com.billing.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.billing.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
//	@Query("select u from User u where u.user_id = :id")
//	public User find(@Param("id") Long id);

}
