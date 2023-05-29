/*    */
package org.primefaces.showcase.view.misc;

/*    */
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.PrimeFaces;
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
/*    */
/*    */
/*    */ @ManagedBean
/*    */ public class RequestContextView
/*    */ {
	/*    */ private User user;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 33 */ this.user = new User();
		/*    */
		/* 35 */ if (!FacesContext.getCurrentInstance().isPostback()) {
			/* 36 */ PrimeFaces.current().executeScript("alert('This onload script is added from backing bean.')");
			/*    */ }
		/*    */ }

	/*    */
	/*    */ public User getUser() {
		/* 41 */ return this.user;
		/*    */ }

	/*    */
	/*    */ public void setUser(User user) {
		/* 45 */ this.user = user;
		/*    */ }

	/*    */
	/*    */ public void save() {
		/* 49 */ PrimeFaces.current().ajax().addCallbackParam("saved", Boolean.valueOf(true));
		/* 50 */ PrimeFaces.current().ajax().addCallbackParam("user", this.user);
		/*    */
		/*    */
		/* 53 */ PrimeFaces.current().executeScript("PrimeFaces.info('Hello from the Backing Bean');");
		/*    */
		/*    */
		/* 56 */ PrimeFaces.current().ajax().update(new String[] { "form:panel" });
		/*    */
		/*    */
		/* 59 */ PrimeFaces.current().scrollTo("form:panel");
		/*    */
		/*    */
		/* 62 */ FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Success", "Success"));
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\RequestContextView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */