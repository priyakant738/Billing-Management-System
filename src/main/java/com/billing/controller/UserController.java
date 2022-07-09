package com.billing.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RequestMapping;

import com.billing.Services.UserService;
import com.billing.entities.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//get all User handler
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getUser()
	{
		List<User>list = userService.getAllUser();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single User handler
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id")Long id)
	{
		User user = userService.getUserByid(id);
		if(user==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(user));
	}
	
	//new user handler
	
	@PostMapping("/user/adduser")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user)
	{
		User u = null;
		
		try
		{
			u = this.userService.addUser(user);
			System.out.println(user);
			return ResponseEntity.status(HttpStatus.CREATED).build();
			
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	//delete user handler
	
		@DeleteMapping("/user/{id}")
		public ResponseEntity<User> deleteUser(@PathVariable("id")Long id)
		{
			try
		  {
			this.userService.deleteUser(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
		//update state handler
		@PutMapping("/user/{id}")
		public ResponseEntity<User> updateUser(@Valid @RequestBody User user,@PathVariable("id") Long id)
		{
		   
		   
		   try
			  {
			 User list = this.userService.updateUser(user, id);
				return ResponseEntity.status(HttpStatus.OK).body(list);
			   }
				catch(Exception e)
				{
				  e.printStackTrace();
				  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
				}
		   
		}

}
