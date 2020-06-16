package com.ggktech.crowdmanager.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	@Id
	@GeneratedValue
	@Column(columnDefinition = "NUMERIC(11,0)")
	int id;

	@CreatedDate
	@Column(name = "addedDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date addedDateTime;

	@LastModifiedDate
	@Column(name = "editedDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date editedDate;

	@Column(name = "addedBy", columnDefinition = "NUMERIC(11,0)")
	private int addedBy;
	@Column(name = "editedBy", columnDefinition = "NUMERIC(11,0)")
	private int editedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAddedDateTime() {
		return addedDateTime;
	}

	public void setAddedDateTime(Date addedDateTime) {
		this.addedDateTime = addedDateTime;
	}

	public Date getEditedDate() {
		return editedDate;
	}

	public void setEditedDate(Date editedDate) {
		this.editedDate = editedDate;
	}

	public int getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(int addedBy) {
		this.addedBy = addedBy;
	}

	public int getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(int editedBy) {
		this.editedBy = editedBy;
	}

}