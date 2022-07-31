package com.example.demo.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	
	public List<User> getAllUser() {
		return user.findAll();			// 상속받은 인터페이스의 함수를 오버라이딩
	}

	public User getUserById(Long id) {
		return user.findById(id).get();
	}

	public User saveUser(User user) {
		return this.user.save(user);
	}

	public User updateUser(User user) {
		return this.user.save(user);
	}

	public void deleteUserById(Long id) {
		user.deleteById(id);
	}
	
	public Page<User> findPaginated(int no, int totalNo) {
		Pageable pageable = PageRequest.of(no-1, totalNo);
		return user.findAll(pageable);
	}
	
}
