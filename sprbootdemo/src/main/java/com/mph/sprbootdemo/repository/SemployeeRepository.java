package com.mph.sprbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mph.sprbootdemo.entity.Semployee;

@Repository
public interface SemployeeRepository  extends JpaRepository<Semployee, Integer>{

}
