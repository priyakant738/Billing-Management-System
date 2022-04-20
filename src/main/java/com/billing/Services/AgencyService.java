package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.AgencyRepository;
import com.billing.entities.Agency;

@Service
public class AgencyService {
	
	@Autowired
	private AgencyRepository agencyRepository;
	
	public List<Agency>getAllAgency()
	{
		List<Agency> list=(List<Agency>)this.agencyRepository.findAll();
		return list;
	}
	
	//get the single agency by id
	
	public Agency getAgencyByid(Long id)
	{
		
		Agency agency=null;
		try 
		{
			 agency = this.agencyRepository.find(id);
			 
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return agency;
		
	}
	
	//Adding the agency
	
	public Agency addAgency(Agency a)
	{
		Agency result=agencyRepository.save(a);
		return result;
		
	}
	
	//delete Agency
	public void deleteAgency(Long aid)
	{
		agencyRepository.deleteById(aid);
	}
	
	//update the Agency
	
	public void updateAgency(Agency agency, Long id)
	{
		Agency list = agencyRepository.getById(id);
		
		list.setAgency_name(agency.getAgency_name());
		list.setOwner_first_name(agency.getOwner_first_name());
		list.setOwner_last_name(agency.getOwner_last_name());
		list.setAgency_address(agency.getAgency_address());
		list.setAgency_pincode(agency.getAgency_pincode());
		list.setCity_id(agency.getCity_id());
		list.setState_id(agency.getState_id());
		list.setPancard(agency.getPancard());
		list.setGstin_number(agency.getGstin_number());
	}

}
