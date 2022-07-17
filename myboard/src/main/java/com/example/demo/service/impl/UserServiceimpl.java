package com.example.demo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceimpl implements UserService{
	@Autowired
	private UserRepository user;
	
	public UserServiceimpl(UserRepository user) {
		super();
		this.user = user;
	}
	
	@Override
	public List<User> getAllUser() {
		return user.findAll();
	}
	
}
