package com.spring.springSecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.log4j.Log4j;

@Controller
public class SampleController {
	
	@GetMapping("/sample/all")
	public String doAll() {
		return "/sample/all";
	}
	
	@GetMapping("/sample/member")
	public void doMember() {
		
	}
	
	@GetMapping("/sample/admin")
	public void doAdmin() {
		
	}
	
	@PostMapping("/logout")
	public String logoutGet() {
		return "redirect:/";
		
	}
}
