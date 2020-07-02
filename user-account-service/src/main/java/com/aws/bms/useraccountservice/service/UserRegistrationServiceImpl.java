package com.aws.bms.useraccountservice.service;

import static java.util.Objects.nonNull;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws.bms.useraccountservice.model.User;
import com.aws.bms.useraccountservice.repository.UserRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User registerUser(User user) {
		User registeredUser = null;
		if(nonNull(user) && nonNull(user.getName())) {
			registeredUser = userRepository.save(user);
		}
		return registeredUser;
	}

	@Override
	public User fetchUser(int id) {
		Optional<User> user = null;
		User fetchedUser = null;
		 if (id > 0) {
			 user = userRepository.findById(id);
		 }
		 if(user.isPresent()){
			 fetchedUser = user.get();
		 }
		return fetchedUser;
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public Boolean login(String name, String pass) {
		boolean isLoginSuccessful = false;
		User user = userRepository.findUserByNameAndPassword(name, pass);
		if(nonNull(user))
			isLoginSuccessful = true;
		return isLoginSuccessful;
	}

	@Override
	public Boolean deleteUser(int Id) {
		boolean isDeleteSuccessful = false;
		userRepository.deleteById(Id);
		isDeleteSuccessful=true;
		return isDeleteSuccessful;
	}

}
