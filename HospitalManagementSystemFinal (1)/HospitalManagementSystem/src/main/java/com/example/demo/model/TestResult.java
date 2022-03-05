package com.example.demo.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity

public class TestResult {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer testId;
	private Double testReading;
	private String conditionP;

//	@OneToOne(cascade = CascadeType.ALL)
//	private Appointment appointment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private  Appointment appointment;

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public Double getTestReading() {
		return testReading;
	}

	public void setTestReading(Double testReading) {
		this.testReading = testReading;
	}

	public String getConditionP() {
		return conditionP;
	}

	public void setConditionP(String conditionP) {
		this.conditionP = conditionP;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


}
