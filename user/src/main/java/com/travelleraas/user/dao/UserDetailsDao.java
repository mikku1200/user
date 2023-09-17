package com.travelleraas.user.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.travelleraas.user.entity.UserDetail;

public interface UserDetailsDao extends JpaRepository<UserDetail,Integer>{

	UserDetail findByUserId(String s);

	//List<UserDetail> getAllUser();
	
}
