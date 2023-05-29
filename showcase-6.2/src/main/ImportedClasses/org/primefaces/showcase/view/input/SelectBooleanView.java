/*    */ package WEB-INF.classes.org.primefaces.showcase.view.input;
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
/*    */ public class SelectBooleanView
/*    */ {
/*    */   private boolean value1;
/*    */   private boolean value2;
/*    */   
/*    */   public boolean isValue1() {
/* 29 */     return this.value1;
/*    */   }
/*    */   
/*    */   public void setValue1(boolean value1) {
/* 33 */     this.value1 = value1;
/*    */   }
/*    */   
/*    */   public boolean isValue2() {
/* 37 */     return this.value2;
/*    */   }
/*    */   
/*    */   public void setValue2(boolean value2) {
/* 41 */     this.value2 = value2;
/*    */   }
/*    */   
/*    */   public void addMessage() {
/* 45 */     String summary = this.value2 ? "Checked" : "Unchecked";
/* 46 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\SelectBooleanView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */