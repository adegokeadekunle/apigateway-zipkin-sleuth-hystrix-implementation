package com.adekunle.department_service.controller;

import com.adekunle.department_service.models.Department;
import com.adekunle.department_service.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("saved department, details -> {}",department);
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/getDepartment/{deptId}")
    public Department findDepartmentById(@PathVariable("deptId") Long deptId){
        log.info("logging department id : {}",deptId);
        return departmentService.findDepartmentById(deptId);
    }
}
