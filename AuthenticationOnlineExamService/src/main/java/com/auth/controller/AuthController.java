package com.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth.models.User;
import com.auth.service.UserService;

@RestController
public class AuthController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/auth")
	public ResponseEntity<User> authenticate(@RequestBody User user){
		User user1 = service.isValid(user.getEmail(), user.getPassword());
		
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}
	
	@PostMapping("/resetPassword")
	public ResponseEntity<User> resetPassword(@RequestBody User user){
		User user1 = service.updatePassword(user.getEmail(),user.getPassword());
		
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}
	
	@PostMapping("/registration")
	public ResponseEntity<User> registration(@RequestBody User user){
		User user1 = service.createUser(user);
		
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}

}
