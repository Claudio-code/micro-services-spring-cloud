package com.javaguides.employees.service.dto;

public record DepartmentDto(
    Long id,
    String departmentName,
    String departmentDescription,
    String departmentCode
) {
}
