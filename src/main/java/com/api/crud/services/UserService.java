package com.api.crud.services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;

//Servicios y clases

@Service
public class UserService {
	
	@Autowired
	IUserRepository userRepository;
	
	
	public ArrayList< UserModel> getUsers(){
		
		return (ArrayList<UserModel>) userRepository.findAll();
		
	}
	
	
	public UserModel saveUser(UserModel user) {
		
		return userRepository.save(user);
		
	}

}
