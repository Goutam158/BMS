package com.aws.bms.useraccountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.bms.useraccountservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findUserByNameAndPassword(String name, String password);

}
