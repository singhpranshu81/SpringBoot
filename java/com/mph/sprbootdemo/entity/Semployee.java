package com.mph.sprbootdemo.entity;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
public class Semployee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "Id can't be  null")
	@Positive(message = "id must be positive!!")
	private int eid;
	private String ename;
	private String email;
	private String password;
	private String gender;
    
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;

	public Semployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Semployee(int eid, String ename, String email, String password, String gender, LocalDate dob) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Semployee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", dob=" + dob + "]";
	}

}
