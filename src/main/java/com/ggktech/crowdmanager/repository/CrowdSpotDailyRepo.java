package com.ggktech.crowdmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggktech.crowdmanager.entities.CrowdSpotDailyCount;

@Repository
public interface CrowdSpotDailyRepo extends JpaRepository<CrowdSpotDailyCount, Long> {

}
