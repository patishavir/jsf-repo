/*    */
package org.primefaces.showcase.view.misc;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
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
/*    */
/*    */ @ManagedBean
/*    */ public class DefaultCommandView
/*    */ {
	/*    */ private String text;
	/* 30 */ private String btn = "btn1";
	/*    */
	/*    */ private List<String> buttons;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 36 */ this.buttons = new ArrayList<String>();
		/* 37 */ this.buttons.add("btn1");
		/* 38 */ this.buttons.add("btn2");
		/* 39 */ this.buttons.add("btn3");
		/*    */ }

	/*    */
	/*    */ public String getBtn() {
		/* 43 */ return this.btn;
		/*    */ }

	/*    */
	/*    */ public void setBtn(String btn) {
		/* 47 */ this.btn = btn;
		/*    */ }

	/*    */
	/*    */ public List<String> getButtons() {
		/* 51 */ return this.buttons;
		/*    */ }

	/*    */
	/*    */ public void setButtons(List<String> buttons) {
		/* 55 */ this.buttons = buttons;
		/*    */ }

	/*    */
	/*    */ public String getText() {
		/* 59 */ return this.text;
		/*    */ }

	/*    */
	/*    */ public void setText(String text) {
		/* 63 */ this.text = text;
		/*    */ }

	/*    */
	/*    */ public void addMessage(String btn) {
		/* 67 */ FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Submitted with " + btn));
		/*    */ }

	/*    */
	/*    */ public void btn1Submit() {
		/* 71 */ addMessage("btn1");
		/*    */ }

	/*    */
	/*    */ public void btn2Submit() {
		/* 75 */ addMessage("btn2");
		/*    */ }

	/*    */
	/*    */ public void btn3Submit() {
		/* 79 */ addMessage("btn3");
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\DefaultCommandView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */