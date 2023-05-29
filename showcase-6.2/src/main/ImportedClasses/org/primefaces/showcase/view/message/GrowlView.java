/*    */ package WEB-INF.classes.org.primefaces.showcase.view.message;
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
/*    */ public class GrowlView
/*    */ {
/*    */   private String message;
/*    */   
/*    */   public String getMessage() {
/* 28 */     return this.message;
/*    */   }
/*    */   
/*    */   public void setMessage(String message) {
/* 32 */     this.message = message;
/*    */   }
/*    */   
/*    */   public void saveMessage() {
/* 36 */     FacesContext context = FacesContext.getCurrentInstance();
/*    */     
/* 38 */     context.addMessage(null, new FacesMessage("Successful", "Your message: " + this.message));
/* 39 */     context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\message\GrowlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */