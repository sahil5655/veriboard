package com.verizon.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.verizon.entity.Register;

@Repository
public interface RegisterRepo extends MongoRepository<Register, Integer>{

	
	
}
