package com.javaguides.employees.service.dto;

public record APIResponseDto(
    EmployeeDto employee,
    DepartmentDto department,
    OrganizationDto organization
) {
}
