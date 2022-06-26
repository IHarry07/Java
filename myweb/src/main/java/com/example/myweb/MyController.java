package com.example.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	@GetMapping("/oper")           // localhost:8081/oper
	public String oper(Model model, @RequestParam("num1")String num) {
		String msg = "숫자를 입력하세요";
		int age = Integer.parseInt(num);
		if(age >= 20) {
			msg = "성인 입니다";
		}else if(age > 13) {
			msg = "청소년 입니다";
		}else if (age > 100) {
			msg = "인터넷이라고 장난치면 안돼요~";
		}else {
			msg = "어린이 입니다";
		}
		model.addAttribute("result",num);
		return "oper";             // oper.html을 열어라
		
	}
}
