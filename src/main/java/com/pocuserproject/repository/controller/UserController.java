package com.pocuserproject.repository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pocuserproject.entity.User;
import com.pocuserproject.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users){
		return userService.addUsers(users);
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return userService.getUsers();
     }
	
	@GetMapping("/getUserById/{user_id}")
	public User getUser(@PathVariable int user_id) {
		return userService.getUserById(user_id);
	}
	
	@DeleteMapping("/deleteUser/{user_id}")
	public String deleteUser(@PathVariable int user_id) {
		userService.deleteUser(user_id);
		return "the User will be deleted with userid = "+user_id;
	}
	
	@PutMapping("/updateUser")
	public User updateEmployee(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	

}
