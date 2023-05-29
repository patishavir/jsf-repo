/*    */
package org.primefaces.showcase.view.misc;

/*    */
/*    */ import java.util.Date;
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
/*    */ public class TerminalView
/*    */ {
	/*    */ public String handleCommand(String command, String[] params) {
		/* 25 */ if (command.equals("greet")) {
			/* 26 */ if (params.length > 0) {
				/* 27 */ return "Hello " + params[0];
				/*    */ }
			/* 29 */ return "Hello Stranger";
			/*    */ }
		/* 31 */ if (command.equals("date")) {
			/* 32 */ return (new Date()).toString();
			/*    */ }
		/* 34 */ return command + " not found";
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\TerminalView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */