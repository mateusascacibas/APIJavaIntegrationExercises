package com.project.integration.JavaAngular.api.service;

public class CollectionService {
	public String exe1(Integer[] arrayList) {
		String response = "";
		for(int i = 6; i > 0; i++) {
			response += "Posicao [" + i + "] = " + arrayList[i] + "\n";
		}
		return response;
	}
}

