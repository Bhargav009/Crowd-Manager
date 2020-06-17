package com.ggktech.crowdmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ggktech.crowdmanager.dto.TodayCrowdSpotDTO;
import com.ggktech.crowdmanager.entities.CrowdSpotDailyCount;

@Repository
public interface CrowdSpotDailyRepo extends JpaRepository<CrowdSpotDailyCount, Long> {

	@Query("select new com.ggktech.crowdmanager.dto.TodayCrowdSpotDTO(cp.id, SUM(cc.count), cp.name) from CrowdSpotDailyCount cc inner join cc.crowdSpot cp where DATE(cc.addedDate) = current_date() and cp.id=:id")
	TodayCrowdSpotDTO findTodayCount(@Param("id") int id);
}
