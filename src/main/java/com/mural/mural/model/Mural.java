package com.mural.mural.model;

import java.util.Date;

public class Mural {
	
	
	private Long id;
	private String title;
	private String description;
	private Date publish;
	private Date visualization;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublish() {
		return publish;
	}
	public void setPublish(Date publish) {
		this.publish = publish;
	}
	public Date getVisualization() {
		return visualization;
	}
	public void setVisualization(Date visualization) {
		this.visualization = visualization;
	}
	
	
	

}
