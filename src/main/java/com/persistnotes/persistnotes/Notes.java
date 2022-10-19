package com.persistnotes.persistnotes;

import java.util.Date;

public class Notes {
	
	int id;
	String description;
	String text;
	Date dateOfCreation;
	Date estimatedDateOfCompletion;
	Date dateOfCompleation;
	String link;
	String mentions;
	String priority;
	
	public Notes(int id, String description, String text, Date dateOfCreation, Date estimatedDateOfCompletion,
			Date dateOfCompleation, String link, String mentions, String priority) {
		super();
		this.id = id;
		this.description = description;
		this.text = text;
		this.dateOfCreation = dateOfCreation;
		this.estimatedDateOfCompletion = estimatedDateOfCompletion;
		this.dateOfCompleation = dateOfCompleation;
		this.link = link;
		this.mentions = mentions;
		this.priority = priority;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public Date getEstimatedDateOfCompletion() {
		return estimatedDateOfCompletion;
	}
	public void setEstimatedDateOfCompletion(Date estimatedDateOfCompletion) {
		this.estimatedDateOfCompletion = estimatedDateOfCompletion;
	}
	public Date getDateOfCompleation() {
		return dateOfCompleation;
	}
	public void setDateOfCompleation(Date dateOfCompleation) {
		this.dateOfCompleation = dateOfCompleation;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getMentions() {
		return mentions;
	}
	public void setMentions(String mentions) {
		this.mentions = mentions;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	

	
}
