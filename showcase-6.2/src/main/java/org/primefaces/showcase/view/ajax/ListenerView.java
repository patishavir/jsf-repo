/*    */
package org.primefaces.showcase.view.ajax;

/*    */
/*    */ import javax.faces.bean.ManagedBean;

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
/*    */ public class ListenerView
/*    */ {
	/*    */ private String text;

	/*    */
	/*    */ public String getText() {
		/* 26 */ return this.text;
		/*    */ }

	/*    */ public void setText(String text) {
		/* 29 */ this.text = text;
		/*    */ }

	/*    */
	/*    */ public void handleKeyEvent() {
		/* 33 */ this.text = this.text.toUpperCase();
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\ajax\ListenerView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */