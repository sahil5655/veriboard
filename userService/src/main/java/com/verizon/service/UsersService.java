package com.verizon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.entity.Users;
import com.verizon.repository.UserRepo;

@Service
public class UsersService implements UsersServiceIntf {
	
	@Autowired
	UserRepo userRepo;

	@Override
	public Users findByUsername(String name) {
		return userRepo.findByUsername(name);
	}
	
}