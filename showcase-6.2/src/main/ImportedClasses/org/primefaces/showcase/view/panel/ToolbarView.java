/*    */ package WEB-INF.classes.org.primefaces.showcase.view.panel;
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
/*    */ public class ToolbarView
/*    */ {
/*    */   public void save() {
/* 26 */     addMessage("Success", "Data saved");
/*    */   }
/*    */   
/*    */   public void update() {
/* 30 */     addMessage("Success", "Data updated");
/*    */   }
/*    */   
/*    */   public void delete() {
/* 34 */     addMessage("Success", "Data deleted");
/*    */   }
/*    */   
/*    */   public void addMessage(String summary, String detail) {
/* 38 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
/* 39 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\panel\ToolbarView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */