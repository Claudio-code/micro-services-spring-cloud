package com.javaguides.employees.service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.javaguides.employees.service.dto.DepartmentDto;

@FeignClient(name = "${department-service.url}")
public interface ApiClient {
    @GetMapping("api/departments/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") final String departmentCode);    
}
