package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	/** ID */
	@Id
	private Integer id;
	/** 名前 */
	private String name;
	/** メールアドレス */
	private String email;
	
	/** 引数ありのコンストラクタ */
	public User(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	/** 引数なしのコンストラクタ */
	public User() {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
