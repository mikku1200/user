package com.travelleraas.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class ControllerHealthCheck {
	@GetMapping(path ="/healthcheck")
	public String healthCheck()
	{
		return "Test Pass";
	}
	
	
	
}
