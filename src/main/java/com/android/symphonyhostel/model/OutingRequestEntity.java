package com.android.symphonyhostel.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_OUTING")
public class OutingRequestEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long request_id;

	@Column(name = "Description")
	private String description;

	@Column(name = "Date")
	private Date date;

	@Column(name = "Status")
	private String status;

	@Column(name = "ParentsRemark")
	private String parents_remarks;

	public OutingRequestEntity() {
		super();
	}

	public Long getRequest_id() {
		return request_id;
	}

	public void setRequest_id(Long request_id) {
		this.request_id = request_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getParents_remarks() {
		return parents_remarks;
	}

	public void setParents_remarks(String parents_remarks) {
		this.parents_remarks = parents_remarks;
	}

	@Override
	public String toString() {
		return "OutingRequestEntity [request_id=" + request_id + ", description=" + description + ", date=" + date
				+ ", status=" + status + ", parents_remarks=" + parents_remarks + "]";
	}

}
