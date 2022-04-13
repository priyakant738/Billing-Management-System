package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.billing.Repository.StateRepository;
import com.billing.entities.State;

public class StateService {
	

	@Autowired
	private StateRepository stateRepository;

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
				 state = this.stateRepository.find(id);
				 
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return state;
			
		}
		
		
		//Adding the State
		
		public State addState(State s)
		{
			State result=stateRepository.save(s);
			return result;
			
		}
		

		 //detele State
		public void deleteState(Long sid)
		{
			stateRepository.deleteById(sid);
		}
		
		//update the State
		
		public void updateState(State state, Long stateid)
		{
			state.setState_id(stateid);
			
			stateRepository.save(state);
		}
	
	

}
