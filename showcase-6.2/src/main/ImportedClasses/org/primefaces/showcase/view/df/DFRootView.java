/*    */ package WEB-INF.classes.org.primefaces.showcase.view.df;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.PrimeFaces;
/*    */ import org.primefaces.event.SelectEvent;
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
/*    */ @ManagedBean(name = "dfRootView")
/*    */ public class DFRootView
/*    */ {
/*    */   public void openLevel1() {
/* 31 */     Map<String, Object> options = new HashMap<String, Object>();
/* 32 */     options.put("modal", Boolean.valueOf(true));
/* 33 */     PrimeFaces.current().dialog().openDynamic("level1", options, null);
/*    */   }
/*    */   
/*    */   public void onReturnFromLevel1(SelectEvent event) {
/* 37 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Data Returned", event.getObject().toString()));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\df\DFRootView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */