package com.learning.mvc.config.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCodeObject) {
		coursePrefix = courseCodeObject.value();
	}
	
	@Override
	public boolean isValid(String theCourseCode, ConstraintValidatorContext constraintValidatorContext) {
		
		for(String tempCode : coursePrefix) {
			if(theCourseCode.startsWith(tempCode)) {
				return true;
			}
		}
		
		return false;
	}

}


/// {"LWT", "JAVA", "DDD",......................100101 }
//// s ----> you have to check if this s starts with any of the above strings present in given array.