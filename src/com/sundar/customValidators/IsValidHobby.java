package com.sundar.customValidators;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target( (ElementType.FIELD) )
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	/*The below is to make the custom annotation to accept the string parameter in student class
	and the name of String anyName();*/
	
	String listOfValidHobbies() default "Music|Football|Cricket|Hockey";
	
	String message() default "Please provide a valid Hobby;" + 
	"Accepted hobbies are - Music|Football|Cricket|Hockey";
	//<?> - Collection
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
