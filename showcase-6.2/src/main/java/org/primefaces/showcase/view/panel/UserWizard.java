/*    */
package org.primefaces.showcase.view.panel;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.FlowEvent;
/*    */ import org.primefaces.showcase.domain.User;

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
/*    */ public class UserWizard/*    */ implements Serializable
/*    */ {
	/* 30 */ private User user = new User();
	/*    */
	/*    */ private boolean skip;

	/*    */
	/*    */ public User getUser() {
		/* 35 */ return this.user;
		/*    */ }

	/*    */
	/*    */ public void setUser(User user) {
		/* 39 */ this.user = user;
		/*    */ }

	/*    */
	/*    */ public void save() {
		/* 43 */ FacesMessage msg = new FacesMessage("Successful", "Welcome :" + this.user.getFirstname());
		/* 44 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }

	/*    */
	/*    */ public boolean isSkip() {
		/* 48 */ return this.skip;
		/*    */ }

	/*    */
	/*    */ public void setSkip(boolean skip) {
		/* 52 */ this.skip = skip;
		/*    */ }

	/*    */
	/*    */ public String onFlowProcess(FlowEvent event) {
		/* 56 */ if (this.skip) {
			/* 57 */ this.skip = false;
			/* 58 */ return "confirm";
			/*    */ }
		/*    */
		/* 61 */ return event.getNewStep();
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\panel\UserWizard.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */