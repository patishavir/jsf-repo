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
/*    */ public class Book
/*    */   implements Serializable
/*    */ {
/*    */   private String title;
/*    */   private String author;
/*    */   private String publisher;
/*    */   private Integer pages;
/*    */   
/*    */   public String getTitle() {
/* 28 */     return this.title;
/*    */   }
/*    */   
/*    */   public void setTitle(String title) {
/* 32 */     this.title = title;
/*    */   }
/*    */   
/*    */   public String getAuthor() {
/* 36 */     return this.author;
/*    */   }
/*    */   
/*    */   public void setAuthor(String author) {
/* 40 */     this.author = author;
/*    */   }
/*    */   
/*    */   public String getPublisher() {
/* 44 */     return this.publisher;
/*    */   }
/*    */   
/*    */   public void setPublisher(String publisher) {
/* 48 */     this.publisher = publisher;
/*    */   }
/*    */   
/*    */   public Integer getPages() {
/* 52 */     return this.pages;
/*    */   }
/*    */   
/*    */   public void setPages(Integer pages) {
/* 56 */     this.pages = pages;
/*    */   }
/*    */   
/*    */   public boolean equals(Object obj) {
/* 60 */     if (!(obj instanceof org.primefaces.showcase.domain.Book)) {
/* 61 */       return false;
/*    */     }
/* 63 */     org.primefaces.showcase.domain.Book book = (org.primefaces.showcase.domain.Book)obj;
/*    */     
/* 65 */     return (book.getTitle() != null && book.getTitle().equals(this.title) && book.getAuthor() != null && book.getAuthor().equals(this.author));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 69 */     int hash = 1;
/* 70 */     if (this.title != null) {
/* 71 */       hash = hash * 31 + this.title.hashCode();
/*    */     }
/* 73 */     if (this.author != null) {
/* 74 */       hash = hash * 29 + this.author.hashCode();
/*    */     }
/* 76 */     return hash;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\domain\Book.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */