package com.javaguides.employees.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id,
    String firstName,
    String lastName,
    @Column(nullable = false, unique = true)
    String email,
    String departmentCode,
    String organizationCode
) {
}
