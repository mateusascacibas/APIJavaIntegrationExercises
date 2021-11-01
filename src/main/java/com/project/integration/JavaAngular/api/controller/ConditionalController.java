package com.project.integration.JavaAngular.api.controller;

import javax.ws.rs.QueryParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.integration.JavaAngular.api.service.ConditionalService;

@RestController
@RequestMapping("/conditional")
public class ConditionalController {
	ConditionalService service = new ConditionalService();
	@GetMapping("exe1")
	public ResponseEntity<Object> exe1(@QueryParam("num") int num){
		try {
			return ResponseEntity.ok(service.exercise1(num));
		}catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("exe2")
	public ResponseEntity<Object> exe2(@QueryParam("num") int num){
		try {
			return ResponseEntity.ok(service.exercise2(num));
		}catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("exe3")
	public ResponseEntity<Object> exe3(@QueryParam("num1") int num1, @QueryParam("num2") int num2){
		try {
			return ResponseEntity.ok(service.exercise3(num1,num2));
		}catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("exe4")
	public ResponseEntity<Object> exe4(@QueryParam("startTime") int startTime, @QueryParam("endTime") int endTime){
		try {
			return ResponseEntity.ok(service.exercise4(startTime,endTime));
		}catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
