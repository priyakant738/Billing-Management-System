package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Exception.DataException;
import com.billing.Repository.StateRepository;
import com.billing.entities.State;

@Service
public class StateService {
	

	@Autowired
	private StateRepository stateRepository;

	
	//Adding the State
	
	public State addState(State s)
	{
		State result=stateRepository.save(s);
		return result;
		
		
				
	}
			
  //get all state
	
	public List<State> getAllState()
	{
		List<State> list=(List<State>)this.stateRepository.findAll();
		return list;
		
	}
	
	//get the single State by id
	
		public State getStateByid(Long id)
		{
			
			State state=null;
			try 
			{
				 state = this.stateRepository.getById(id);
				 
				return state;
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return null;
			
		}
		
		
		
		
		 //delete State
		public void deleteState(Long sid)
		{
			{
				stateRepository.deleteById(sid);
			}
		}
		
		
		//update the State
		
		public State updateState(State state, Long id)
		{
			
			State list= stateRepository.getById(id);
			
			list.setStateCode(state.getStateCode());
			list.setStateName(state.getStateName());
			
			stateRepository.save(list);
			
			return list;
		}
	
	

}
