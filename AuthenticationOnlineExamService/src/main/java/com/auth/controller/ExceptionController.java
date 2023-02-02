package com.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.auth.exceptions.NoSuchElementException;
import com.auth.exceptions.UserAlreadyExistException;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> handler(NoSuchElementException ex,WebRequest req){
		return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserAlreadyExistException.class)
	public ResponseEntity<Object> handler(UserAlreadyExistException ex,WebRequest req){
		return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.ALREADY_REPORTED);
	}

}
