package com.journaldev.data;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Employee {
	private String employeeId;
	private String employeeName;
	private boolean disabledForEditing;

	public Employee() {
		System.out.println("Employee constructor has been called !");
	}

	public void addMessage(String message) {
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_WARN, message, null);
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
	}

	public void delete() {
		String message = "deleting employee id: ".concat(employeeId.toString()) + " !";
		System.out.println(message);
		addMessage(message);
	}

	public String getEmployeeId() {
		System.out.println("getEmployeeId has completed successfully for employeeId: " + employeeId);
		return employeeId;
	}

	public String getEmployeeName() {
		System.out.println("getEmployeeName has completed successfully for employeeName: " + employeeName);
		return employeeName;
	}

	public boolean isDisabledForEditing() {
		System.out.println("isDisabledForEditing disabledForEditing: " + disabledForEditing);
		return disabledForEditing;
	}

	public void save() {
		System.out.println("save has completed successfully for employee " + employeeId + ", name: " + employeeName);
		disabledForEditing = true;
	}

	public void setDisabledForEditing(boolean disabledForEditing) {
		System.out.println("setDisabledForEditing disabledForEditing: " + disabledForEditing);
		this.disabledForEditing = disabledForEditing;
	}

	public void setEmployeeId(String employeeId) {
		System.out.println("setEmployeeId. old value: " + this.employeeId + " new value: " + employeeId);
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		System.out.println("setEmployeeName. old value: " + this.employeeName + " new value: " + employeeName);
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