package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.AgencyDealerRepository;
import com.billing.entities.AgencyDealer;


@Service
public class AgencyDealerService {
	
	@Autowired
	public AgencyDealerRepository agencyDealerRepository;
	
	public List<AgencyDealer> getAllAgencyDealer()
	{
		List<AgencyDealer> list=agencyDealerRepository.findAll();
		return list;
	}
	
	//get the single AgencyDeaaler by id
	
	public AgencyDealer getAgencyDealerByid(Long id)
	{
		AgencyDealer agencyDealer = null;
		
		try
		{
			agencyDealer = this.agencyDealerRepository.getById(id);
			
		}
		catch (Exception e){
			
			e.printStackTrace();
			
		}
		
		return agencyDealer;
	}
	
	//Adding the AgencyDealer
	
	public AgencyDealer addAgencyDealer(AgencyDealer ad)
	{
		AgencyDealer result = agencyDealerRepository.save(ad);
		return result;
	}
	
	//delete AgencyDealer
	
	
	public AgencyDealer deleteAgencyDealer(Long adid)
	{
		AgencyDealer  list= agencyDealerRepository.getById(adid);
		agencyDealerRepository.deleteById(adid);
		
		return list;
	}
	
	
	//update the AgencyDealer
	
	public AgencyDealer updateAgencyDealer(AgencyDealer agencyDealer, Long id)
	{
		AgencyDealer list = agencyDealerRepository.getById(id);
		//list.setAgency_id(agencyDealer.getAgency_id());
		//list.setDealer_id(agencyDealer.getDealer_id());
		list.setCategory_id(agencyDealer.getCategory_id());
		list.setProduct_id(agencyDealer.getProduct_id());
		list.setProduct_grossamount(agencyDealer.getProduct_grossamount());
		list.setProduct_netamount(agencyDealer.getProduct_netamount());
		list.setProduct_discount(agencyDealer.getProduct_discount());
		list.setStatus(agencyDealer.getStatus());
		
		return list;

	}
	
	

}
