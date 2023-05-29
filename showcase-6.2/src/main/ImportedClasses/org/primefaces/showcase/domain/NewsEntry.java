/*    */ package WEB-INF.classes.org.primefaces.showcase.domain;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class NewsEntry
/*    */   implements Serializable
/*    */ {
/*    */   private String title;
/*    */   private String content;
/*    */   private int index;
/*    */   
/*    */   public NewsEntry() {}
/*    */   
/*    */   public NewsEntry(int index, String title, String content) {
/* 31 */     this.index = index;
/* 32 */     this.content = content;
/* 33 */     this.title = title;
/*    */   }
/*    */   
/*    */   public String getTitle() {
/* 37 */     return this.title;
/*    */   }
/*    */   
/*    */   public void setTitle(String title) {
/* 41 */     this.title = title;
/*    */   }
/*    */   
/*    */   public String getContent() {
/* 45 */     return this.content;
/*    */   }
/*    */   
/*    */   public void setContent(String content) {
/* 49 */     this.content = content;
/*    */   }
/*    */   
/*    */   public int getIndex() {
/* 53 */     return this.index;
/*    */   }
/*    */   
/*    */   public void setIndex(int index) {
/* 57 */     this.index = index;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\domain\NewsEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */