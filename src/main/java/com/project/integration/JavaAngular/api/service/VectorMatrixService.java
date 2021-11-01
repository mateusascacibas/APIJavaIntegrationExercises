package com.project.integration.JavaAngular.api.service;

public class VectorMatrixService {
	public String exercise1(int[] num) {
		int i = 0;
		String response = "";
		while (i < 6) {
			response += "Valor " + (i + 1) + " = " + num[i] + "\n";
			i+=1;
		}
		return response;
	}
}
