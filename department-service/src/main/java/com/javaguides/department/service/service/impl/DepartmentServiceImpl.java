package com.javaguides.department.service.service.impl;

import com.javaguides.department.service.dto.DepartmentDto;
import com.javaguides.department.service.entity.Department;
import com.javaguides.department.service.repository.DepartmentRepository;
import com.javaguides.department.service.service.DepartmentService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(final DepartmentDto departmentDto) {
        final var departmentToSave = Department.make(departmentDto);
        final var departmentSaved = departmentRepository.save(departmentToSave);
        return DepartmentDto.make(departmentSaved);
    }

}
