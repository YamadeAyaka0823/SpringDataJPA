package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Dep;
@Repository
public interface DepRepository extends JpaRepository<Dep,Integer> {

}
