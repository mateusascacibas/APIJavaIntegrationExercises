package com.project.integration.JavaAngular.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.integration.JavaAngular.api.service.CollectionService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/collection")
@RestController
public class CollectionController {
	CollectionService service = new CollectionService();
//	@GetMapping("exe1")
//	public ResponseEntity<Object> exe1(@QueryParam("vetor") Integer[] arrayInt){
//		try {
//			//return ResponseEntity.ok(service.exe1(arrayInt));
//			return ResponseEntity.ok(service.exe1(arrayInt));
//		}catch(Exception e) {
//			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
}
