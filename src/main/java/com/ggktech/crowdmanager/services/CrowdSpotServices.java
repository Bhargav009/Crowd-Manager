package com.ggktech.crowdmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ggktech.crowdmanager.dto.CrodSpotParamtersDto;
import com.ggktech.crowdmanager.entities.CrowdSpot;
import com.ggktech.crowdmanager.repository.CrowdSpotDailyRepo;
import com.ggktech.crowdmanager.repository.CrowdSpotRepo;

@Service
public class CrowdSpotServices {

	@Autowired
	CrowdSpotRepo crowdSpotRepo;

	@Autowired
	CrowdSpotDailyRepo crowdSpotDailyRepo;

	public CrowdSpot saveCrowdSpot(CrowdSpot crowdSpot) {
		return crowdSpotRepo.save(crowdSpot);
	}

	public Page<CrowdSpot> getAllCrowdSpots(Pageable pageable) {
		return crowdSpotRepo.findAll(pageable);
	}

	public CrodSpotParamtersDto getCrodSpotParamters(int crowdSpotId) {
		//	int todayCrowdCount = crowdSpotDailyRepo.findTodayCrowdCount(crowdSpotId);
		int todayCrowdCount = 0;
		return new CrodSpotParamtersDto(crowdSpotId, todayCrowdCount, 0, 0);
	}
}
