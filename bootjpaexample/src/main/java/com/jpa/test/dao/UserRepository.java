package com.jpa.test.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;
import java.util.*;

public interface UserRepository extends CrudRepository<User, Integer>{

	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name, String city);
	
	// jpa query
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
	// native query(sql query)
	@Query(value = "select * from user",nativeQuery = true)
	public List<User> getUsers();
}
