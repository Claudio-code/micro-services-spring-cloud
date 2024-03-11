package com.javaguides.employees.service.service.impl;

import com.javaguides.employees.service.dto.APIResponseDto;
import com.javaguides.employees.service.dto.EmployeeDto;
import com.javaguides.employees.service.dto.OrganizationDto;
import com.javaguides.employees.service.mapper.EmployeeMapper;
import com.javaguides.employees.service.repository.EmployeeRepository;
import com.javaguides.employees.service.service.ApiClient;
import com.javaguides.employees.service.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    private ApiClient apiClient;


    @Override
    public EmployeeDto saveEmployee(final EmployeeDto employeeDto) {
        final var employee = employeeRepository.save(EmployeeMapper.mapToEmployee(employeeDto));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public APIResponseDto getEmployeeById(final Long employeeId) {
        return employeeRepository.findById(employeeId)
        .map(emp -> {
            final var departmentDto = apiClient.getDepartment(emp.departmentCode());
            return new APIResponseDto(EmployeeMapper.mapToEmployeeDto(emp), departmentDto, null);
        }).orElseThrow();
    }
}
