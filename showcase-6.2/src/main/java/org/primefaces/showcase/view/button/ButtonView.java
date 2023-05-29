/*    */
package org.primefaces.showcase.view.button;

/*    */
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import javax.faces.event.ActionEvent;

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
/*    */ public class ButtonView
/*    */ {
	/*    */ public void save(ActionEvent actionEvent) {
		/* 27 */ addMessage("Data saved");
		/*    */ }

	/*    */
	/*    */ public void update(ActionEvent actionEvent) {
		/* 31 */ addMessage("Data updated");
		/*    */ }

	/*    */
	/*    */ public void delete(ActionEvent actionEvent) {
		/* 35 */ addMessage("Data deleted");
		/*    */ }

	/*    */
	/*    */ public void buttonAction(ActionEvent actionEvent) {
		/* 39 */ addMessage("Welcome to Primefaces!!");
		/*    */ }

	/*    */
	/*    */ public void addMessage(String summary) {
		/* 43 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
		/* 44 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\button\ButtonView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */