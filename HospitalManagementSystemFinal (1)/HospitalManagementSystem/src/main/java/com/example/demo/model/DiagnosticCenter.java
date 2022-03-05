package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity

public class DiagnosticCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dignosticId;
	private String name;
	private String contactNo;
	private String address;
	private String contactEmail;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Appointment appointment;
		
//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticTest diagnosticTest;
	
	@ManyToMany
	@JoinTable(name = "DiagnosticCenter_DiagnosticTest", 
	joinColumns=
	@JoinColumn(name = "centerId"), 
	inverseJoinColumns = 
	@JoinColumn(name = "testId"))
	private List<DiagnosticTest> diagnosticTest;

	public Integer getDignosticId() {
		return dignosticId;
	}

	public void setDignosticId(Integer dignosticId) {
		this.dignosticId = dignosticId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public List<DiagnosticTest> getDiagnosticTest() {
		return diagnosticTest;
	}

	public void setDiagnosticTest(List<DiagnosticTest> diagnosticTest) {
		this.diagnosticTest = diagnosticTest;
	}
	
//	private List<String> servicesOffered;
	

}
