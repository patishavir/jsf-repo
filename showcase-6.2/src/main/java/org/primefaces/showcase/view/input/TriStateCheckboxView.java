/*    */
package org.primefaces.showcase.view.input;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
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
/*    */ @ManagedBean(name = "triStateCheckboxView")
/*    */ @ViewScoped
/*    */ public class TriStateCheckboxView/*    */ implements Serializable
/*    */ {
	/*    */ private String value1;
	/*    */ private String value2;
	/*    */ private String value3;
	/*    */ private String value4;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 36 */ this.value1 = "2";
		/* 37 */ this.value4 = "1";
		/*    */ }

	/*    */
	/*    */ public String getValue1() {
		/* 41 */ return this.value1;
		/*    */ }

	/*    */
	/*    */ public void setValue1(String value1) {
		/* 45 */ this.value1 = value1;
		/*    */ }

	/*    */
	/*    */ public String getValue2() {
		/* 49 */ return this.value2;
		/*    */ }

	/*    */
	/*    */ public void setValue2(String value2) {
		/* 53 */ this.value2 = value2;
		/*    */ }

	/*    */
	/*    */ public String getValue3() {
		/* 57 */ return this.value3;
		/*    */ }

	/*    */
	/*    */ public void setValue3(String value3) {
		/* 61 */ this.value3 = value3;
		/*    */ }

	/*    */
	/*    */ public String getValue4() {
		/* 65 */ return this.value4;
		/*    */ }

	/*    */
	/*    */ public void setValue4(String value4) {
		/* 69 */ this.value4 = value4;
		/*    */ }

	/*    */
	/*    */ public void addMessage() {
		/* 73 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "State has been changed",
				"State is = " + this.value2);
		/*    */
		/* 75 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\input\TriStateCheckboxView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */