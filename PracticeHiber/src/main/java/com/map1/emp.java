package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class emp 
{
	@Id
	private int empId;
	private String name;
	
	@ManyToMany
    private List<project> projects;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<project> getProjects() {
		return projects;
	}

	public void setProjects(List<project> projects) {
		this.projects = projects;
	}

	public emp(int empId, String name, List<project> projects) {
		super();
		this.empId = empId;
		this.name = name;
		this.projects = projects;
	}

	public emp() {
		super();
	}
    
}
