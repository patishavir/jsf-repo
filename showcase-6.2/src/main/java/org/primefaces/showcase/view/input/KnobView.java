/*    */
package org.primefaces.showcase.view.input;

/*    */
/*    */ import java.io.Serializable;
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
/*    */ @ManagedBean
/*    */ public class KnobView/*    */ implements Serializable
/*    */ {
	/* 26 */ private int value = 50;

	/*    */
	/*    */ public int getValue() {
		/* 29 */ return this.value;
		/*    */ }

	/*    */
	/*    */ public void setValue(int value) {
		/* 33 */ this.value = value;
		/*    */ }

	/*    */
	/*    */ public void onChange() {
		/* 37 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "You have selected: " + this.value, null));
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\input\KnobView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */