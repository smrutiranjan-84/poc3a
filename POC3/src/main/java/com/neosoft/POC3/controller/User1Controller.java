package com.neosoft.POC3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.POC3.model.User1;
import com.neosoft.POC3.service.User1Service;

@RestController
@RequestMapping("/api")
public class User1Controller {
	@Autowired
	User1Service userService;

	@GetMapping("/user/{userId}")
	private User1 getUsers(@PathVariable("userId") int userId) {
		return userService.getUserById(userId);
	}

	@GetMapping("/getUser")
	public List<User1> getUser(
			@RequestParam("userFirstName") String firstName,
			@RequestParam("userSurname") String surName,
			@RequestParam("pinCode") String pinCode) {

		return userService.searchUser(firstName, surName, pinCode);

	}
	@PostMapping("/users")
	private void saveUsers(@RequestBody User1 users) {
		User1 user1 = new User1();
		user1.setUserFirstName(users.getUserFirstName());
		user1.setSurName(users.getSurName());
		user1.setDob(users.getDob());
		user1.setDateOfJoining(users.getDateOfJoining());
		user1.setPinCode(users.getPinCode());

		userService.saveOrUpdate(user1);

	}
	
	@PutMapping("/user/{userId}")
	private void update(@PathVariable int userId, @RequestBody User1 users) {
		User1 user1 = new User1();
		user1.setUserId(userId);
		user1.setUserFirstName(users.getUserFirstName());
		user1.setSurName(users.getSurName());
		user1.setDob(users.getDob());
		user1.setDateOfJoining(users.getDateOfJoining());
		user1.setPinCode(users.getPinCode());
		userService.saveOrUpdate(users);
	}
}
