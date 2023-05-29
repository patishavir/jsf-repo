package com.journaldev.data;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Employee {
	private String employeeId;
	private String employeeName;

	public Employee() {
		System.out.println("Employee constructor has been called !!!!!!!!!!!!!!!!!");
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("employee id: ");
		sb.append(employeeId);
		sb.append("employee name: ");
		sb.append(employeeName);
		return sb.toString();

	}
}
