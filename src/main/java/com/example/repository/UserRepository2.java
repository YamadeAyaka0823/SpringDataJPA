package com.example.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.entity.User;

public class UserRepository2 {
	
	@PersistenceContext
	private EntityManager em;
	
	public void create(User user){
		em.persist(user);
	}

}
