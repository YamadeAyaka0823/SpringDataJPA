package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Dep;
import com.example.entity.Emp;
import com.example.repository.DepRepository;
import com.example.repository.EmpRepository;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private DepRepository depRepository;
	
	@RequestMapping("/empList")
	public String list(Model model) {
		List<Emp> empList = empRepository.findAll();
//		empList.add(dep);
		System.out.println(empList);
		return "index2";
	}
	
//	@RequestMapping("/depList")
//	public String depList(Model model) {
//		List<Dep> depList = depRepository.findAll();
//		System.out.println(depList);
//		return "index2";
//	}
	
	@RequestMapping("")
	public String index() {
		return "insert";
	}
	
	@RequestMapping("/search")
	public String search(String name) {
		List<Emp> empList = empRepository.findByNameContains(name);
		System.out.println(empList);
		return "index3";
	}
	

}
