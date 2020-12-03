package com.rktirtho.model;

import java.util.List;

/**
 * 
 * @author rktirtho
 *
 */
public class Training {
	// training id
	private long id;
	
	// name of course conductor
	private String vendor;
	
	// training orgeniger
	private String institute;
	
	// topic covered by this course
	private List<String> topicCovered;
	
	
	// duration of the course
	private float duration;
	
	// id this course organized in online?
	private boolean isOnline;
	
	// training complication date
	private String date;
	
	
	
	

	public Training() {
		
	}
	
	

	public Training(String vendor, String institute, List<String> topicCovered, float duration, boolean isOnline,
			String date) {
		this.vendor = vendor;
		this.institute = institute;
		this.topicCovered = topicCovered;
		this.duration = duration;
		this.isOnline = isOnline;
		this.date = date;
	}
	
	
	
	

	public Training(long id, String vendor, String institute, List<String> topicCovered, float duration,
			boolean isOnline, String date) {
		super();
		this.id = id;
		this.vendor = vendor;
		this.institute = institute;
		this.topicCovered = topicCovered;
		this.duration = duration;
		this.isOnline = isOnline;
		this.date = date;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public List<String> getTopicCovered() {
		return topicCovered;
	}

	public void setTopicCovered(List<String> topicCovered) {
		this.topicCovered = topicCovered;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
