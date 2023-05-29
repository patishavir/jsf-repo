/*    */
package org.primefaces.showcase.view.misc;

/*    */
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
/*    */ @ManagedBean
/*    */ public class WatermarkView
/*    */ {
	/*    */ private String keyword;

	/*    */
	/*    */ public String getKeyword() {
		/* 28 */ return this.keyword;
		/*    */ }

	/*    */
	/*    */ public void setKeyword(String keyword) {
		/* 32 */ this.keyword = keyword;
		/*    */ }

	/*    */
	/*    */ public void search() {
		/* 36 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "No results found with ", "'" + this.keyword + "'"));
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\WatermarkView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */