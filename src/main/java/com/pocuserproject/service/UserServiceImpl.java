package com.pocuserproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pocuserproject.entity.User;
import com.pocuserproject.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> addUsers(List<User> users) {
		
		return userRepository.saveAll(users);
	}

	@Override
	public List getUsers() {
		
		return userRepository.findAll();
	}
	
	

	@Override
	public String deleteUser(int user_id) {
		userRepository.deleteById(user_id);
		return "the Employee will be deleted = "+user_id;
	}

	@Override
	public User updateUser(User user) {
		User exitingUser=userRepository.findById(user.getUser_id()).orElse(null);
		exitingUser.setUser_id(user.getUser_id());
		exitingUser.setFirst_name(user.getFirst_name());
		exitingUser.setLast_name(user.getLast_name());
		exitingUser.setPassword(user.getPassword());
		exitingUser.setAddress(user.getAddress());
		exitingUser.setAge(user.getAge());
		
		
		return userRepository.save(exitingUser);
	}

	@Override
	public User getUserById(int User_id) {
		// TODO Auto-generated method stub
		return userRepository.findById(User_id).orElse(null);
	}

}
