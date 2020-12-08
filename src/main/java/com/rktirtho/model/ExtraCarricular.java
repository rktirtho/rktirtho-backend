package com.rktirtho.model;

public class ExtraCarricular {
	private long id;
	private String title;
	private String organizations;
	private String date;
	
	
	public ExtraCarricular() {
		super();
	}
	
	public ExtraCarricular(String title, String organizations, String date) {
		super();
		this.title = title;
		this.organizations = organizations;
		this.date = date;
	}

	public ExtraCarricular(long id, String title, String organizations, String date) {
		super();
		this.id = id;
		this.title = title;
		this.organizations = organizations;
		this.date = date;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
