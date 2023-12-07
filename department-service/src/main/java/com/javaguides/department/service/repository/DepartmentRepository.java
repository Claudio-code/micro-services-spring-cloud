package com.javaguides.department.service.repository;

import com.javaguides.department.service.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
