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
/*    */ public class FocusView
/*    */ {
/*    */   private String username;
/*    */   private String email;
/*    */   
/*    */   public String getUsername() {
/* 29 */     return this.username;
/*    */   }
/*    */   
/*    */   public void setUsername(String username) {
/* 33 */     this.username = username;
/*    */   }
/*    */   
/*    */   public String getEmail() {
/* 37 */     return this.email;
/*    */   }
/*    */   
/*    */   public void setEmail(String email) {
/* 41 */     this.email = email;
/*    */   }
/*    */   
/*    */   public void save() {
/* 45 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "User Saved"));
/* 46 */     this.username = null;
/* 47 */     this.email = null;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\misc\FocusView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */