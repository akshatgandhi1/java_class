package com.einfo.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class homeController {
	
	
	WebClient wc=WebClient.create();
	
	@RequestMapping("/trainees")
	public ResponseEntity<String> getTrainees() {
		RestTemplate rt=new RestTemplate();
		return rt.getForEntity("http://localhost:8080/exttrainees", String.class);
		
	}
	
	@RequestMapping("/ractivetrainees")
	public Flux<String> getreact(){
		return wc.get().uri("http://localhost:8080/exttrainees").retrieve().bodyToFlux(String.class);
	}
	
	@RequestMapping("reacttrainees/{id}")
	public Mono<String> getByid(@PathVariable Integer id){
		return wc.get().uri("http://localhost:8080/exttrainees/"+id).retrieve().bodyToMono(String.class);
	}
}
