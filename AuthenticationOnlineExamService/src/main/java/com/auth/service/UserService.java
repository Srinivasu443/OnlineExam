package com.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.dao.UserDao;
import com.auth.exceptions.NoSuchElementException;
import com.auth.exceptions.UserAlreadyExistException;
import com.auth.models.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public User isValid(String email,String password) {
		System.out.println(email+"In service");
		User user = dao.findByEmail(email);
		if(user==null) {
			throw new NoSuchElementException("No such user.");
		}else {
			if(password.equals(user.getPassword())) {
				return user;
			}else {
				throw new NoSuchElementException("Invalid Password.");
			}
				
		}
	}

	public User createUser(User user) {
		
		System.out.println(user.getEmail()+"In service");
		User user1 = dao.findByEmail(user.getEmail());
		if(user1==null) {
			
			User regUser = dao.save(user);
			return regUser;
			
		}else {
			
			throw new UserAlreadyExistException("User Already Exists.");
		}
		
		
	}

	public User updatePassword(String email,String password) {
		System.out.println(email+" "+password+"In service");
		User user1 = dao.findByEmail(email);
		if(user1==null) {
			throw new NoSuchElementException("No such user.");
		}else {
			user1.setPassword(password);
			User updatedUser = dao.save(user1);
			return updatedUser;
		}
		
	}

	

	

}
