package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private String gender;
	
    Integer dep_id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(nullable= false, insertable= false, updatable= false, name="dep_id")
	private Dep dep;
	
	

	public Emp(Integer id, String name, Integer age, String gender, Integer dep_id, Dep dep) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dep_id = dep_id;
		this.dep = dep;
	}
	
	public Emp() {
		
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getDep_id() {
		return dep_id;
	}

	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}

	public Dep getDep() {
		return dep;
	}

	public void setDep(Dep dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dep_id=" + dep_id
				+ ", dep=" + dep + "]";
	}
	
	

	
	
	
	

}
