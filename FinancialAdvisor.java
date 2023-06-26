package com.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FinancialAdvisor {
	@Id @GeneratedValue
	private int Advisor_Id;
	private String name;
	public FinancialAdvisor(int advisor_Id, String name) {
		super();
		Advisor_Id = advisor_Id;
		this.name = name;
	}
	public FinancialAdvisor() {
		super();
	}
	public int getAdvisor_Id() {
		return Advisor_Id;
	}
	public void setAdvisor_Id(int advisor_Id) {
		Advisor_Id = advisor_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
