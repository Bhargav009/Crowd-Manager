package com.ggktech.crowdmanager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "crowd_spot_daily_count")
public class CrowdSpotDailyCount extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	long id;
	@Column(nullable = false)
	long addedBy;
	@Column(nullable = false)
	long editedBy;
	long count;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "crowdSpot_id", nullable = false)
	CrowdSpot crowdSpot;

}
