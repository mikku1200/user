package com.travelleraas.user.service;

import java.util.List;

import com.travelleraas.user.entity.UserDetail;


public interface UserDetailsService {
	
	List<UserDetail> getAllUser();

	UserDetail addNewUser(UserDetail ud);

	UserDetail getUserById(String id);

}
