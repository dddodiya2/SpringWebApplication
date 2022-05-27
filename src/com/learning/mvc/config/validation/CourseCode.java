package com.learning.mvc.config.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
public @interface CourseCode {

	public String[] value() default {"JAVA"} ;
	
	public String message() default "Course code must start with JAVA";
	
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
	
}
