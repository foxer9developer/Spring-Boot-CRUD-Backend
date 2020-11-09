package com.pratice.mongodb.CRUD.three.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pratice.mongodb.CRUD.three.DAO.SuvModel;

@Repository("suvRepo")
public interface SuvRepository extends MongoRepository<SuvModel, Integer>{

	
}
