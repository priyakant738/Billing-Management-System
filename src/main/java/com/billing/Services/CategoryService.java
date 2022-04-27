package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.CategoryRepository;
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
				category = this.categoryRepository.find(id);
				 
				
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
			Category result=categoryRepository.save(c);
			return result;
			
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
			
			list.setAgency_id(category.getAgency_id());
			
			list.setCategory_code(category.getCategory_code());
			
			list.setCategory_name(category.getCategory_name());
			
			list.setStatus(category.getStatus());
			
			categoryRepository.save(list);
			
			return list;
		}

}
