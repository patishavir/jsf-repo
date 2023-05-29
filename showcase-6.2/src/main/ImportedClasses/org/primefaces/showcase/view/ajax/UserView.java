/*    */ package WEB-INF.classes.org.primefaces.showcase.view.ajax;
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
/*    */ public class UserView
/*    */ {
/*    */   private String firstname;
/*    */   private String lastname;
/*    */   
/*    */   public String getFirstname() {
/* 29 */     return this.firstname;
/*    */   }
/*    */   
/*    */   public void setFirstname(String firstname) {
/* 33 */     this.firstname = firstname;
/*    */   }
/*    */   
/*    */   public String getLastname() {
/* 37 */     return this.lastname;
/*    */   }
/*    */   
/*    */   public void setLastname(String lastname) {
/* 41 */     this.lastname = lastname;
/*    */   }
/*    */   
/*    */   public void save() {
/* 45 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + this.firstname + " " + this.lastname));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\ajax\UserView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */