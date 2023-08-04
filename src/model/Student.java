package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_tbl")
public class Student {

@Id	
//@GeneratedValue
private int roll;

@Column(name="sname")
private String name;
@Column
private String address;


public Student( String name, String address) {
	super();
	this.name = name;
	this.address = address;
}

public Student(int roll, String name, String address) {
	super();
	this.roll = roll;
	this.name = name;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}





}
