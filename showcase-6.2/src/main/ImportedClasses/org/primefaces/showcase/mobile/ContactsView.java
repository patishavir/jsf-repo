/*    */ package WEB-INF.classes.org.primefaces.showcase.mobile;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import org.primefaces.showcase.domain.Contact;
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
/*    */ @ViewScoped
/*    */ public class ContactsView
/*    */   implements Serializable
/*    */ {
/*    */   private Contact contact;
/*    */   private List<Contact> contacts;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 36 */     this.contact = new Contact();
/* 37 */     this.contacts = new ArrayList<Contact>();
/*    */   }
/*    */   
/*    */   public Contact getContact() {
/* 41 */     return this.contact;
/*    */   }
/*    */   public void setContact(Contact contact) {
/* 44 */     this.contact = contact;
/*    */   }
/*    */   
/*    */   public List<Contact> getContacts() {
/* 48 */     return this.contacts;
/*    */   }
/*    */   
/*    */   public String saveContact() {
/* 52 */     if (!this.contacts.contains(this.contact)) {
/* 53 */       this.contacts.add(this.contact);
/*    */     }
/*    */     
/* 56 */     return "pm:list?transition=flip";
/*    */   }
/*    */   
/*    */   public void deleteContact() {
/* 60 */     if (this.contacts.contains(this.contact)) {
/* 61 */       this.contacts.remove(this.contact);
/*    */     }
/*    */   }
/*    */   
/*    */   public String prepareNewContact() {
/* 66 */     this.contact = new Contact();
/*    */     
/* 68 */     return "pm:edit?transition=flip";
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\mobile\ContactsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */