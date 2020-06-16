package com.ggktech.crowdmanager.dto;

public class CrodSpotParamtersDto {
	private int id;
	private int todayCrowdCount;
	private double inFlowRatePerHour;
	private double outFlowRatePerHour;

	public CrodSpotParamtersDto(int id, int todayCrowdCount, double inFlowRatePerHour, double outFlowRatePerHour) {
		super();
		this.id = id;
		this.todayCrowdCount = todayCrowdCount;
		this.inFlowRatePerHour = inFlowRatePerHour;
		this.outFlowRatePerHour = outFlowRatePerHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTodayCrowdCount() {
		return todayCrowdCount;
	}

	public void setTodayCrowdCount(int todayCrowdCount) {
		this.todayCrowdCount = todayCrowdCount;
	}

	public double getInFlowRatePerHour() {
		return inFlowRatePerHour;
	}

	public void setInFlowRatePerHour(double inFlowRatePerHour) {
		this.inFlowRatePerHour = inFlowRatePerHour;
	}

	public double getOutFlowRatePerHour() {
		return outFlowRatePerHour;
	}

	public void setOutFlowRatePerHour(double outFlowRatePerHour) {
		this.outFlowRatePerHour = outFlowRatePerHour;
	}

}
