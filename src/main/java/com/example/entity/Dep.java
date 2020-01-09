package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dep")
public class Dep {
	
	@Id
	@GeneratedValue
	private Integer dep_id;
	
	private String dep_name;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER, mappedBy="dep")
	private List<Emp> empList;
	
	

	public Dep(Integer dep_id, String dep_name, List<Emp> empList) {
		super();
		this.dep_id = dep_id;
		this.dep_name = dep_name;
		this.empList = empList;
	}
	
	public Dep() {
		
	}

	public Integer getDep_id() {
		return dep_id;
	}

	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public List<Emp> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}

//	@Override
//	public String toString() {
//		return "Dep [dep_id=" + dep_id + ", dep_name=" + dep_name + ", empList=" + empList + "]";
//	}
	
	

	
	
	

}
