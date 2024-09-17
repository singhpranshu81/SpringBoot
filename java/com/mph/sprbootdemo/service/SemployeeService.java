package com.mph.sprbootdemo.service;

import java.util.List;
import java.util.Optional;

import com.mph.sprbootdemo.entity.Semployee;

public interface SemployeeService {
	 public void createEmployee(Semployee emp);
     public List<Semployee> getAllEmployee();
     public Semployee updateEmployee(Semployee emp);
     public void deleteEmployee(int eid);
     public Optional<Semployee>  getEmployee(int id);
     public Semployee findByEname(String name);
   public Semployee getEmployeeByEmail(String email);
}
