package com.project.integration.JavaAngular.api.service;

public class LoopService {
	public String exercise1(int num) {
		String response = "";
		for(int i = 1; i <= num; i++) {
			if(i % 2 != 0) {
				response += i + "\n";
			}
		}
		
		return response;
	}
}
