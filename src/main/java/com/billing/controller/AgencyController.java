package com.billing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgencyController 
{
	
	
	@RequestMapping("/agent")
	public void agent(Model model)
	{
		model.addAttribute("tittle","Agent - BillerManagementSystem");
		
		
		
	}
	

	}
