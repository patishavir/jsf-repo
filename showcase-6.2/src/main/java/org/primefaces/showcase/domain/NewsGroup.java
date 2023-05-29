/*    */
package org.primefaces.showcase.domain;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import org.primefaces.showcase.domain.NewsEntry;

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
/*    */ public class NewsGroup/*    */ implements Serializable
/*    */ {
	/*    */ private String title;
	/*    */ private List<NewsEntry> entries;

	/*    */
	/*    */ public NewsGroup() {
	}

	/*    */
	/*    */ public NewsGroup(String title, List<NewsEntry> entries) {
		/* 32 */ this.title = title;
		/* 33 */ this.entries = entries;
		/*    */ }

	/*    */
	/*    */ public String getTitle() {
		/* 37 */ return this.title;
		/*    */ }

	/*    */
	/*    */ public void setTitle(String title) {
		/* 41 */ this.title = title;
		/*    */ }

	/*    */
	/*    */ public List<NewsEntry> getEntries() {
		/* 45 */ return this.entries;
		/*    */ }

	/*    */
	/*    */ public void setEntries(List<NewsEntry> entries) {
		/* 49 */ this.entries = entries;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * domain\NewsGroup.class Java compiler version: 6 (50.0) JD-Core Version: 1.1.3
 */