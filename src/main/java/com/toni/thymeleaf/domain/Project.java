package com.toni.thymeleaf.domain;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private Integer id;
	private String name;
	private String subtitule;
	private String description;
	private String license;
	private String imageURL;
	private Developer developer;
	private List<ProjectCategory> categories = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public String getSubtitule() {
		return subtitule;
	}
	public void setSubtitule(String subtitule) {
		this.subtitule = subtitule;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}	
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	public List<ProjectCategory> getCategories() {
		return categories;
	}
	public void setCategories(List<ProjectCategory> categories) {
		this.categories = categories;
	}

	
}
