package com.ggktech.crowdmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ggktech.crowdmanager.dto.TodayCrowdSpotDTO;
import com.ggktech.crowdmanager.entities.CrowdSpotDailyCount;
import com.ggktech.crowdmanager.repository.CrowdSpotDailyRepo;

@RestController
public class CrowdSpotCountController {

	@Autowired
	CrowdSpotDailyRepo crowdSpotDailyRepo;

	@GetMapping("/crowd-spots-count-all")
	public Page<CrowdSpotDailyCount> getAllCrowdSpots(Pageable pageable) {
		return crowdSpotDailyRepo.findAll(pageable);
	}

	/**
	 * Returns current day's crowd data
	 * @param id
	 * @return
	 */
	@GetMapping("/crowd-details/{id}")
	public TodayCrowdSpotDTO getTodaysDetails(@PathVariable int id) {
		try {
			return crowdSpotDailyRepo.findTodayCount(id);
		} catch (Exception e) {
			return new TodayCrowdSpotDTO();
		}
	}
}
