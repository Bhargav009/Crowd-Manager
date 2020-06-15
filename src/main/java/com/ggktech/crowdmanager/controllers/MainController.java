package com.ggktech.crowdmanager.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

	@GetMapping("/details")
	public ResponseEntity<String> getDetails() {
		return ResponseEntity.ok().body("Endpoint for details");
	}

	@GetMapping("/calculations")
	public ResponseEntity<String> getCalculation() {
		return ResponseEntity.ok().body("Endpoint for calculations");
	}

}
