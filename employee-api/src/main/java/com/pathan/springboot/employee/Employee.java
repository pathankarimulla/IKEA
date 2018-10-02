package com.pathan.springboot.employee;

public class Employee {
private String eid;
private String ename;
private String designation;
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Employee(String eid, String ename, String designation) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.designation = designation;
}

public Employee() {
	// TODO Auto-generated constructor stub
}

}
