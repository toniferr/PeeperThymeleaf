package com.toni.thymeleaf.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.toni.thymeleaf.domain.Developer;
import com.toni.thymeleaf.domain.Project;
import com.toni.thymeleaf.domain.ProjectCategory;

@Service
public class ProjectServiceImpl implements ProjectService {

	private Map<Integer, Project> projectMap;
	
	public ProjectServiceImpl() {
		loadProjects();
	}	
	
    @Override
    public Project getProject(Integer id) {
        return projectMap.get(id);
    }

    @Override
    public List<Project> listProjects() {
        return new ArrayList<>(projectMap.values());
    }

    private void loadProjects() {

        Developer developer = new Developer();
        developer.setId(1);
        developer.setFirstName("Toni");
        developer.setLastName("Thompson");
        developer.setImage("luigi.png");

        ProjectCategory springBoot= new ProjectCategory();
        springBoot.setId(1);
        springBoot.setName("SpringBoot");

        ProjectCategory springmvc= new ProjectCategory();
        springmvc.setId(2);
        springmvc.setName("SpringMVC");
        
        ProjectCategory struts= new ProjectCategory();
        struts.setId(3);
        struts.setName("Struts 2");        

        ProjectCategory java= new ProjectCategory();
        java.setId(4);
        java.setName("Java");
        
        ProjectCategory maven= new ProjectCategory();
        maven.setId(5);
        maven.setName("Maven");

        projectMap = new HashMap<>();

        Project eurosnovos= new Project();
        eurosnovos.setId(1);
        eurosnovos.setName("EurosNovos");
        eurosnovos.setDescription("SpringBoot Application");
        eurosnovos.setDeveloper(developer);
        eurosnovos.setLicense("GNU v.3");
        eurosnovos.setImageURL("eurosnovos.jpg");        
        eurosnovos.getCategories().add(springBoot);         
        eurosnovos.getCategories().add(maven);           
        projectMap.put(1, eurosnovos);


        Project cryptokit = new Project();
        cryptokit.setId(2);
        cryptokit.setName("Cryptokit");
        cryptokit.setDescription("Java Swing with JCA and BouncyCastle");
        cryptokit.setDeveloper(developer);
        cryptokit.setLicense("GNU v.3");
        cryptokit.setImageURL("cryptokit.jpg");        
        cryptokit.getCategories().add(java);            
        cryptokit.getCategories().add(maven);        
        projectMap.put(2, cryptokit);

        Project setupmakeup = new Project();
        setupmakeup.setId(3);
        setupmakeup.setName("Setup-Makeup");
        setupmakeup.setDescription("Spring MVC application (xml conf) and Tiles");
        setupmakeup.setDeveloper(developer);
        setupmakeup.setLicense("GNU v.3");
        setupmakeup.setImageURL("setup-makeup.jpg");        
        setupmakeup.getCategories().add(springmvc);          
        setupmakeup.getCategories().add(maven);          
        projectMap.put(3, setupmakeup);


        Project setuptecnorepo = new Project();
        setuptecnorepo.setId(4);
        setuptecnorepo.setName("Setup-Tecnorepo");
        setuptecnorepo.setDescription("Struts 2 application");
        setuptecnorepo.setDeveloper(developer);
        setuptecnorepo.setLicense("GNU v.3");
        setuptecnorepo.setImageURL("setup-tecnorepo.jpg");        
        setuptecnorepo.getCategories().add(struts);               
        setuptecnorepo.getCategories().add(maven);     
        projectMap.put(4, setuptecnorepo);


        Project peeperjava = new Project();
        peeperjava.setId(5);
        peeperjava.setName("Peeperjava");
        peeperjava.setDescription("Maven project with multiple Java versions");
        peeperjava.setDeveloper(developer);
        peeperjava.setLicense("Apache");
        peeperjava.setImageURL("peeperjava.jpg");        
        peeperjava.getCategories().add(java);        
        projectMap.put(5, peeperjava);


        Project peepermaven = new Project();
        peepermaven.setId(6);
        peepermaven.setName("Peepermaven");
        peepermaven.setDescription("Maven projects with multiple elements of Maven");
        peepermaven.setDeveloper(developer);
        peepermaven.setLicense("Apache");
        peepermaven.setImageURL("peepermaven.jpg");        
        peepermaven.getCategories().add(maven);        
        projectMap.put(6, peepermaven);


    }
}