package com.einfo.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstcontroller {

	@RequestMapping("/home")
	public String gethome() {
		return "welcome";
	}
}
