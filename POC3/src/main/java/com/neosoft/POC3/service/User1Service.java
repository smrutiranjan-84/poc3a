package com.neosoft.POC3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.POC3.controller.User1NotFoundException;
import com.neosoft.POC3.model.User1;
import com.neosoft.POC3.repository.User1Repository;
@Service
public class User1Service {
	@Autowired
	User1Repository userRepository;

	public List<User1> getAllUsers() {
		List<User1> users = new ArrayList<User1>();
		userRepository.findAll().forEach(user1 -> users.add(user1));
		return users;
	}
	public List<User1> searchUser(String userFirstName,String userSurname,String pinCode)
	{
		List<User1> user=userRepository.findByUserFirstNameOrSurNameOrPinCode(userFirstName, userSurname,pinCode);
		return user;
	}

	public User1 getUserById(int userId) {
		return userRepository.findById(userId).orElseThrow(
				User1NotFoundException::new);
	}

	public void saveOrUpdate(User1 users) {
		userRepository.save(users);
	}

	public void delete(int id) {
		userRepository.deleteById(id);
	}

	public void update(User1 users, int userId) {
		userRepository.save(users);
	}

}
