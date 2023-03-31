package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {
	
	@RequestMapping("/home")
	public ModelAndView getHome() {
		return new ModelAndView("home"); 
	}
	
	@RequestMapping("register")
	public ModelAndView getRegister() {
		return new ModelAndView("reg");
	}
	
	@RequestMapping("finduser")
	public ModelAndView getcheck(@RequestParam("uname") String name) {
		System.out.println(name);
		return new ModelAndView("success");
	}
	
	@RequestMapping(value="/finduser" , method=RequestMethod.POST)
	public ModelAndView getFind(@RequestParam String uname) {
		System.out.println(uname);
		
		return new ModelAndView("success");
	}
}
