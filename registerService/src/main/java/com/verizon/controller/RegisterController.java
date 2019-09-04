package com.verizon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.entity.Register;
import com.verizon.service.RegisterIntf;

@RestController
@RequestMapping(value = "/register")
public class RegisterController {
	
	@Autowired
	RegisterIntf service;
	
	@PostMapping(value = "/")
	public Register registerUser(@RequestBody Register register)
	{
		return service.registerUser(register);
	}

}
