package com.devsuperior.aulamongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.aulamongo.models.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
