/*    */
package org.primefaces.showcase.view.csv;

/*    */
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.util.regex.Pattern;
/*    */ import javax.validation.ConstraintValidator;
/*    */ import javax.validation.ConstraintValidatorContext;
/*    */ import org.primefaces.showcase.view.csv.Email;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ public class EmailConstraintValidator/*    */ implements ConstraintValidator<Email, String>
/*    */ {
	/*    */ private Pattern pattern;
	/*    */ private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/*    */
	/*    */ public void initialize(Email a) {
		/* 33 */ this.pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		/*    */ }

	/*    */
	/*    */ public boolean isValid(String value, ConstraintValidatorContext cvc) {
		/* 37 */ if (value == null) {
			/* 38 */ return true;
			/*    */ }
		/* 40 */ return this.pattern.matcher(value.toString()).matches();
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\csv\EmailConstraintValidator.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */