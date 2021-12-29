package com.project.integration.JavaAngular.api.controller;

import javax.ws.rs.QueryParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.integration.JavaAngular.api.service.ClassService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/class")
@RestController
public class ClassController {
	ClassService service = new ClassService();

//Programa para ler os dados de duas pessoas, depois mostrar o nome
//	da pessoa mais velha
	@GetMapping("exe1")
	public ResponseEntity<Object> exe1(@QueryParam("name1") String name1, 
			@QueryParam("age1") int age1,
			@QueryParam("name2") String name2,
			@QueryParam("age2") int age2) {
		try {
			return ResponseEntity.ok(service.exercise1(name1, name2, age1, age2));
		}catch(Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("exe2")
	public ResponseEntity<Object> exe2(@QueryParam("cod1") int cod1, 
			@QueryParam("name1") String name1,
			@QueryParam("salary1") double salary1,
			@QueryParam("cod2") int cod2,
			@QueryParam("name2") String name2,
			@QueryParam("salary2") double salary2) {
		try {
			return ResponseEntity.ok(service.exercise2(cod1, name1, salary1, cod2, name2, salary2));
		}catch(Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("exe3")
	public ResponseEntity<Object> exe3(@QueryParam("capacityElevator") int capacityElevator, 
			@QueryParam("totalFloors") int totalFloors, @QueryParam("currentFloor") int currentFloor, @QueryParam("peopleInside") int peopleInside, @QueryParam("method") int method){
		try {
			return ResponseEntity.ok(service.exercise3(capacityElevator, totalFloors, currentFloor, peopleInside, method));
		}catch(Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
