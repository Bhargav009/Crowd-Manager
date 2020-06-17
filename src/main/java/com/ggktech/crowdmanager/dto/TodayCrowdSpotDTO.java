package com.ggktech.crowdmanager.dto;

public class TodayCrowdSpotDTO {

	private int id;
	private long todayCrowdCount;
	private String spotName;

	public TodayCrowdSpotDTO() {
		super();
	}

	public TodayCrowdSpotDTO(int id, long todayCrowdCount, String spotName) {
		super();
		this.id = id;
		this.todayCrowdCount = todayCrowdCount;
		this.spotName = spotName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getTodayCrowdCount() {
		return todayCrowdCount;
	}

	public void setTodayCrowdCount(long todayCrowdCount) {
		this.todayCrowdCount = todayCrowdCount;
	}

	public String getSpotName() {
		return spotName;
	}

	public void setSpotName(String spotName) {
		this.spotName = spotName;
	}

}
