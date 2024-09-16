package com.mph.sprbootdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.sprbootdemo.entity.Semployee;
import com.mph.sprbootdemo.repository.SemployeeRepository;

@Service
@Transactional
public class SemployeeServiceImpl implements SemployeeService {
	@Autowired
	private SemployeeRepository semployeeRepository;

	@Override
	public void createEmployee(Semployee emp) {
		semployeeRepository.save(emp);
	}

	@Override
	public List<Semployee> getAllEmployee() {

		return semployeeRepository.findAll();
	}

	@Override
	public Semployee updateEmployee(Semployee emp) {

		return semployeeRepository.save(emp);
	}

	@Override
	public void deleteEmployee(int eid) {

		semployeeRepository.deleteById(eid);
	}

	@Override
	public Optional<Semployee> getEmployee(int id) {

		return semployeeRepository.findById(id);
	}

//	@Override
//	public Semployee getEmployeeByEmail(String email) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
