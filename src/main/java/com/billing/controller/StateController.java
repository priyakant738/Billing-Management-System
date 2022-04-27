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

import com.billing.Services.StateService;
import com.billing.entities.State;

@Controller
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	//get all state handler
	
	@GetMapping("/state")
	public ResponseEntity<List<State>> getState()
	{
		List<State>list = stateService.getAllState();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single state handler
	
	@GetMapping("/state/{id}")
	public ResponseEntity<State> getState(@PathVariable("id")Long id)
	{
		State state = stateService.getStateByid(id);
		if(state==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(state));
	}
	
	//new state handler
	
	@PostMapping("/state/addstate")
	public ResponseEntity<State> addState(@RequestBody State state)
	{
		State s = null;
		
		try
		{
			s = this.stateService.addState(state);
			System.out.println(state);
			return ResponseEntity.status(HttpStatus.CREATED).build();
			
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
	//delete State handler
	
	@DeleteMapping("/state/{id}")
	public ResponseEntity<State> deleteState(@PathVariable("id")Long id)
	{
		try
	  {
		this.stateService.deleteState(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	   }
		catch(Exception e)
		{
		  e.printStackTrace();
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//update state handler
	@PutMapping("/state/{id}")
	public ResponseEntity<State> updateState(@RequestBody State state,@PathVariable("id") Long id)
	{
	   
	   
	   try
		  {
		 State list = this.stateService.updateState(state, id);
			return ResponseEntity.status(HttpStatus.OK).body(list);
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
	   
	}

}
