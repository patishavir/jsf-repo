/*    */ package WEB-INF.classes.org.primefaces.showcase.view.panel;
/*    */ 
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.ToggleEvent;
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
/*    */ public class FieldsetView
/*    */ {
/*    */   public void handleToggle(ToggleEvent event) {
/* 28 */     FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibility:" + event.getVisibility());
/* 29 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\panel\FieldsetView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */