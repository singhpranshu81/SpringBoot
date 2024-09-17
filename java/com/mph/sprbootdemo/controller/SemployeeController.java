package com.mph.sprbootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mph.sprbootdemo.entity.Semployee;
import com.mph.sprbootdemo.service.SemployeeService;

@RestController
@RequestMapping("/sprbootdemo/semployee")
public class SemployeeController {
	@Autowired
	private SemployeeService semployeeService;

	@PostMapping("/add")
	public ResponseEntity<Semployee> createEmployee(@RequestBody Semployee emp) {
		semployeeService.createEmployee(emp);
		return ResponseEntity.ok(emp);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Semployee>> getAllEmployee() {
		List<Semployee> l = semployeeService.getAllEmployee();
		return ResponseEntity.ok(l);
	}

	@PutMapping("/update")
	public ResponseEntity<Semployee> updateEmployee(@RequestBody Semployee emp) {
		Semployee up = semployeeService.updateEmployee(emp);
		return ResponseEntity.ok(up);
	}

	@DeleteMapping("delete/{eid}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int eid) {
		semployeeService.deleteEmployee(eid);
		return ResponseEntity.ok("Employee " + eid + "deleted..");
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Semployee>> getEmployee(@PathVariable int id) {
		Optional<Semployee> s = semployeeService.getEmployee(id);
		return ResponseEntity.ok(s);
	}
	@GetMapping("/findbyname/{name}")
	public ResponseEntity<Semployee> getEmployee(@PathVariable String name) {
		Semployee s = semployeeService.findByEname(name);
		return ResponseEntity.ok(s);
	}
	
	@GetMapping("/findbyemail/{email}")
	public ResponseEntity<Semployee> getEmployeebyEmail(@PathVariable String email) {
		Semployee s = semployeeService.getEmployeeByEmail(email);
		System.out.println(s);
		return ResponseEntity.ok(s);
	}
	
	//by using query parameter --> for this use @requestparam 
	@GetMapping("/findbyemail")
	public ResponseEntity<Semployee> getEmployeebyEmailQp(@RequestParam String email) {
		Semployee s = semployeeService.getEmployeeByEmail(email);
		System.out.println(s);
		return ResponseEntity.ok(s);
	}
}
