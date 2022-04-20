package com.billing.entities;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class SpringAuditor  implements AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		// TODO Auto-generated method stub
		return Optional.ofNullable("Priyakant").filter(p-> !p.isEmpty());
	}
	
	

}
