package com.ggktech.crowdmanager.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "crowd_spot")
public class CrowdSpot extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	String code;
	@Column(nullable = false, precision = 10, scale = 8)
	BigDecimal lat;

	@Column(nullable = false, precision = 11, scale = 8)
	BigDecimal lng;

	@Column(nullable = false)
	String address;

	int staffCount;

	@Column(nullable = false)
	int spotCapacity;

	@Column(nullable = false)
	String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getLat() {
		return lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStaffCount() {
		return staffCount;
	}

	public void setStaffCount(int staffCount) {
		this.staffCount = staffCount;
	}

	public int getSpotCapacity() {
		return spotCapacity;
	}

	public void setSpotCapacity(int spotCapacity) {
		this.spotCapacity = spotCapacity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
