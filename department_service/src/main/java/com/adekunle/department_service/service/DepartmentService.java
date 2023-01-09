package com.adekunle.department_service.service;

import com.adekunle.department_service.models.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department findDepartmentById(Long deptId);
}
