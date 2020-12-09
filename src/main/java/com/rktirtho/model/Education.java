package com.rktirtho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "education")
@Entity
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String degree;
	private String university;
	private String subject;
	private float cgpa;
	private float resultScale;
	private String latterGrade;
	private float duration;
	private int passingYear;
	
	
	
	public Education() {
		super();
	}



	public Education(String degree, String university, String subject, float cgpa, float resultScale,
			String latterGrade, float duration, int passingYear) {
		super();
		this.degree = degree;
		this.university = university;
		this.subject = subject;
		this.cgpa = cgpa;
		this.resultScale = resultScale;
		this.latterGrade = latterGrade;
		this.duration = duration;
		this.passingYear = passingYear;
	}



	public Education(long id, String degree, String university, String subject, float cgpa, float resultScale,
			String latterGrade, float duration, int passingYear) {
		super();
		this.id = id;
		this.degree = degree;
		this.university = university;
		this.subject = subject;
		this.cgpa = cgpa;
		this.resultScale = resultScale;
		this.latterGrade = latterGrade;
		this.duration = duration;
		this.passingYear = passingYear;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getDegree() {
		return degree;
	}



	public void setDegree(String degree) {
		this.degree = degree;
	}



	public String getUniversity() {
		return university;
	}



	public void setUniversity(String university) {
		this.university = university;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public float getCgpa() {
		return cgpa;
	}



	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}



	public float getResultScale() {
		return resultScale;
	}



	public void setResultScale(float resultScale) {
		this.resultScale = resultScale;
	}



	public String getLatterGrade() {
		return latterGrade;
	}



	public void setLatterGrade(String latterGrade) {
		this.latterGrade = latterGrade;
	}



	public float getDuration() {
		return duration;
	}



	public void setDuration(float duration) {
		this.duration = duration;
	}



	public int getPassingYear() {
		return passingYear;
	}



	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}
	
	
	
	

}
