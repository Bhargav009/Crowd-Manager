package com.ggktech.crowdmanager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "crowd_spot")
public class CrowdSpot extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue()
	long id;
	@Column(name = "addedBy")
	long addedBy;
	@Column(name = "editedBy")
	long editedBy;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	String code;
	@Column(nullable = false)
	double lat;
	@Column(nullable = false)
	double lng;
	@Column(nullable = false)
	String address;
	long staffCount;
	@Column(nullable = false)
	long spotCapacity;
	@Column(nullable = false)
	String status;
}
