/*    */ package WEB-INF.classes.org.primefaces.showcase.view.overlay;
/*    */ 
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import javax.faces.event.ActionEvent;
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
/*    */ 
/*    */ 
/*    */ @ManagedBean
/*    */ public class UserLoginView
/*    */ {
/*    */   private String username;
/*    */   private String password;
/*    */   
/*    */   public String getUsername() {
/* 34 */     return this.username;
/*    */   }
/*    */   
/*    */   public void setUsername(String username) {
/* 38 */     this.username = username;
/*    */   }
/*    */   
/*    */   public String getPassword() {
/* 42 */     return this.password;
/*    */   }
/*    */   
/*    */   public void setPassword(String password) {
/* 46 */     this.password = password;
/*    */   }
/*    */   
/*    */   public void login(ActionEvent event) {
/* 50 */     FacesMessage message = null;
/* 51 */     boolean loggedIn = false;
/*    */     
/* 53 */     if (this.username != null && this.username.equals("admin") && this.password != null && this.password.equals("admin")) {
/* 54 */       loggedIn = true;
/* 55 */       message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", this.username);
/*    */     } else {
/* 57 */       loggedIn = false;
/* 58 */       message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
/*    */     } 
/*    */     
/* 61 */     FacesContext.getCurrentInstance().addMessage(null, message);
/* 62 */     PrimeFaces.current().ajax().addCallbackParam("loggedIn", Boolean.valueOf(loggedIn));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\overlay\UserLoginView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */