package com.modal;

import java.security.Security;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Purchase {

	@Id 
	private int purchase_Id;
	
	@JoinColumn(name="security_Id")
	Security security;
	private Date purchase_date;
	private double purchase_Price;
	private int Quantity;
	public Purchase(int purchase_Id, Security security, Date purchase_date, double purchase_Price, int quantity) {
		super();
		this.purchase_Id = purchase_Id;
		this.security = security;
		this.purchase_date = purchase_date;
		this.purchase_Price = purchase_Price;
		Quantity = quantity;
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPurchase_Id() {
		return purchase_Id;
	}
	public void setPurchase_Id(int purchase_Id) {
		this.purchase_Id = purchase_Id;
	}
	public Security getSecurity() {
		return security;
	}
	public void setSecurity(Security security) {
		this.security = security;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	public double getPurchase_Price() {
		return purchase_Price;
	}
	public void setPurchase_Price(double purchase_Price) {
		this.purchase_Price = purchase_Price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
}
