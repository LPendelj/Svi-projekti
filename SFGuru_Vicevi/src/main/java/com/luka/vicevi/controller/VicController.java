package com.luka.vicevi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luka.vicevi.services.VicService;

@Controller
public class VicController {
	
	private VicService vicService;
	
	@Autowired
	public VicController(VicService vicService) {
		
		this.vicService = vicService;
	}
	
	
	@RequestMapping({"/", ""})
	public String prikaziVic(Model model) {
		model.addAttribute("vic", vicService.getVic());
		
		return "chucknorris";
	}
	
}
