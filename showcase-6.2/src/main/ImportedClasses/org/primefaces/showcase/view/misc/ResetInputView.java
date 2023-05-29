/*    */ package WEB-INF.classes.org.primefaces.showcase.view.misc;
/*    */ 
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.PrimeFaces;
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
/*    */ 
/*    */ @ManagedBean
/*    */ public class ResetInputView
/*    */ {
/*    */   private String text1;
/*    */   private String text2;
/*    */   
/*    */   public String getText1() {
/* 32 */     return this.text1;
/*    */   }
/*    */   
/*    */   public void setText1(String text1) {
/* 36 */     this.text1 = text1;
/*    */   }
/*    */   
/*    */   public String getText2() {
/* 40 */     return this.text2;
/*    */   }
/*    */   
/*    */   public void setText2(String text2) {
/* 44 */     this.text2 = text2;
/*    */   }
/*    */   
/*    */   public void save() {
/* 48 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Data Saved"));
/*    */   }
/*    */   
/*    */   public void reset() {
/* 52 */     PrimeFaces.current().resetInputs(new String[] { "form:panel" });
/*    */   }
/*    */   
/*    */   public void resetFail() {
/* 56 */     this.text1 = null;
/* 57 */     this.text2 = null;
/*    */     
/* 59 */     FacesMessage msg = new FacesMessage("Model reset, but it won't work properly.");
/* 60 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\misc\ResetInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */