/*    */ package WEB-INF.classes.org.primefaces.showcase.view.panel;
/*    */ 
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.component.layout.LayoutUnit;
/*    */ import org.primefaces.event.CloseEvent;
/*    */ import org.primefaces.event.ResizeEvent;
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
/*    */ @ManagedBean
/*    */ public class LayoutView
/*    */ {
/*    */   public void handleClose(CloseEvent event) {
/* 30 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Unit Closed", "Position:'" + ((LayoutUnit)event.getComponent()).getPosition() + "'");
/*    */     
/* 32 */     addMessage(message);
/*    */   }
/*    */   
/*    */   public void handleToggle(ToggleEvent event) {
/* 36 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, ((LayoutUnit)event.getComponent()).getPosition() + " toggled", "Status:" + event.getVisibility().name());
/*    */     
/* 38 */     addMessage(message);
/*    */   }
/*    */   
/*    */   public void handleResize(ResizeEvent event) {
/* 42 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, ((LayoutUnit)event.getComponent()).getPosition() + " resized", "Width:" + event.getWidth() + ", Height:" + event.getHeight());
/*    */     
/* 44 */     addMessage(message);
/*    */   }
/*    */   
/*    */   private void addMessage(FacesMessage message) {
/* 48 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\panel\LayoutView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */