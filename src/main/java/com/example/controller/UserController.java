package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/user")
	public String getUserData(Model model) {
		
		List<User> userList = userRepository.findAll();
		model.addAttribute("userList", userList);
		System.out.println(userList);
		return "index";
	}

}
