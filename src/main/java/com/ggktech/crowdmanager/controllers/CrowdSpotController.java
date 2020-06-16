package com.ggktech.crowdmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ggktech.crowdmanager.entities.CrowdSpot;
import com.ggktech.crowdmanager.repository.CrowdSpotRepo;

@RestController
public class CrowdSpotController {
	@Autowired
	CrowdSpotRepo crowdSpotRepo;

	@PostMapping("/crowd-spots")
	public CrowdSpot saveCrowdSpot(@RequestBody CrowdSpot crowdSpot) {
		return crowdSpotRepo.save(crowdSpot);
	}

	@GetMapping("/crowd-spots")
	public Page<CrowdSpot> getAllCrowdSpots(Pageable pageable) {
		return crowdSpotRepo.findAll(pageable);
	}

}
