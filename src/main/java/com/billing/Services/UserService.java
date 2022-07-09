package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.UserRepository;
import com.billing.entities.User;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;

	
	//Adding the user
	
	public User addUser(User u)
	{
		User result=userRepository.save(u);
		return result;
				
	}
	
	public List<User> getAllUser()
	{
		List<User> list=(List<User>)this.userRepository.findAll();
		return list;
		
	}
	
	
	//get the single user by id
	
			public User getUserByid(Long id)
			{
				
				User user=null;
				try 
				{
					 user = this.userRepository.getById(id);
					 
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				return user;
				
			}
			
			
			
			 //delete user
			public void deleteUser(Long uid)
			{
				userRepository.deleteById(uid);
			}
			
			
			//update the user
			
			public User updateUser(User user, Long id)
			{
				
				User list= userRepository.getById(id);
				
				list.setFirstname(user.getFirstname());
				list.setLastname(user.getLastname());
				list.setUsername(user.getUsername());
				list.setPassword(user.getPassword());
				list.setMobileno(user.getMobileno());
				

				
				userRepository.save(list);
				
				return list;
			}
}
