/*    */
package org.primefaces.showcase.view.df;

/*    */
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import org.primefaces.PrimeFaces;
/*    */ import org.primefaces.event.SelectEvent;

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
/*    */ @ManagedBean(name = "dfLevel2View")
/*    */ public class DFLevel2View
/*    */ {
	/*    */ public void openLevel3() {
		/* 29 */ Map<String, Object> options = new HashMap<String, Object>();
		/* 30 */ options.put("modal", Boolean.valueOf(true));
		/* 31 */ PrimeFaces.current().dialog().openDynamic("level3", options, null);
		/*    */ }

	/*    */
	/*    */
	/*    */ public void onReturnFromLevel3(SelectEvent event) {
		/* 36 */ PrimeFaces.current().dialog().closeDynamic(event.getObject());
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\df\DFLevel2View.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */