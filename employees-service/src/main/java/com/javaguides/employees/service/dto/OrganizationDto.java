package com.javaguides.employees.service.dto;

import java.time.LocalDateTime;

public record OrganizationDto(
    Long id,
    String organizationName,
    String organizationDescription,
    String organizationCode,
    LocalDateTime createdDate
) {
}
