package com.travelleraas.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.travelleraas.user.dao.UserDetailsDao;
import com.travelleraas.user.entity.UserDetail;
import com.travelleraas.user.service.UserDetailsService;

@SpringBootTest
class UserApplicationTests {
	@Autowired
	UserDetailsService uds;
	@Mock
	UserDetailsDao ud;
	@Test
	public void getAllUserTest() {
		List<UserDetail> list=new ArrayList<>();
		list.add(new UserDetail(1,"mikku","Mukesh","9709339195","mukeshgiet2013@gmail.com"));
		list.add(new UserDetail(2,"tikku","Tukesh","9709339196","Tukeshgiet2013@gmail.com"));
		when(ud.findAll()).thenReturn(list);
		assertEquals(2, ud.findAll().size());
	}

	@Test
	void contextLoads() {
	}

}
