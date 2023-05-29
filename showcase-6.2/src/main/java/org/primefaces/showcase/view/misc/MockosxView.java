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
/*    */ @ManagedBean
/*    */ public class MockosxView
/*    */ {
	/*    */ private String text;

	/*    */
	/*    */ public void init() {
		/* 28 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Software Update", "New version of iTunes is available"));
		/* 29 */ FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Software Update", "New version of PrimeFaces is available"));
		/*    */ }

	/*    */
	/*    */ public String getText() {
		/* 33 */ return this.text;
		/*    */ }

	/*    */
	/*    */ public void setText(String text) {
		/* 37 */ this.text = text;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\MockosxView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */