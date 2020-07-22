package com.toni.thymeleaf.services;

import java.util.List;

import com.toni.thymeleaf.domain.Project;

public interface ProjectService {

	Project getProject(Integer id);

    List<Project> listProjects();

}
