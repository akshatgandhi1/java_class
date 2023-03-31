package com.einfo.demomongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.einfo.demomongodb.model.Trainee;
import com.einfo.demomongodb.repositary.traineeRepo;

@RestController
@CrossOrigin
public class ExternalController {
	@Autowired
	traineeRepo tr;
	
	@GetMapping("/exttrainees")
	public List<Trainee> getTrainee(){
		return tr.findAll();
	}
	
	@GetMapping("/exttrainees/{id}")
	public Trainee getTraineeid(@PathVariable Integer id){
		return tr.findById(id).get();
	}
}
