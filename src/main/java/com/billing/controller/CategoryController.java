package com.billing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.billing.Services.CategoryService;
import com.billing.entities.Category;


@Controller
public class CategoryController {
	
	
	    @Autowired
		private CategoryService categoryService;
	    
	  //get all Category handler

		@GetMapping("/category/getAllcategory")
		public ResponseEntity<List<Category>> getCategory()
		{
			List<Category>list = categoryService.getAllCategory();
			if(list.size()<= 0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(list));
		}
		
		//get single category  handler
		@GetMapping("/category/getByid/{id}")
		public ResponseEntity<Category> getCategory(@PathVariable("id")Long id)
		{
			Category category = categoryService.getCategoryByid(id);
			if(category==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			return ResponseEntity.of(Optional.of(category));
		}
	
		    //new Category handler
		
				@PostMapping("/category/addcategory")
				public ResponseEntity<Category> addCategory(@RequestBody Category category)
				{
					Category c = null;
					
					try
					{
						c = this.categoryService.addCategory(category);
						
						return ResponseEntity.status(HttpStatus.CREATED).build();
						
					}
					 catch(Exception e)
					{
						 e.printStackTrace();
						 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
					}
					
				}
				
				//delete Category handler
				
				@DeleteMapping("/category/deleteByid/{id}")
				public ResponseEntity<Category> deleteCategory(@PathVariable("id")Long id)
				{
					try
				  {
					this.categoryService.deleteCategory(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				   }
					catch(Exception e)
					{
					  e.printStackTrace();
					  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
					}
				}
								
				
				//update category handler
				@PutMapping("/category/updateByid/{id}")
				public ResponseEntity<Category> updateCategory(@RequestBody Category category,@PathVariable("id") Long id)
				{
				  try {
					  Category List=((CategoryService) this.categoryService).updateCategory(category, id);
					  return ResponseEntity.status(HttpStatus.OK).body(List);
				  }
				  catch(Exception e){
					  
					  e.printStackTrace();
					  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
					  
				  }
				 
				  
				}
				
				@GetMapping("/category/agencycategory")
				public ResponseEntity<List<Category>> fetchByagency()
				{
					List<Category>list = categoryService.getAllCategory();
					if(list.size()<= 0)
					{
						return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
					}
					
					return ResponseEntity.of(Optional.of(list));
				}
	

}
