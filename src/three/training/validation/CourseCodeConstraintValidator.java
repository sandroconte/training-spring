package three.training.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		this.coursePrefix = courseCode.value();		
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {	
		if (code == null) return false;			
		return code.startsWith(coursePrefix);
	}

}
