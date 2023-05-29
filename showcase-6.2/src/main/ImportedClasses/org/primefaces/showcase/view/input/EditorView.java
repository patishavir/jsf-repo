/*    */ package WEB-INF.classes.org.primefaces.showcase.view.input;
/*    */ 
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
/*    */ 
/*    */ @ManagedBean
/*    */ public class EditorView
/*    */ {
/*    */   private String text;
/*    */   private String text2;
/*    */   
/*    */   public String getText() {
/* 28 */     return this.text;
/*    */   }
/*    */   
/*    */   public void setText(String text) {
/* 32 */     this.text = text;
/*    */   }
/*    */   
/*    */   public String getText2() {
/* 36 */     return this.text2;
/*    */   }
/*    */   
/*    */   public void setText2(String text2) {
/* 40 */     this.text2 = text2;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\EditorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */