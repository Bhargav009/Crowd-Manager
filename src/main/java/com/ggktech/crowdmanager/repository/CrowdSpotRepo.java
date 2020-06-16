package com.ggktech.crowdmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ggktech.crowdmanager.dto.CrodSpotParamtersDto;
import com.ggktech.crowdmanager.entities.CrowdSpot;

@Repository
public interface CrowdSpotRepo extends JpaRepository<CrowdSpot, Long> {

}
