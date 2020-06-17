package com.ggktech.crowdmanager.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "hours_table")
public class Hours extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@Column(nullable = false)
	int hour;

}
