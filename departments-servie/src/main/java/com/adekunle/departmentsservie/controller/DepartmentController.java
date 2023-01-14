package com.adekunle.departmentsservie.controller;

import com.adekunle.departmentsservie.models.Department;
import com.adekunle.departmentsservie.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department){
        log.info("saved department, details -> {} department",department.getDepartmentName());
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getDepartment/{deptId}")
    public Department findDepartmentById(@PathVariable("deptId") Long deptId){
        log.info("logging department id : {}",deptId);
        return departmentService.findDepartmentById(deptId);
    }
}
