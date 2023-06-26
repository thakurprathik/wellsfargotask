package com.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Portfolio {
	@Id 
	private int portfolio_Id;
	
	@JoinColumn(name="client_Id")
	Client client;

	public Portfolio(int portfolio_Id, Client client) {
		super();
		this.portfolio_Id = portfolio_Id;
		this.client = client;
	}

	public Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPortfolio_Id() {
		return portfolio_Id;
	}

	public void setPortfolio_Id(int portfolio_Id) {
		this.portfolio_Id = portfolio_Id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}




}
