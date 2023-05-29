package com.journaldev.jsfBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.journaldev.data.Employee;

@ManagedBean
@SessionScoped
public class ViewEmployeesManagedBean {
	private List<Employee> employees = new ArrayList<Employee>();

	public ViewEmployeesManagedBean() {
		System.out.println("ViewEmployeesManagedBean constructor has been called !");
		// populateEmployeeList();
	}

	public List<Employee> getEmployees() {
		System.out.println("getEmployees has been called !");
		/*
		 * for (Employee emp1 : employees) { System.out.println(emp1.toString()); }
		 */
		return employees;

	}

	@PostConstruct
	public void populateEmployeeList() {
		for (int i = 1; i <= 2; i++) {
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName("Employee#" + i);
			emp.setDisabledForEditing(true);
			this.employees.add(emp);
			// System.out.println(emp.toString());
		}
		System.out.println("populateEmployeeList: " + String.valueOf(100) + " added to employees list !");
	}

	public void setEmployees(List<Employee> employees) {
		System.out.println("setEmployees has been called !");
		this.employees = employees;
	}

}