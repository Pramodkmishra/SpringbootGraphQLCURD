package com.curd.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curd.demo.model.Author;



public interface AuthorRepository extends MongoRepository<Author, String> {

}