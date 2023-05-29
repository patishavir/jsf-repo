/*    */ package WEB-INF.classes.org.primefaces.showcase.view.misc;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.showcase.domain.Book;
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
/*    */ @ViewScoped
/*    */ public class CollectorView
/*    */   implements Serializable
/*    */ {
/*    */   private Book book;
/*    */   private List<Book> books;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 38 */     this.book = new Book();
/* 39 */     this.books = new ArrayList<Book>();
/*    */   }
/*    */ 
/*    */   
/*    */   public void createNew() {
/* 44 */     if (this.books.contains(this.book)) {
/* 45 */       FacesMessage msg = new FacesMessage("Dublicated", "This book has already been added");
/* 46 */       FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */     } else {
/*    */       
/* 49 */       this.books.add(this.book);
/* 50 */       this.book = new Book();
/*    */     } 
/*    */   }
/*    */   
/*    */   public String reinit() {
/* 55 */     this.book = new Book();
/*    */     
/* 57 */     return null;
/*    */   }
/*    */   
/*    */   public Book getBook() {
/* 61 */     return this.book;
/*    */   }
/*    */   
/*    */   public List<Book> getBooks() {
/* 65 */     return this.books;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\misc\CollectorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */