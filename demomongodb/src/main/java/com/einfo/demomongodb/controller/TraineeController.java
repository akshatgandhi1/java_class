package com.einfo.demomongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators.Mod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.demomongodb.model.Trainee;
import com.einfo.demomongodb.repositary.traineeRepo;



@RestController
public class TraineeController {
	@Autowired
	UserRepo ur;
	
	@RequestMapping("/")
	public ModelAndView getuser() {
		ModelAndView mv=new ModelAndView("signIn");
		return mv;
	}
	
	@RequestMapping("signIn")
	public ModelAndView getSignIn(@RequestParam String email,String fname,String lname,String password ,String gender,String dob,String location) {
		ModelAndView mv=new ModelAndView("loginIn");
		System.out.println();
		Trainee t=new Trainee(email,fname,lname,password,gender,dob,location);
		ur.save(u);
		return mv;
	}
}

}