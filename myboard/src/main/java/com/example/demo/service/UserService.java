package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.model.User;

public interface UserService {
	// 모든 항목 가져오기
	List<User> getAllUser();			// {}없음	
	
	// 특정 항목 가져오기
	User getUserById(Long id);
	
	// 특정 항목 저장하기
	User saveUser(User user);
	
	// 특정 항목 수정하기
	User updateUser(User user);
	
	// 특정 항목 삭제하기
	void deleteUserById(Long id);
	
	// 페이지 나누기
	Page<User> findPaginated(int no, int totalNo);
	
	
}
