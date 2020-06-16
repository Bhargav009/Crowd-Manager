package com.ggktech.crowdmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ggktech.crowdmanager.dto.CrodSpotParamtersDto;
import com.ggktech.crowdmanager.entities.CrowdSpot;
import com.ggktech.crowdmanager.services.CrowdSpotServices;

@RestController
public class CrowdSpotController {
	@Autowired
	CrowdSpotServices crowdSpotServices;

	@PostMapping("/crowd-spots")
	public CrowdSpot saveCrowdSpot(@RequestBody CrowdSpot crowdSpot) {
		return crowdSpotServices.saveCrowdSpot(crowdSpot);
	}

	@GetMapping("/crowd-spots")
	public Page<CrowdSpot> getAllCrowdSpots(Pageable pageable) {
		return crowdSpotServices.getAllCrowdSpots(pageable);
	}

	@GetMapping("/crowd-spots/{id}")
	public CrodSpotParamtersDto getCrodSpotParamters(@PathVariable("id") int id) {
		return crowdSpotServices.getCrodSpotParamters(id);
	}
}
