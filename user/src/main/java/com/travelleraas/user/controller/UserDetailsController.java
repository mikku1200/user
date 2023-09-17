package com.travelleraas.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelleraas.user.entity.UserDetail;
import com.travelleraas.user.service.UserDetailsService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/user")
public class UserDetailsController {
	
	

	@Autowired
	UserDetailsService userDetailsService;
	@GetMapping(path = "/check")
	String check(){
		
		return "Working Fine";
		
	}
	
	@GetMapping(path = "/getalluser")
	List<UserDetail> getAllUser(){
		
		return userDetailsService.getAllUser();
		
	}
	@PostMapping(path = "/addnewuser")
	UserDetail addNewUser(@RequestBody UserDetail ud){
		
		return userDetailsService.addNewUser(ud);
		
	}
	@GetMapping(path = "/getuser/{id}")
	UserDetail getUserById(@PathVariable("id")String id){
		
		return userDetailsService.getUserById(id);
		
	}
	
}
