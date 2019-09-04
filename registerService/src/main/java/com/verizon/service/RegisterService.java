package com.verizon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.entity.Register;
import com.verizon.repo.RegisterRepo;

@Service
public class RegisterService implements RegisterIntf{
	@Autowired
	RegisterRepo repo;

	@Override
	public Register registerUser(Register user) {
		return repo.save(user);
		
	}

}
