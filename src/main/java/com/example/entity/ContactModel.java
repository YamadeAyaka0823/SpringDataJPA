package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class ContactModel {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String zip;
	
	private String address;
	
	private String name;
	
	private String tel;
	
	

	public ContactModel(Integer id, String zip, String address, String name, String tel) {
		this.id = id;
		this.zip = zip;
		this.address = address;
		this.name = name;
		this.tel = tel;
	}
	
	public ContactModel() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	

}
