package com.billing.Services;

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

@Service
public class AgencyService {
	
	@Autowired
	private AgencyRepository agencyRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;

	private String agency_name;
	
	
	public List<Agency>getAllAgency()
	{
		List<Agency> list=(List<Agency>)this.agencyRepository.findAll();
		return list;
	}
	
	
	
	
	
	//Adding the Agency
	
		public Agency addAgency(Map<String,Object> mp)
		{
			Agency result=null;
			try {
				
				String agencyName = (String) mp.get("agency_name");
				String owner_first_name = (String) mp.get("owner_first_name");
				String owner_last_name = (String) mp.get("owner_last_name");
                String agency_address = (String) mp.get("agency_address");
                String agency_pincode = (String) mp.get("agency_pincode");
                String pancard = (String) mp.get("pancard");
				String gstin_number = (String) mp.get("gstin_number");
				
				
				
				Long stateId =  Long.parseLong((String) mp.get("state_id"));
				Optional<State> state = stateRepository.findById(stateId);
				
				Long cityId =  Long.parseLong((String) mp.get("city_id"));
				Optional<City> city = cityRepository.findById(cityId);
				
				Agency agency = new Agency();
				agency.setAgency_name(agency_name);
				agency.setOwner_first_name(owner_first_name);
				agency.setOwner_last_name(owner_last_name);
				agency.setAgency_address(agency_address);
				agency.setAgency_pincode(agency_pincode);
				agency.setPancard(pancard);
				agency.setGstin_number(gstin_number);
				
				agency.setState_id(state.get());
				agency.setCity_id(city.get());
				
							
				 result=agencyRepository.save(agency);
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
		   
			return result;
					
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
