package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
