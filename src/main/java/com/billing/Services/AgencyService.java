package com.billing.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.AgencyRepository;
import com.billing.Repository.CityRepository;
import com.billing.Repository.ProductRepository;
import com.billing.Repository.StateRepository;
import com.billing.entities.Agency;
import com.billing.entities.City;
import com.billing.entities.State;
import com.billing.modelDTO.AgencyModel;

@Service
public class AgencyService {
	
	@Autowired
	private AgencyRepository agencyRepository;
	

	
	
	public List<AgencyModel>getAllAgency()
	{
		List<Agency> list=(List<Agency>)this.agencyRepository.findAll();
		
		List<AgencyModel> list1 = new ArrayList<>();
		
		list.forEach(e->{
			list1.add(new AgencyModel(e.getAgencyName(),e.getOwnerFirstName(),e.getOwnerLastname(),
					e.getAgencyAddress(),e.getAgencyPincode(),e.getPancard(),e.getGstinNumber(),
					e.getCityId().getCityName(),e.getStateId().getStateName()));
		});
		
		
		return list1;
	}
	
	
	
	
	
	//Adding the Agency
	
	public Agency addAgency(Agency a)
	{
		Agency result=agencyRepository.save(a);
		return result;
				
	}
	
	
	
	
	//get the single agency by id
	
	public Agency getAgencyByid(Long id)
	{
		
		Agency agency=null;
		try 
		{
			 agency = this.agencyRepository.getById(id);
			 
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return agency;
		
	}
	
	
	
	//delete Agency
	public void deleteAgency(Long aid)
	{
		agencyRepository.deleteById(aid);
	}
	
	//update the Agency
	
	public Agency updateAgency(Agency agency, Long id)
	{
		Agency list = agencyRepository.getById(id);
		
		list.setAgencyName(agency.getAgencyName());
		list.setOwnerFirstName(agency.getOwnerFirstName());
		list.setOwnerLastname(agency.getOwnerLastname());
		list.setAgencyAddress(agency.getAgencyAddress());
		list.setAgencyPincode(agency.getAgencyPincode());
		list.setCityId(agency.getCityId());
		list.setStateId(agency.getStateId());
		list.setPancard(agency.getPancard());
		list.setGstinNumber(agency.getGstinNumber());
		
		 agencyRepository.save(list);
		 
		 return list;
	}

}
