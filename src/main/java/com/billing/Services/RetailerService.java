package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.RetailerRepository;
import com.billing.entities.Retailer;

@Service
public class RetailerService {
	
	@Autowired
	private RetailerRepository retailerRepository;
	
	public List<Retailer> getAllRetailer()
	{
		List<Retailer> list=(List<Retailer>)this.retailerRepository.findAll();
		return list;
		
	}
	
	//get the single Retailer by id
	
	public Retailer getRetailerByid(Long id)
	{
		
		Retailer retailer=null;
		try 
		{
			retailer = this.retailerRepository.find(id);
			 
			
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
				
				list.getShop_name();
				list.setFirst_name(retailer.getFirst_name());
				list.setLast_name(retailer.getLast_name());
				list.setRetailer_address(retailer.getRetailer_address());
				list.setRetailer_pincode(retailer.getRetailer_pincode());
				
				retailerRepository.save(list);
				
				return list;
			}
	
			
	
	

}
