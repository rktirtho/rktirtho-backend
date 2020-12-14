package com.rktirtho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "extra_carricular")
@Entity
public class ExtraCarricular {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String title;
	private String organizations;
	private String startDate;
	private String endDate;
	
	
	public ExtraCarricular() {
		super();
	}
	
	
	
	public ExtraCarricular(String title, String organizations, String startDate, String endDate) {
		super();
		this.title = title;
		this.organizations = organizations;
		this.startDate = startDate;
		this.endDate = endDate;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrganizations() {
		return organizations;
	}
	public void setOrganizations(String organizations) {
		this.organizations = organizations;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

}
