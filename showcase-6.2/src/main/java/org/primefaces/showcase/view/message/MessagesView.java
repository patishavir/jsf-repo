/*    */
package org.primefaces.showcase.view.message;

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
/*    */ public class MessagesView
/*    */ {
	/*    */ public void info() {
		/* 27 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "PrimeFaces Rocks."));
		/*    */ }

	/*    */
	/*    */ public void warn() {
		/* 31 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning!", "Watch out for PrimeFaces."));
		/*    */ }

	/*    */
	/*    */ public void error() {
		/* 35 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Contact admin."));
		/*    */ }

	/*    */
	/*    */ public void fatal() {
		/* 39 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_FATAL, "Fatal!", "System Error"));
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\message\MessagesView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */