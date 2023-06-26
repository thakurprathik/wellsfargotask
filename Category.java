package com.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
@Id
private int Category_Id;
private String name;
public Category(int category_Id, String name) {
	super();
	Category_Id = category_Id;
	this.name = name;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCategory_Id() {
	return Category_Id;
}
public void setCategory_Id(int category_Id) {
	Category_Id = category_Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
