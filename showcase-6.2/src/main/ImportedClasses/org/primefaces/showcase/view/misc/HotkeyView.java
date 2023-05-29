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
/*    */ public class HotkeyView
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
/*    */   public void save() {
/* 36 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Submitted with Hotkey"));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\misc\HotkeyView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */