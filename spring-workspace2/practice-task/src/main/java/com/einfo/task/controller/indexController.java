package com.einfo.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.task.modle.movie_booking;
import com.einfo.task.repo.movieRepo;

@RestController
public class indexController {

	
	@Autowired
	movieRepo mp;
	
	@RequestMapping("/")
	public ModelAndView getindex() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping("/checkAvailablity")
	public ModelAndView getmovie() {
//		mp.save(new movie_booking("no","name","date","time","type","0","null","null"));
		
		int n=300;
		
		
		List<movie_booking> li=mp.findAll();
		
		for(movie_booking m:li) {
			int x=Integer.parseInt(m.getM_no_ticket());
			n=n-x;
			if(x<n) {

				ModelAndView mv=new ModelAndView("home2");
				return mv;	
			}
			else {
				ModelAndView mv=new ModelAndView("home3");
				mv.addObject("message","ticket not availabe");
				return mv;
				
			}
		}
return null;		
}
	
	@RequestMapping("/payment")
	public ModelAndView getpayment(@RequestParam String mobileNo,String mname,String sdate,String sname,String tType,String nticket,String TType,String tid) {
		ModelAndView mv=new ModelAndView("success");
		movie_booking mb=new movie_booking(mobileNo,mname,sdate,sname,tType,nticket,TType,tid);
		mp.save(mb);
		return mv;
	}
	
	
}
