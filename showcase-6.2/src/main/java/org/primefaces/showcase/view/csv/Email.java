package org.primefaces.showcase.view.csv;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import org.primefaces.showcase.view.csv.EmailClientValidationConstraint;
import org.primefaces.showcase.view.csv.EmailConstraintValidator;
import org.primefaces.validate.bean.ClientConstraint;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { EmailConstraintValidator.class })
@ClientConstraint(resolvedBy = EmailClientValidationConstraint.class)
@Documented
public @interface Email {
	String message() default "{org.primefaces.examples.primefaces}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\csv\Email.class Java compiler version: 6 (50.0) JD-Core Version: 1.1.3
 */