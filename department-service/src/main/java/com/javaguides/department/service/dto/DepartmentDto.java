package com.javaguides.department.service.dto;

import com.javaguides.department.service.entity.Department;

public record DepartmentDto(
    Long id,
    String departmentName,
    String departmentDescription,
    String departmentCode
) {

    public static DepartmentDto make(final Department department) {
        return new DepartmentDto(
            department.getId(),
            department.getDepartmentName(),
            department.getDepartmentDescription(),
            department.getDepartmentCode()
        );
    }

}
