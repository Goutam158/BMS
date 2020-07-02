package com.aws.bms.useraccountservice.service;

import java.util.List;

import com.aws.bms.useraccountservice.model.User;

public interface UserRegistrationService {
	
	User registerUser (User user);
	
	User fetchUser (int Id);
	
	List<User> findAllUser ();
	
	Boolean login (String name, String pass);
	
	Boolean deleteUser (int Id);

}
