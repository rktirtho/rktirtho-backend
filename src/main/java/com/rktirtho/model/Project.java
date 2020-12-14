package com.rktirtho.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
@Table(name = "projects")
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Size(min = 5)
	private String title;
	@Size(min = 10, max = 300,message = "")
	private String descriptions;
	private List<String> tools;
	private String date;
	
	
	public Project() {
		super();
	}
	public Project(String title, String descriptions, List<String> tools, String date) {
		super();
		this.title = title;
		this.descriptions = descriptions;
		this.tools = tools;
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
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	public List<String> getTools() {
		return tools;
	}
	public void setTools(List<String> tools) {
		this.tools = tools;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
		
	

}
