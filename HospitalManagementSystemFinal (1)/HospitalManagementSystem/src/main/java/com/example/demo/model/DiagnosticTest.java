package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity

public class DiagnosticTest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer diagnosticTestId;
	private String testName;
	private Double testPrice;
	private String normalValue;
	private String units;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Appointment appointment;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Appointment appointment;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<DiagnosticCenter> diagnosticCenter;

	public Integer getDiagnosticTestId() {
		return diagnosticTestId;
	}

	public void setDiagnosticTestId(Integer diagnosticTestId) {
		this.diagnosticTestId = diagnosticTestId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Double getTestPrice() {
		return testPrice;
	}

	public void setTestPrice(Double testPrice) {
		this.testPrice = testPrice;
	}

	public String getNormalValue() {
		return normalValue;
	}

	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public List<DiagnosticCenter> getDiagnosticCenter() {
		return diagnosticCenter;
	}

	public void setDiagnosticCenter(List<DiagnosticCenter> diagnosticCenter) {
		this.diagnosticCenter = diagnosticCenter;
	}

//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticCenter diagnosticCenter;
	
	
}