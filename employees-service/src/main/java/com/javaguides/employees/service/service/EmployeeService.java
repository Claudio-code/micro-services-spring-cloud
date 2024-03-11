package com.javaguides.employees.service.service;

import com.javaguides.employees.service.dto.APIResponseDto;
import com.javaguides.employees.service.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(final EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(final Long employeeId);
}
