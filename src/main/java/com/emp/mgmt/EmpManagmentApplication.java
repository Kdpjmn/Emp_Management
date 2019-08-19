package com.emp.mgmt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.employee.managemnet.EmpManagment")
public class EmpManagmentApplication {
	//logging
		static final Logger logger  = LogManager.getLogger(EmpManagmentApplication.class.getName());
	public static void main(String[] args) {
		logger.info("entered application");
		SpringApplication.run(EmpManagmentApplication.class, args);
	}

}
