package com.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
 public  class Secuirty {
@Id 
	private int security_Id;
private String name;
@JoinColumn(name="portfolio_Id")
Portfolio portfolio;
@JoinColumn(name="purchase_Id")
Purchase purchase;
public Secuirty(int security_Id, String name, Portfolio portfolio, Purchase purchase) {
	super();
	this.security_Id = security_Id;
	this.name = name;
	this.portfolio = portfolio;
	this.purchase = purchase;
}
public Secuirty() {
	super();
	// TODO Auto-generated constructor stub
}
public int getSecurity_Id() {
	return security_Id;
}
public void setSecurity_Id(int security_Id) {
	this.security_Id = security_Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Portfolio getPortfolio() {
	return portfolio;
}
public void setPortfolio(Portfolio portfolio) {
	this.portfolio = portfolio;
}
public Purchase getPurchase() {
	return purchase;
}
public void setPurchase(Purchase purchase) {
	this.purchase = purchase;
}

}
