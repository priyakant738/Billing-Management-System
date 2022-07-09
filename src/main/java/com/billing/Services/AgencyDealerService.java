package com.billing.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.AgencyDealerRepository;
import com.billing.entities.AgencyDealer;
import com.billing.modelDTO.AgencyDealerModel;


@Service
public class AgencyDealerService {
	
	@Autowired
	public AgencyDealerRepository agencyDealerRepository;
	
	public List<AgencyDealerModel> getAllAgencyDealer()
	{
		List<AgencyDealer> list=agencyDealerRepository.findAll();
		
		List<AgencyDealerModel> list1 = new ArrayList<>();
		
		list.forEach(e->{
			list1.add(new AgencyDealerModel(e.getAgencyId().getAgencyName(),e.getDealerId().getDealerFirstname(),
					e.getDealerId().getDealerLastName(),e.getCategoryId().getCategoryName(),e.getProductId().getProductName(),
					e.getProductGrossamount(),e.getProductNetamount(),e.getProductDiscount(),e.getStatus()));
			
		});
		
		return list1;
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
		List<Long> list = amount(ad.getProductGrossamount());
		
		ad.setProductDiscount(list.get(0));
		ad.setProductNetamount(list.get(1));
		
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
		list.setAgencyId(agencyDealer.getAgencyId());
		list.setDealerId(agencyDealer.getDealerId());
		list.setCategoryId(agencyDealer.getCategoryId());
		list.setProductId(agencyDealer.getProductId());
		list.setProductGrossamount(agencyDealer.getProductGrossamount());
		list.setProductNetamount(agencyDealer.getProductNetamount());
		list.setProductDiscount(agencyDealer.getProductDiscount());
		list.setStatus(agencyDealer.getStatus());
		
		agencyDealerRepository.save(list);
		
		return list;

	}
	
	// calculation of the amount
	
	public List<Long> amount (Long productGrossamount)
	{
		Long d=0L;
	  List<Long> list = new ArrayList<>();
	  
	 if (productGrossamount <= 10000) {
         d = 10L;
         list.add(0,d);
	 }
     else if (productGrossamount <= 20000) {
         d = 15L;
         list.add(0,d);
     }
     else {
         d = 20L;
         list.add(0,d);
     }
         
     Long productDiscount = (long) (productGrossamount * d / 100.0);
     Long finalAmt = productGrossamount - productDiscount;
	 list.add(1,finalAmt);
     return list;
	}
	

}
