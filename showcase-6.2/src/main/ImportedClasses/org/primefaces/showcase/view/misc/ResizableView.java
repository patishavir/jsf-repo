/*    */ package WEB-INF.classes.org.primefaces.showcase.view.misc;
/*    */ 
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.ResizeEvent;
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
/*    */ public class ResizableView
/*    */ {
/*    */   public void onResize(ResizeEvent event) {
/* 28 */     FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Image resized", "Width:" + event.getWidth() + ",Height:" + event.getHeight());
/*    */     
/* 30 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\misc\ResizableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */