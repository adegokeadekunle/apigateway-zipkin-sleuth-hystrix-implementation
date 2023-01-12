package com.adekunle.departmentsservie.service;


import com.adekunle.departmentsservie.models.Department;
import com.adekunle.departmentsservie.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;


    @Override
    public Department saveDepartment(Department department) {

       return departmentRepository.save(Department.builder()
                .departmentName(department.getDepartmentName())
                .departmentAddress(department.getDepartmentAddress())
                .departmentCode(department.getDepartmentCode())
                .build()
        );
    }

    @Override
    public Department findDepartmentById(Long deptId) {

        return departmentRepository
                .findById(deptId).orElseThrow(()-> new IllegalArgumentException("Department Not available"));
    }
}
