package com.billing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.billing.entities.Category;


@Controller
public class CategoryController {
	
	//get all Category handler
	
		@GetMapping("/category")
		public ResponseEntity<List<Category>> getCategory()
		{
			List<Category>list = categoryService.getAllCity();
			if(list.size()<= 0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(list));
		}
		
		//get single category  handler
		@GetMapping("/category/{id}")
		public ResponseEntity<Category> getCategory(@PathVariable("id")Long id)
		{
			Category category = categoryService.getCityByid(id);
			if(category==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			return ResponseEntity.of(Optional.of(category));
		}
	
		    //new Category handler
		
				@PostMapping("/category")
				public ResponseEntity<Category> addCategory(@RequestBody category category)
				{
					Category c = null;
					
					try
					{
						a = this.categoryService.addArea(category);
						System.out.println(category);
						return ResponseEntity.status(HttpStatus.CREATED).build();
						
					}
					 catch(Exception e)
					{
						 e.printStackTrace();
						 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
					}
					
				}
				
				//delete Category handler
				
				@DeleteMapping("/category/{id}")
				public ResponseEntity<Object> deleteState(@PathVariable("id")Long id)
				{
					try
				  {
					this.CategoryService.deleteArea(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				   }
					catch(Exception e)
					{
					  e.printStackTrace();
					  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
					}
				}
				
				//update category handler
				@PutMapping("/category/{id}")
				public ResponseEntity<Category> updateCategory(@RequestBody Category category,@PathVariable("city_id") Long id)
				{
				  try {
					  Category List=this.categoryService.updateCategory(category, id);
					  return ResponseEntity.status(HttpStatus.OK).body(List);
				  }
				  catch(Exception e){
					  
					  e.printStackTrace();
					  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
					  
				  }
				 
				  
				}
	

}
