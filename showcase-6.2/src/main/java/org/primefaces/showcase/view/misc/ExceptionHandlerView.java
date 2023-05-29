/*    */
package org.primefaces.showcase.view.misc;

/*    */
/*    */ import javax.faces.FacesException;
/*    */ import javax.faces.application.ViewExpiredException;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.RequestScoped;
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
/*    */ @RequestScoped
/*    */ public class ExceptionHandlerView
/*    */ {
	/*    */ public void throwNullPointerException() {
		/* 29 */ throw new NullPointerException("A NullPointerException!");
		/*    */ }

	/*    */
	/*    */ public void throwWrappedIllegalStateException() {
		/* 33 */ Throwable t = new IllegalStateException("A wrapped IllegalStateException!");
		/* 34 */ throw new FacesException(t);
		/*    */ }

	/*    */
	/*    */ public void throwViewExpiredException() {
		/* 38 */ throw new ViewExpiredException("A ViewExpiredException!",
				/* 39 */ FacesContext.getCurrentInstance().getViewRoot().getViewId());
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\ExceptionHandlerView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */