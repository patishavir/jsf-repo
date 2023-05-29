/*    */ package WEB-INF.classes.org.primefaces.showcase.view.misc;
/*    */ 
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
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
/*    */ public class EffectView
/*    */ {
/*    */   private String text;
/*    */   
/*    */   public String getText() {
/* 28 */     return this.text;
/*    */   }
/*    */   
/*    */   public void setText(String text) {
/* 32 */     this.text = text;
/*    */   }
/*    */   
/*    */   public void echo() {
/* 36 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You said:'" + this.text + "'"));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\misc\EffectView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */