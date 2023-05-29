/*    */
package org.primefaces.showcase.view.input;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */
/*    */ @ManagedBean
/*    */ public class InputTextareaView
/*    */ {
	/*    */ public List<String> completeArea(String query) {
		/* 26 */ List<String> results = new ArrayList<String>();
		/*    */
		/* 28 */ if (query.equals("PrimeFaces")) {
			/* 29 */ results.add("PrimeFaces Rocks!!!");
			/* 30 */ results.add("PrimeFaces has 100+ components.");
			/* 31 */ results.add("PrimeFaces is lightweight.");
			/* 32 */ results.add("PrimeFaces is easy to use.");
			/* 33 */ results.add("PrimeFaces is developed with passion!");
			/*    */ } else {
			/*    */
			/* 36 */ for (int i = 0; i < 10; i++) {
				/* 37 */ results.add(query + i);
				/*    */ }
			/*    */ }
		/*    */
		/* 41 */ return results;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\input\InputTextareaView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */