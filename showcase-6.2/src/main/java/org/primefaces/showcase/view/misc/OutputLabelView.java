/*    */
package org.primefaces.showcase.view.misc;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.validation.constraints.NotNull;

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
/*    */ @ViewScoped
/*    */ public class OutputLabelView/*    */ implements Serializable
/*    */ {
	/*    */ @NotNull
	/*    */ private String value;
	/*    */ private String nullableValue;

	/*    */
	/*    */ public String getValue() {
		/* 33 */ return this.value;
		/*    */ }

	/*    */
	/*    */ public void setValue(String value) {
		/* 37 */ this.value = value;
		/*    */ }

	/*    */
	/*    */ public String getNullableValue() {
		/* 41 */ return this.nullableValue;
		/*    */ }

	/*    */
	/*    */ public void setNullableValue(String nullableValue) {
		/* 45 */ this.nullableValue = nullableValue;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\OutputLabelView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */