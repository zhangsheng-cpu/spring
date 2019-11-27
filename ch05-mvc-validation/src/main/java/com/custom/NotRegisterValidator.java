package com.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotRegisterValidator implements ConstraintValidator<NotRegister, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
