package com.mockitocourse.qa.vo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ChildDateOfBirthValidator.class)
public @interface ValidateChildDOB {

    public String message() default "Invalid child date of birth...";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
