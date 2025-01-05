package com.microservice.departmentmicroservice.service;

import com.microservice.departmentmicroservice.dtos.DepartmentDto;

public interface DepartmentService {
    DepartmentDto save(DepartmentDto departmentDto);
}
