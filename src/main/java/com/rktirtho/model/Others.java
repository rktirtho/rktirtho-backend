package com.rktirtho.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "others")
@Entity
public class Others {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String kewword;
	private String text;
	
	public Others() {
		super();
	}
	
	public Others(String kewword, String text) {
		super();
		this.kewword = kewword;
		this.text = text;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKewword() {
		return kewword;
	}
	public void setKewword(String kewword) {
		this.kewword = kewword;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	

}
