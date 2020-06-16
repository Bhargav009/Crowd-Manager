package com.ggktech.crowdmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggktech.crowdmanager.entities.CrowdSpot;

@Repository
public interface CrowdSpotRepo extends JpaRepository<CrowdSpot, Long> {

}
