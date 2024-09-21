package com.ashokit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ashokit.dao.UserDao;

@Component
public class UserServices {
	
	
	private UserDao dao;
	
	
	@Autowired
	public UserServices(UserDao dao) {
		System.out.println("Userservices 1 param constr called");
		this.dao = dao;
	}


	public UserServices() {
		System.out.println("No param userservices() called");
	}
	
	
	public void getName(int id) {
		dao.findUserById(id);
	}
	
	
	
	

}
