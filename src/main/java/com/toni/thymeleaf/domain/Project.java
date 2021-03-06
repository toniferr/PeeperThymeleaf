package com.toni.thymeleaf.domain;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private Integer id;
	private String name;
	private String subtitle;
	private String description;
	private String license;
	private String imageUrl;
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
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
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
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
