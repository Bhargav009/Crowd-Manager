package com.ggktech.crowdmanager.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "crowd_spot_daily_count")
public class CrowdSpotDailyCount extends BaseEntity {
	private static final long serialVersionUID = 1L;

	int count;

	@ManyToOne
	@JoinColumn(name = "crowdSpotId", nullable = false)
	CrowdSpot crowdSpot;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public CrowdSpot getCrowdSpot() {
		return crowdSpot;
	}

	public void setCrowdSpot(CrowdSpot crowdSpot) {
		this.crowdSpot = crowdSpot;
	}

}
