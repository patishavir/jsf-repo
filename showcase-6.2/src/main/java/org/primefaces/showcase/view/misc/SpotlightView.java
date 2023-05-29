/*    */
package org.primefaces.showcase.view.misc;

/*    */
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;

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
/*    */ @ManagedBean
/*    */ public class SpotlightView
/*    */ {
	/*    */ private String username;
	/*    */ private String email;

	/*    */
	/*    */ public String getUsername() {
		/* 30 */ return this.username;
		/*    */ }

	/*    */
	/*    */ public void setUsername(String username) {
		/* 34 */ this.username = username;
		/*    */ }

	/*    */
	/*    */ public String getEmail() {
		/* 38 */ return this.email;
		/*    */ }

	/*    */
	/*    */ public void setEmail(String email) {
		/* 42 */ this.email = email;
		/*    */ }

	/*    */
	/*    */ public void save() {
		/* 46 */ this.username = null;
		/* 47 */ this.email = null;
		/* 48 */ FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\SpotlightView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */