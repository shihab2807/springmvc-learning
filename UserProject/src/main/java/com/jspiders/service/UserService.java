package com.jspiders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.repositary.UserRepositary;

@Service
public class UserService {
	
	@Autowired
	UserRepositary repo;
	
	public void persist(int id,String name,String email) {
		repo.saveDetails(id,name,email);
	}

}
