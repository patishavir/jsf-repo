package com.concretepage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dataTableView")
@ViewScoped
public class DataTableView implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Student> studentList = new ArrayList<Student>();
	private List<DataTableColumn> dataTableColumns = new ArrayList<DataTableColumn>();

	@PostConstruct
	public void init() {
		// add students
		studentList.add(new Student(111, "Ram", "Ayodhya"));
		studentList.add(new Student(222, "Mahesh", "Varanasi"));
		studentList.add(new Student(333, "Krishna", "Mathura"));
		// prepare dynamic columns
		dataTableColumns.add(new DataTableColumn("ID", "id"));
		dataTableColumns.add(new DataTableColumn("Name", "name"));
		dataTableColumns.add(new DataTableColumn("Location", "location"));
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public List<DataTableColumn> getDataTableColumns() {
		return dataTableColumns;
	}
}