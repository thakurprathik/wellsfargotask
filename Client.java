package com.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Client {
       @Id @GeneratedValue
	private int client_Id;
	private String name;
	
	@JoinColumn(name="Advisor_Id")
	FinancialAdvisor financeadv;

	public Client(int client_Id, String name, FinancialAdvisor financeadv) {
		super();
		this.client_Id = client_Id;
		this.name = name;
		this.financeadv = financeadv;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getClient_Id() {
		return client_Id;
	}

	public void setClient_Id(int client_Id) {
		this.client_Id = client_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FinancialAdvisor getFinanceadv() {
		return financeadv;
	}

	public void setFinanceadv(FinancialAdvisor financeadv) {
		this.financeadv = financeadv;
	}
	
	
	
}
