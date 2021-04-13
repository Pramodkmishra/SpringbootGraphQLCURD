package com.curd.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curd.demo.model.Tutorial;


public interface TutorialRepository extends MongoRepository<Tutorial, String> {

}