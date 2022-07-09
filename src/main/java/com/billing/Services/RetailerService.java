package com.billing.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.RetailerRepository;
import com.billing.entities.Retailer;
import com.billing.modelDTO.RetailerModel;

@Service
public class RetailerService {
	
	@Autowired
	private RetailerRepository retailerRepository;
	
	//get all retailer
	
	public List<RetailerModel> getAllRetailer()
	{
		List<Retailer> list=(List<Retailer>)this.retailerRepository.findAll();
		
		List<RetailerModel> list1 = new ArrayList<>();
		
		list.forEach(e->{
			list1.add(new RetailerModel(e.getShopName(),e.getFirstName(),
					e.getLastName(),e.getRetailerAddress(),
					e.getRetailerPincode(),e.getStateId().getStateName(),
					e.getCityId().getCityName()));
		});
		
		return list1;
		
	}
	
	//get the single Retailer by id
	
	public Retailer getRetailerByid(Long id)
	{
		
		Retailer retailer=null;
		try 
		{
			retailer = this.retailerRepository.getById(id);
			 
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return retailer;
		
	}
	
	  //Adding the Retailer
	
	   public Retailer addRetailer(Retailer r)
	  {
		Retailer result=retailerRepository.save(r);
		return result;
    
	  }
	
	        //delete Retailer
	   
			public void deleteRetailer(Long rid)
			{
				retailerRepository.deleteById(rid);
			}
			
			//update the Retailer
			
			public Retailer updateRetailer(Retailer retailer, Long id)
			{
				
				Retailer list= retailerRepository.getById(id);
				
				list.setShopName(retailer.getShopName());
				list.setFirstName(retailer.getFirstName());
				list.setLastName(retailer.getLastName());
				list.setRetailerAddress(retailer.getRetailerAddress());
				list.setRetailerPincode(retailer.getRetailerPincode());
				list.setCityId(retailer.getCityId());
				list.setStateId(retailer.getStateId());
				
				retailerRepository.save(list);
				
				return list;
			}
	
			
	
	

}
