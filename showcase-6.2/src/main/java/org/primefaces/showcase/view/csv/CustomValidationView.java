/*    */
package org.primefaces.showcase.view.csv;

/*    */
/*    */ import javax.faces.bean.ManagedBean;
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
/*    */ @ManagedBean
/*    */ public class CustomValidationView
/*    */ {
	/*    */ private String text;
	/*    */ @Email(message = "must be a valid email")
	/*    */ private String email;

	/*    */
	/*    */ public String getText() {
		/* 29 */ return this.text;
		/*    */ }

	/*    */ public void setText(String text) {
		/* 32 */ this.text = text;
		/*    */ }

	/*    */
	/*    */ public String getEmail() {
		/* 36 */ return this.email;
		/*    */ }

	/*    */ public void setEmail(String email) {
		/* 39 */ this.email = email;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\csv\CustomValidationView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */