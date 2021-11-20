package com.project.integration.JavaAngular.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.integration.JavaAngular.api.service.VectorMatrixService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/vectormatrix")
public class VectorMatrixController {
	VectorMatrixService service = new VectorMatrixService();
	@GetMapping("exe1")
	public ResponseEntity<Object>exe1(@RequestParam(value ="num[]") int[] num){
		try {
			return ResponseEntity.ok(service.exercise1(num));
		}catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
