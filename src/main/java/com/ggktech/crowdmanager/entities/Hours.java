package com.ggktech.crowdmanager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "hours_table")
public class Hours extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	long id;
	@Column(nullable = false)
	long addedBy;
	@Column(nullable = false)
	long editedBy;
	@Column(nullable = false)
	int hour;

}
