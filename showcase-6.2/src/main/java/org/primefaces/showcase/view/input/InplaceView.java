/*    */
package org.primefaces.showcase.view.input;

/*    */
/*    */ import java.io.Serializable;
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
/*    */ @ManagedBean
/*    */ public class InplaceView/*    */ implements Serializable
/*    */ {
	/* 24 */ private String text = "PrimeFaces";

	/*    */
	/*    */ public String getText() {
		/* 27 */ return this.text;
		/*    */ }

	/*    */
	/*    */ public void setText(String text) {
		/* 31 */ this.text = text;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\input\InplaceView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */