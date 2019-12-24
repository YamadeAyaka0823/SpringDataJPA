package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.ContactModel;

@Repository
public interface ContactRepository extends JpaRepository<ContactModel, Integer> {

}
