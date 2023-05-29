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
/*    */ public class Event/*    */ implements Serializable
/*    */ {
	/*    */ private String name;
	/*    */ private Date start;
	/*    */ private Date end;

	/*    */
	/*    */ public Event(String name) {
		/* 28 */ this.name = name;
		/*    */ }

	/*    */
	/*    */ public String getName() {
		/* 32 */ return this.name;
		/*    */ }

	/*    */
	/*    */ public void setName(String name) {
		/* 36 */ this.name = name;
		/*    */ }

	/*    */
	/*    */ public Date getStart() {
		/* 40 */ return this.start;
		/*    */ }

	/*    */
	/*    */ public void setStart(Date start) {
		/* 44 */ this.start = start;
		/*    */ }

	/*    */
	/*    */ public Date getEnd() {
		/* 48 */ return this.end;
		/*    */ }

	/*    */
	/*    */ public void setEnd(Date end) {
		/* 52 */ this.end = end;
		/*    */ }

	/*    */
	/*    */
	/*    */ public boolean equals(Object o) {
		/* 57 */ if (this == o) {
			/* 58 */ return true;
			/*    */ }
		/*    */
		/* 61 */ if (o == null || getClass() != o.getClass()) {
			/* 62 */ return false;
			/*    */ }
		/*    */
		/* 65 */ org.primefaces.showcase.domain.Event event = (org.primefaces.showcase.domain.Event) o;
		/*    */
		/* 67 */ if ((this.name != null) ? !this.name.equals(event.name) : (event.name != null)) {
			/* 68 */ return false;
			/*    */ }
		/*    */
		/* 71 */ return true;
		/*    */ }

	/*    */
	/*    */
	/*    */ public int hashCode() {
		/* 76 */ return (this.name != null) ? this.name.hashCode() : 0;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * domain\Event.class Java compiler version: 6 (50.0) JD-Core Version: 1.1.3
 */