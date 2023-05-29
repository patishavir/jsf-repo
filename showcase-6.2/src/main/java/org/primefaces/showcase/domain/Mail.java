/*    */
package org.primefaces.showcase.domain;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;

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
/*    */ public class Mail/*    */ implements Serializable
/*    */ {
	/*    */ public String from;
	/*    */ public String subject;
	/*    */ public String body;
	/*    */ public Date date;

	/*    */
	/*    */ public Mail() {
	}

	/*    */
	/*    */ public Mail(String from, String subject, String body, Date date) {
		/* 31 */ this.from = from;
		/* 32 */ this.subject = subject;
		/* 33 */ this.body = body;
		/* 34 */ this.date = date;
		/*    */ }

	/*    */
	/*    */ public String getBody() {
		/* 38 */ return this.body;
		/*    */ }

	/*    */
	/*    */ public void setBody(String body) {
		/* 42 */ this.body = body;
		/*    */ }

	/*    */
	/*    */ public Date getDate() {
		/* 46 */ return this.date;
		/*    */ }

	/*    */
	/*    */ public void setDate(Date date) {
		/* 50 */ this.date = date;
		/*    */ }

	/*    */
	/*    */ public String getFrom() {
		/* 54 */ return this.from;
		/*    */ }

	/*    */
	/*    */ public void setFrom(String from) {
		/* 58 */ this.from = from;
		/*    */ }

	/*    */
	/*    */ public String getSubject() {
		/* 62 */ return this.subject;
		/*    */ }

	/*    */
	/*    */ public void setSubject(String subject) {
		/* 66 */ this.subject = subject;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * domain\Mail.class Java compiler version: 6 (50.0) JD-Core Version: 1.1.3
 */