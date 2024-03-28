package com.example.dto;

import jakarta.validation.ConstraintValidatorContext;

public interface DTO {
    default boolean isValid(ConstraintValidatorContext constraintValidatorContext) {
        return true;
    }
}

