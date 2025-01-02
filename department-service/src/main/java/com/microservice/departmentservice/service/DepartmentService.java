package com.microservice.departmentservice.service;

import com.microservice.departmentservice.dto.DepartmentDTO;

public interface DepartmentService {

    DepartmentDTO saveDepartment(DepartmentDTO departmentDto);
}
