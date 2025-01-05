package com.microservice.departmentmicroservice.controller;

import com.microservice.departmentmicroservice.dtos.DepartmentDto;
import com.microservice.departmentmicroservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/departments")
public class DepartmentController {

    private DepartmentService departmentService;

//    BUILD post REST APi for save department method
    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto saveDep = departmentService.save(departmentDto);
        return new ResponseEntity<>(saveDep, HttpStatus.CREATED);
    }

    //    Build RESTAPI for get department by code
    @GetMapping("{department-code}")   //URL template variable
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode) {
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
