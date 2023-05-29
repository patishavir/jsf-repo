/*    */ package WEB-INF.classes.org.primefaces.showcase.view.df;
/*    */ 
/*    */ import javax.faces.bean.ManagedBean;
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
/*    */ @ManagedBean(name = "dfLevel3View")
/*    */ public class DFLevel3View
/*    */ {
/*    */   private String val;
/*    */   
/*    */   public String getVal() {
/* 28 */     return this.val;
/*    */   }
/*    */   
/*    */   public void setVal(String val) {
/* 32 */     this.val = val;
/*    */   }
/*    */ 
/*    */   
/*    */   public void closeDialog() {
/* 37 */     PrimeFaces.current().dialog().closeDynamic(this.val);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\df\DFLevel3View.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */