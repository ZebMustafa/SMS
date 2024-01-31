package com.mockitocourse.qa.vo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Date;

public class ChildDateOfBirthValidator implements ConstraintValidator<ValidateChildDOB, Date> {
    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
        return null != value;
    }
}
