package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class jspcontroller {
	@RequestMapping("index")
	public String firstpage() {
		return "index.jsp";
	}
	@RequestMapping("register")
	public String registerpage() {
		return "register.jsp";
	}
	
	@RequestMapping("add_data")
	public ModelAndView add_data(HttpServletRequest req) {
		ModelAndView mv=new ModelAndView("success.jsp");
		String name=req.getParameter("uname");
		String email=req.getParameter("email");
		String pass=req.getParameter("Pass");
		String cmfpass=req.getParameter("ConfPass");
		if(name.length()>=1) {
			mv.addObject("value1",name);
		}
		mv.addObject("value2",email);
		mv.addObject("value3",pass);
		mv.addObject("value4",cmfpass);
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView addlogin() {
		return new ModelAndView("loginpage.jsp");
	}
}
