package com.empmgm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {
	@Id
private int empid;
private String empName;
private String empProject;
private String empLocation;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpProject() {
	return empProject;
}
public void setEmpProject(String empProject) {
	this.empProject = empProject;
}
public String getEmpLocation() {
	return empLocation;
}
public void setEmpLocation(String empLocation) {
	this.empLocation = empLocation;
}
@Override
public String toString() {
	return "employee [empid=" + empid + ", empName=" + empName + ", empProject=" + empProject + ", empLocation="
			+ empLocation + "]";
}

}
