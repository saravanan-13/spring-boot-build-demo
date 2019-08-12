package com.pack.springreact.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pack.springreact.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
}