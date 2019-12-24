package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.ContactModel;
import com.example.repository.ContactRepository;

@Controller
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactRepository contactRepository;
	
	/**
	 * insertの初期画面.
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "insert";
	}
	
	/**
	 * DBへインサート.
	 * @param contactModel
	 * @return
	 */
	@PostMapping("/insert")
	public String insert(@ModelAttribute ContactModel contactModel) {
//		System.out.println(contactModel);
		contactRepository.save(contactModel);
		return "end";
	}
	
	/**
	 * 全件検索.
	 * @param model
	 * @return
	 */
	@GetMapping("/list")
	public String list(Model model) {
		List<ContactModel> list = contactRepository.findAll();
		model.addAttribute("list", list);
		return "index";
	}

}
