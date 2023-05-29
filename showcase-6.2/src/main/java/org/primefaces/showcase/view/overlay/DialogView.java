/*    */
package org.primefaces.showcase.view.overlay;

/*    */
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.CloseEvent;
/*    */ import org.primefaces.event.MoveEvent;

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
/*    */ public class DialogView
/*    */ {
	/*    */ public void handleClose(CloseEvent event) {
		/* 29 */ addMessage(event.getComponent().getId() + " closed", "So you don't like nature?");
		/*    */ }

	/*    */
	/*    */ public void handleMove(MoveEvent event) {
		/* 33 */ addMessage(event.getComponent().getId() + " moved",
				"Left: " + event.getLeft() + ", Top: " + event.getTop());
		/*    */ }

	/*    */
	/*    */ public void destroyWorld() {
		/* 37 */ addMessage("System Error", "Please try again later.");
		/*    */ }

	/*    */
	/*    */ public void addMessage(String summary, String detail) {
		/* 41 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		/* 42 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\overlay\DialogView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */