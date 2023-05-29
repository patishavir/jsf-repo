/*    */
package org.primefaces.showcase.view.app;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.Map;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.SessionScoped;
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
/*    */ @SessionScoped
/*    */ public class GuestPreferences/*    */ implements Serializable
/*    */ {
	/* 28 */ private String theme = "omega";

	/*    */
	/*    */ public String getTheme() {
		/* 31 */ return this.theme;
		/*    */ }

	/*    */
	/*    */ public void setTheme(String theme) {
		/* 35 */ this.theme = theme;
		/*    */ }

	/*    */
	/*    */ public void changeTheme() {
		/* 39 */ Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap();
		/* 40 */ if (params.containsKey("globaltheme"))
			/* 41 */ this.theme = params.get("globaltheme");
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\app\GuestPreferences.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */