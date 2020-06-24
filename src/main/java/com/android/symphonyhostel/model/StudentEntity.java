package com.android.symphonyhostel.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long student_id;

	@ManyToOne
	@JoinColumn(name = "outing_id")
	private List<OutingRequestEntity> outingrequestentity;

	@Column(name = "FirstName")
	private String first_name;

	@Column(name = "LastName")
	private String last_name;

	@Column(name = "phnum")
	private String phonenumber;

	@Column(name = "Password")
	private String password;

	@Column(name = "DateOfBirth")
	private String date_of_birth;

	@Column(name = "CourceOrJob")
	private String cource_or_job;

	@Column(name = "WorkOrCollege")
	private String work_or_college;

	@Column(name = "Years")
	private String years;

	@Column(name = "ParentsName")
	private String parents_name;

	@Column(name = "FlatNo")
	private String flat_no;

	@Column(name = "StreetName")
	private String street_name;

	@Column(name = "Locality")
	private String locality;

	@Column(name = "LandMark")
	private String land_mark;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getCource_or_job() {
		return cource_or_job;
	}

	public void setCource_or_job(String cource_or_job) {
		this.cource_or_job = cource_or_job;
	}

	public String getWork_or_college() {
		return work_or_college;
	}

	public void setWork_or_college(String work_or_college) {
		this.work_or_college = work_or_college;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public String getParents_name() {
		return parents_name;
	}

	public void setParents_name(String parents_name) {
		this.parents_name = parents_name;
	}

	public String getFlat_no() {
		return flat_no;
	}

	public void setFlat_no(String flat_no) {
		this.flat_no = flat_no;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getLand_mark() {
		return land_mark;
	}

	public void setLand_mark(String land_mark) {
		this.land_mark = land_mark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "StudentEntity [student_id=" + student_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", phonenumber=" + phonenumber + ", password=" + password + ", date_of_birth=" + date_of_birth
				+ ", cource_or_job=" + cource_or_job + ", work_or_college=" + work_or_college + ", years=" + years
				+ ", parents_name=" + parents_name + ", flat_no=" + flat_no + ", street_name=" + street_name
				+ ", locality=" + locality + ", land_mark=" + land_mark + ", city=" + city + ", state=" + state + "]";
	}

	public StudentEntity() {

	}

}