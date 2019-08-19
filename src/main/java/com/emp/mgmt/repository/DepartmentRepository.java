package com.emp.mgmt.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emp.mgmt.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>{

	//Department findOne(int id);

}