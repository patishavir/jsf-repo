/*    */
package org.primefaces.showcase.view.csv;

/*    */
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.validation.metadata.ConstraintDescriptor;
/*    */ import org.primefaces.showcase.view.csv.Email;
/*    */ import org.primefaces.validate.bean.ClientValidationConstraint;

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
/*    */ public class EmailClientValidationConstraint/*    */ implements ClientValidationConstraint
/*    */ {
	/*    */ public static final String MESSAGE_METADATA = "data-p-email-msg";

	/*    */
	/*    */ public Map<String, Object> getMetadata(ConstraintDescriptor constraintDescriptor) {
		/* 31 */ Map<String, Object> metadata = new HashMap<String, Object>();
		/* 32 */ Map attrs = constraintDescriptor.getAttributes();
		/* 33 */ Object message = attrs.get("message");
		/* 34 */ if (message != null) {
			/* 35 */ metadata.put("data-p-email-msg", message);
			/*    */ }
		/*    */
		/* 38 */ return metadata;
		/*    */ }

	/*    */
	/*    */ public String getValidatorId() {
		/* 42 */ return Email.class.getSimpleName();
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\csv\EmailClientValidationConstraint.class Java compiler version: 6
 * (50.0) JD-Core Version: 1.1.3
 */