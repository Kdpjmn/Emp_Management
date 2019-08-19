package com.emp.mgmt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emp.mgmt.model.Employee;

// interface extending crud repository
@Repository

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	//Employee findOne(int id);
	
}