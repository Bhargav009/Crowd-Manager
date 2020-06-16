package com.ggktech.crowdmanager.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@CreatedDate
	@Column(name = "addedDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date addedDateTime;

	@LastModifiedDate
	@Column(name = "editDateTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date editDateTime;

}
