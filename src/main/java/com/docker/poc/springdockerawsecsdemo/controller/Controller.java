package com.docker.poc.springdockerawsecsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/health")
	@ResponseStatus(HttpStatus.OK)
	public String getAppHealth() {
		return "App is up and running";
	}

	@RequestMapping("/getMessage")
	@ResponseStatus(HttpStatus.OK)
	public String fetchMessage() {
		return "Hello, just a sample.";
	}
}
