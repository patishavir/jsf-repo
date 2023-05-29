/*    */
package org.primefaces.showcase.view.ajax;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;

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
/*    */ @ViewScoped
/*    */ public class CounterView/*    */ implements Serializable
/*    */ {
	/*    */ private int number;

	/*    */
	/*    */ public int getNumber() {
		/* 29 */ return this.number;
		/*    */ }

	/*    */
	/*    */ public void increment() {
		/* 33 */ this.number++;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\ajax\CounterView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */