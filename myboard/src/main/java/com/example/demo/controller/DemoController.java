package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class DemoController {
	
	private UserService userService;
	
	public DemoController (UserService userservice) {
		super();
		this.userService = userservice;
	}
	
	@GetMapping("/")			// localhost:8089/ 로 이동하면 실행하는 함수
	public String boardPage(Model model) {
		model.addAttribute("user", userService.getAllUser());
		return "index";			// index.html로 이동
	}
	
	@GetMapping("/edit/{id}")
	public String editPage(Model model, @PathVariable Long id) {
		model.addAttribute("user", userService.getUserById(id));
		return "edit";
	}
	
	@PostMapping("/")
	public String saveUser(@ModelAttribute("user")User user) {
		userService.saveUser(user);
		return "redirect:/";
	}
	
	// GetMapping : 페이지 이동
	// PostMapping : 무언가를 입력받아서 정보를 숨기고 페이지 이동
	
	@PostMapping("/{id}")
	public String updateUser(@PathVariable Long id, @ModelAttribute("user")User user, Model model) {
		User dbUser = userService.getUserById(id);
		dbUser.setId(id);
		dbUser.setFirst_name(user.getFirst_name());
		dbUser.setLast_name(user.getLast_name());
		dbUser.setEmail(user.getEmail());
		
		userService.updateUser(dbUser);
		return "redirect:/";
	}
}
