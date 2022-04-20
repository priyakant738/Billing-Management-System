package com.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.billing.entities.SpringAuditor;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef="auditorAware")
public class BillingManagementSystems1Application {
	
	@Bean
	public AuditorAware<String> auditorAware()
	{
		return new SpringAuditor();
		
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(BillingManagementSystems1Application.class, args);
	}

}
