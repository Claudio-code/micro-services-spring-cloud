package com.javaguides.department.service.controller;

import com.javaguides.department.service.dto.DepartmentDto;
import com.javaguides.department.service.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping
    public DepartmentDto saveDepartment(@RequestBody final DepartmentDto departmentDto) {
        return departmentService.saveDepartment(departmentDto);
    }

    @GetMapping("{code}")
    public DepartmentDto getDepartment(@PathVariable final String code) {
        return departmentService.getDepartmentByCode(code);
    }
}
