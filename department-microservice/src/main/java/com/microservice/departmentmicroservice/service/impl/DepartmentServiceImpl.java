package com.microservice.departmentmicroservice.service.impl;

import com.microservice.departmentmicroservice.dtos.DepartmentDto;
import com.microservice.departmentmicroservice.entity.Department;
import com.microservice.departmentmicroservice.repository.DepartmentRepository;
import com.microservice.departmentmicroservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {

//        convert department DTO to Jpa entity
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );

        Department savedDepartment = departmentRepository.save(department);

//        convert Jpa entity to department DTO

        return new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()
        );
    }
}
