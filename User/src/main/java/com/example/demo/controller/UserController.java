package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("user")
	public ResponseEntity<User> getUsers(@RequestParam(value="sort",defaultValue = "asc") String sortOrder)
	{
		log.info("CUSTOM LOG INFO : getUsers called with Query Parameter = " + sortOrder);
		return (new ResponseEntity<User>(userService.getUser(),HttpStatus.OK));
	}
	
	@GetMapping("user/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id)
	{
		log.info("CUSTOM LOG INFO : getUser called with Path Variable = " + id);
		return (new ResponseEntity<User>(userService.getUser(),HttpStatus.OK));
	}

	@PostMapping("user")
	public ResponseEntity<String> postUser()
	{
		log.debug("CUSTOM LOG DEBUG : postUser called");
		return (new ResponseEntity<String>(userService.postUser(),HttpStatus.CREATED));
	}
	
	@PutMapping("user")
	public ResponseEntity<String> putUser()
	{
		log.warn("USTOM LOG WARN : PUT User called");
		return (new ResponseEntity<String>(userService.putUser(),HttpStatus.ACCEPTED));
	}
	
	@DeleteMapping("user")
	public ResponseEntity<String> deleteUser()
	{
		log.error("USTOM LOG ERROR : DELETE user called");
		return (new ResponseEntity<String>(userService.deleteUser(),HttpStatus.OK));
	}
	
}
