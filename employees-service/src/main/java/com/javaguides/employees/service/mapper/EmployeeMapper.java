package com.javaguides.employees.service.mapper;

import com.javaguides.employees.service.dto.EmployeeDto;
import com.javaguides.employees.service.entity.Employee;

public class EmployeeMapper {
    private EmployeeMapper() {}

    public static EmployeeDto mapToEmployeeDto(final Employee employee) {
        return new EmployeeDto(
            employee.id(),
            employee.firstName(),
            employee.lastName(),
            employee.email(),
            employee.departmentCode(),
            employee.organizationCode()
        );
    }

    public static Employee mapToEmployee(final EmployeeDto employeeDto) {
        return new Employee(
            employeeDto.id(),
            employeeDto.firstName(),
            employeeDto.lastName(),
            employeeDto.email(),
            employeeDto.departmentCode(),
            employeeDto.organizationCode()
        );
    }
}
