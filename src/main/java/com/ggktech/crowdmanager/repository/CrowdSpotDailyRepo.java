package com.ggktech.crowdmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ggktech.crowdmanager.entities.CrowdSpotDailyCount;

@Repository
public interface CrowdSpotDailyRepo extends JpaRepository<CrowdSpotDailyCount, Long> {

//	@Query("select cc.crowd_spot_id, cp.name, sum(cc.count) as todayCrowdCount from CrowdSpotDailyCount cc inner join crowd_spot cp on cp.id = cc.crowd_spot_id where cc.crowd_spot_id=?1 and cc.added_date between '2020-06-16 00:00:00' and '2020-06-16 23:59:59'")
//	int findTodayCrowdCount(int crowdSpotId);
}
