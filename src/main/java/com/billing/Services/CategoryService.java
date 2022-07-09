package com.billing.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.CategoryRepository;
import com.billing.entities.Agency;
import com.billing.entities.Category;


@Service
public class CategoryService {
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategory()
	{
		List<Category> list=(List<Category>)this.categoryRepository.findAll();
		return list;
		
	}
	
	//get the single Category by id
	
		public Category getCategoryByid(Long id)
		{
			
			Category category=null;
			try 
			{
				category = this.categoryRepository.getById(id);
				 
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return category;
			
		}
		
		
		//Adding the Category
		
		public Category addCategory(Category c)
		{
			try {
				
				Category result=categoryRepository.save(c);
				return result;
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
			return null;
		}
		

		 //delete Category
		public void deleteCategory(Long cid)
		{
			categoryRepository.deleteById(cid);
		}
		
		
		//update the Category
		
		public Category updateCategory(Category category, Long id)
		{
			
			Category list= categoryRepository.getById(id);
			
			list.setAgencyId(category.getAgencyId());
			
			list.setCategoryCode(category.getCategoryCode());
			
			list.setCategoryName(category.getCategoryName());
		
			list.setStatus(category.getStatus());
			
			categoryRepository.save(list);
			
			return list;
		}
		
		
		//
		
//   public Map<String, Object> fetchByagency()
//   {
//	   List<Category> categoryList = categoryRepository.fetchByagency();
//	   
//	  Map<String, Object> category =new HashMap<>();
//	   
//	 for (Category e : categoryList) {
//		 
//		 category.put("agencyName", e.getAgencyId().getAgencyName());
//		 category.put("categoryName", e.getCategoryName());
//	 }
//		   
//		   
//		   
//	   
//	return category;
//	   
//   }

}
