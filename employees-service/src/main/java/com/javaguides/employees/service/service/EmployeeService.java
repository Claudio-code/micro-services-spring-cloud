package com.javaguides.employees.service.service;

import com.javaguides.employees.service.dto.APIResponseDto;
import com.javaguides.employees.service.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto savEmployee(final EmployeeDto employeeDto);

    APIResponseDto gEmployeeById(final Long employeeId);
}
