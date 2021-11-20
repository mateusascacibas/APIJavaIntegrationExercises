package com.project.integration.JavaAngular.api.controller;

import javax.ws.rs.QueryParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.integration.JavaAngular.api.service.SequentialService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/sequential")
public class SequentialController {
	SequentialService service = new SequentialService();
	@GetMapping("exe1")
	public ResponseEntity<Object> exe1(@QueryParam("num1") int num1, @QueryParam("num2") int num2){
		try {
			return ResponseEntity.ok(service.exercise1(num1, num2));
		}catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
