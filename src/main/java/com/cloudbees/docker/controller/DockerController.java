package com.cloudbees.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("/docker")
	public String getDockerMessage() {
		return "Spring Boot Docker Application";
	}
	
}
