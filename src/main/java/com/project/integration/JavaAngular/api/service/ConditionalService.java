package com.project.integration.JavaAngular.api.service;

public class ConditionalService {
	public String exercise1(int num) {
		if(num < 0 ) {
			return "Negative.";
		}
		else {
			return "Positive or 0.";
		}
	}
	public String exercise2(int num) {
		if(num % 2 == 0 ) {
			return "Pair";
		}
		else {
			return "Odd.";
		}
	}
	
	public String exercise3(int A, int B) {
		if(A % B == 0 || B % A == 0) {
			return "Are multiple.";
		}else {
			return "Are not multiple.";
		}
	}
	
	public String exercise4(int startTime, int endTime) {
		
		if(startTime > endTime) {
			return "Duration : " + (startTime - endTime) + " hours.";
		}
		else {
			return "Duration: " + (endTime - startTime) + " hours.";
		}
	}
}
