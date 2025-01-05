package com.microservice.employeemicroservice.service;


import com.microservice.employeemicroservice.dto.EmployeeDto;
import com.microservice.employeemicroservice.entity.Employee;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

}
