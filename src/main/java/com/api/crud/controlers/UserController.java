package com.api.crud.controlers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;

//Controles 

@RestController
@RequestMapping("/usuario")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/mostrar")
	public ArrayList<UserModel> getUsers() {
		
		return this.userService.getUsers();		
	}
	
	@PostMapping("/save")
	public UserModel saveUser(@RequestBody UserModel userModel) {
		
		return this.userService.saveUser(userModel);
		
	}

}
