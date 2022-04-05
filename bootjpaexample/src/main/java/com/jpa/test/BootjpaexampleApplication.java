package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.*;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

import antlr.collections.List;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		
		
		
		
		/*              insert data           */
		
//		User user = new User();
//		user.setName("Sanjay Barman");
//		user.setCity("Delhi");
//		user.setStatus("i am a developer");
//		
//		User user1 = userRepository.save(user);
//		
//		System.out.println(user1);
		
		
		// Create object of User
		
//		User user1 = new User();
//		user1.setName("Uttam");
//		user1.setCity("Kolkata");
//		user1.setStatus("Python programmer");
//		
//		User user2 = new User();
//		user2.setName("Ankit");
//		user2.setCity("Mumbai");
//		user2.setStatus("native programmer");
		
		//saving single user(data)
		
//		User resultUser = userRepository.save(user2);
//		System.out.println("saved user "+resultUser);
		
		//saving multiple user(data)
//		
//		ArrayList<User> users = new ArrayList<User>();
//		users.add(user2);
//		users.add(user1);
//		
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		
//
//		System.out.println("Done");
		
		
		
		
		/*            update user(data)              */
		
//		Optional<User> optional = userRepository.findById(3);
//		User user = optional.get();
//		
//		user.setName("Ankit Tiwari");
//		
//		User result = userRepository.save(user);
//		
//		System.out.println(result);
		
		
		
		/*  		how to get data        */
		
//		Iterable<User> itr = userRepository.findAll();
//		
//		itr.forEach(user-> {
//			System.out.println(user);
//		});
		
		
		
		
		/*  		Deleting the user element 		*/
		
//		userRepository.deleteById(3);
//		System.out.println("deleted");
		
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(users->{
//			System.out.println(users);
//		});
//		
//		userRepository.deleteAll(allusers);
//		System.out.println("all user deleted");
		
		
//		java.util.List<User> users = userRepository.findByName("Sanjay");\\
		
//		java.util.List<User> users = userRepository.findByNameAndCity("Sanjay", "Delhi");
//		
//		users.forEach(e->{
//			System.out.println(e);
//		});
		
		
		java.util.List<User> allUser = userRepository.getAllUser();
		
		allUser.forEach(e->{
			System.out.println(e);
		});
		
		
		System.out.println("____________________________________________________");
		
		java.util.List<User> allusers = userRepository.getUsers();
		
		allusers.forEach(e->{
			System.out.println(e);
		});
	}

}
