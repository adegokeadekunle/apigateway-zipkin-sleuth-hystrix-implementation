package com.adekunle.departmentsservie.service;


import com.adekunle.departmentsservie.models.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department findDepartmentById(Long deptId);
}
