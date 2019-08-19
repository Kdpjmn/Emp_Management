package com.emp.mgmt.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@Column(name="department_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int department_ID;
	
	private String department_Name;
	
	public Department() {
	
	}
	
	public Department(int departmentID){
		super();
		this.department_ID = departmentID;
	}
	
	public Department(int departmentID, String department_Name) {
		super();
		this.department_ID = departmentID;
		this.department_Name = department_Name;
	}

	public int getDepartment_ID() {
		return department_ID;
	}

	public void setDepartment_ID(int department_ID) {
		this.department_ID = department_ID;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

}
