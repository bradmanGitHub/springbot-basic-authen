package com.sample.security.basicauthen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.security.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Secured("ROLE_GUEST")
	@GetMapping("/list")
	public ResponseEntity<List<User>> list(){
		List<User> userList = new ArrayList<User>();
		
		//MOCKUP USER1
		User user1 = new User("Somchai", "Kemkang", "Bangkok");
		
		//MOCKUP USER2
		User user2 = new User("Karaket", "Kingkaew", "Nakhonsrithammaraj");
		
		userList.add(user1);
		userList.add(user2);
		
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}
	
	@Secured("ROLE_USER")
	@GetMapping("/detail")
	public String showDetail(){
		return "show user detail";
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/add")
	public String addUser(){
		return "add user..";
	}
}
