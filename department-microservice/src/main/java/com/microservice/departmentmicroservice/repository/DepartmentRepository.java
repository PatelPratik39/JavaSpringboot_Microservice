package com.microservice.departmentmicroservice.repository;

import com.microservice.departmentmicroservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
//    Query method to find Department by department code
    Department findByDepartmentCode(String departmentCode);
}
