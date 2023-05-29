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
/*    */ public class IdleMonitorView
/*    */ {
/*    */   public void onIdle() {
/* 26 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "No activity.", "What are you doing over there?"));
/*    */   }
/*    */ 
/*    */   
/*    */   public void onActive() {
/* 31 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Welcome Back", "Well, that's a long coffee break!"));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\misc\IdleMonitorView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */