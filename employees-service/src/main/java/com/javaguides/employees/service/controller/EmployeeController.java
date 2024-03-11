package com.javaguides.employees.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.employees.service.dto.APIResponseDto;
import com.javaguides.employees.service.dto.EmployeeDto;
import com.javaguides.employees.service.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/employees")
class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping
    public EmployeeDto saveEmployee(@RequestBody final EmployeeDto employeeDto) {
        return employeeService.saveEmployee(employeeDto);
    }

    @GetMapping("{id}")
    public APIResponseDto getEmployee(@PathVariable("id") final Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }
}
