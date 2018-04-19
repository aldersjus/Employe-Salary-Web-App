package com.justin.spring.web.app.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * ConstraintValidator used with MyValidator Custom Annotation to apply the password check conditions.
 * @author Justin Alderson
 *
 */
public class MyConstraintValidator implements ConstraintValidator<MyValidator, String>{

	private String myField;
	@Override
	public void initialize(MyValidator validator) {
		myField = validator.value();
	}

	@Override
	public boolean isValid(String check, ConstraintValidatorContext conValCon) {
		boolean result = false;
		if(check != null) {
			result = check.startsWith(myField);
		}
		return result;
	}

}
