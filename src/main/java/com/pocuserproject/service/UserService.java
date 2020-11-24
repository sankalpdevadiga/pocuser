package com.pocuserproject.service;

import java.util.List;

import com.pocuserproject.entity.User;

public interface UserService {
	
	
	public User addUser(User user);
	public List<User> addUsers(List<User> users);
	public List getUsers();
	public User getUserById(int User_id);
	public String deleteUser(int  user_id);
	public User updateUser(User user);
	
	
	

}
