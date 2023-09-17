package com.travelleraas.user.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelleraas.user.ExceptionalHeandler.UserNotFoundException;
import com.travelleraas.user.dao.UserDetailsDao;
import com.travelleraas.user.entity.UserDetail;
import com.travelleraas.user.service.UserDetailsService;
@Service
public class UserDetailServiceImpl implements UserDetailsService{

	@Autowired
	UserDetailsDao ud;

	@Override
	public List<UserDetail> getAllUser() {
		return ud.findAll();
	}

	@Override
	public UserDetail addNewUser(UserDetail uds) {
		// TODO Auto-generated method stub
		return ud.save(uds);
	}

	@Override
	public UserDetail getUserById(String id) {
		// TODO Auto-generated method stub
		UserDetail usd=ud.findByUserId(id);
		if(usd==null)
			throw new UserNotFoundException();
		return usd;
	}



	


}
