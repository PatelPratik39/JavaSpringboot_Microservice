package com.microservice.departmentmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentMicroserviceApplication.class, args);
		System.err.println("********* 💼Department microservice is up and running **********");
	}

}
