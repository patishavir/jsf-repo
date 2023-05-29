/*    */
package org.primefaces.showcase.view.panel;

/*    */
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.CloseEvent;
/*    */ import org.primefaces.event.ToggleEvent;

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
/*    */ public class PanelView
/*    */ {
	/*    */ public void onClose(CloseEvent event) {
		/* 29 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed",
				"Closed panel id:'" + event.getComponent().getId() + "'");
		/* 30 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }

	/*    */
	/*    */ public void onToggle(ToggleEvent event) {
		/* 34 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				event.getComponent().getId() + " toggled", "Status:" + event.getVisibility().name());
		/* 35 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\panel\PanelView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */