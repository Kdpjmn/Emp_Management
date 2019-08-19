package com.emp.mgmt.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "employee")
public class Employee {

	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeID;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="email_id")
	private String emailId;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	public Employee(){
		
	}
	
	public Employee(String userName,  Department department) {
		super();
		this.userName = userName;
		
		this.department = department;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUsertName(String userName) {
		this.userName = userName;
	}
	

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString(){
		return String.format("Employee [employeeID = %d, userName = %s, department_ID= %d,emailId= %s", employeeID, userName, department.getDepartment_ID(),emailId);
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
