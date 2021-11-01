package com.project.integration.JavaAngular.api.service;

public class ConditionalService {
	public String exercise1(int num) {
		if(num < 0 ) {
			return "Negativo.";
		}
		else {
			return "Positivo ou 0.";
		}
	}
	public String exercise2(int num) {
		if(num % 2 == 0 ) {
			return "Par";
		}
		else {
			return "Impar.";
		}
	}
	
	public String exercise3(int A, int B) {
		if(A % B == 0 || B % A == 0) {
			return "Sao multiplos.";
		}else {
			return "Nao sao multiplos";
		}
	}
	
	public String exercise4(int startTime, int endTime) {
		
		if(startTime > endTime) {
			return "Duracao : " + (startTime - endTime);
		}
		else {
			return "Duracao: " + (endTime - startTime);
		}
	}
}
