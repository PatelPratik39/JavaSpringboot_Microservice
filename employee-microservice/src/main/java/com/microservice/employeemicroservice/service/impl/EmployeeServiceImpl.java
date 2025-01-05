package com.microservice.employeemicroservice.service.impl;

import com.microservice.employeemicroservice.dto.EmployeeDto;
import com.microservice.employeemicroservice.entity.Employee;
import com.microservice.employeemicroservice.repository.EmployeeRepository;
import com.microservice.employeemicroservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

//        Convert Dto object to entity object
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );

         Employee savedEmployee = employeeRepository.save(employee);

//         convert saved entity object to dto object

         EmployeeDto savedEmployeeDto = new EmployeeDto(
                 savedEmployee.getId(),
                 savedEmployee.getFirstName(),
                 savedEmployee.getLastName(),
                 savedEmployee.getEmail()
         );
        return savedEmployeeDto;
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        EmployeeDto savedEmplyoee = new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
        return savedEmplyoee;
    }
}
