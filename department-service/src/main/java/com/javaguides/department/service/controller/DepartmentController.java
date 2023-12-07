package com.javaguides.department.service.controller;

import com.javaguides.department.service.dto.DepartmentDto;
import com.javaguides.department.service.service.DepartmentService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/departments")
@RequiredArgsConstructor
class DepartmentController {
    private DepartmentService departmentService;

    @PostMapping
    public DepartmentDto saveDepartment(@RequestBody final DepartmentDto departmentDto) {
        return departmentService.saveDepartment(departmentDto);
    }
}
