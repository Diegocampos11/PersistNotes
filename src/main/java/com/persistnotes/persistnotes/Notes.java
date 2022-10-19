package com.persistnotes.persistnotes;

import java.time.LocalDate;

import io.micrometer.common.lang.Nullable;

public class Notes {
	
	private int id;
	private String description;
	private String text;
	private LocalDate dateOfCreation;
	private LocalDate estimatedDateOfCompletion;
	private LocalDate dateOfCompleation;
	private String link;
	private String mentions;
	private String priority;
	
	public Notes(int id, String description, String text, LocalDate dateOfCreation, LocalDate estimatedDateOfCompletion,
			@Nullable LocalDate dateOfCompleation, String link, String mentions, String priority) {
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
	public LocalDate getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(LocalDate dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public LocalDate getEstimatedDateOfCompletion() {
		return estimatedDateOfCompletion;
	}
	public void setEstimatedDateOfCompletion(LocalDate estimatedDateOfCompletion) {
		this.estimatedDateOfCompletion = estimatedDateOfCompletion;
	}
	public LocalDate getDateOfCompleation() {
		return dateOfCompleation;
	}
	public void setDateOfCompleation(LocalDate dateOfCompleation) {
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
