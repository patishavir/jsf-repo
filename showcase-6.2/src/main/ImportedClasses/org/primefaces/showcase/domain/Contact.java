/*    */ package WEB-INF.classes.org.primefaces.showcase.domain;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class Contact
/*    */   implements Serializable
/*    */ {
/*    */   private String firstname;
/*    */   private String surname;
/*    */   private String phone;
/*    */   private String address;
/*    */   private String email;
/*    */   private Integer age;
/*    */   private String gender;
/*    */   
/*    */   public String getFirstname() {
/* 31 */     return this.firstname;
/*    */   }
/*    */   
/*    */   public void setFirstname(String firstname) {
/* 35 */     this.firstname = firstname;
/*    */   }
/*    */   
/*    */   public String getSurname() {
/* 39 */     return this.surname;
/*    */   }
/*    */   
/*    */   public void setSurname(String surname) {
/* 43 */     this.surname = surname;
/*    */   }
/*    */   
/*    */   public String getGender() {
/* 47 */     return this.gender;
/*    */   }
/*    */   
/*    */   public void setGender(String gender) {
/* 51 */     this.gender = gender;
/*    */   }
/*    */   
/*    */   public Integer getAge() {
/* 55 */     return this.age;
/*    */   }
/*    */   
/*    */   public void setAge(Integer age) {
/* 59 */     this.age = age;
/*    */   }
/*    */   
/*    */   public String getEmail() {
/* 63 */     return this.email;
/*    */   }
/*    */   
/*    */   public void setEmail(String email) {
/* 67 */     this.email = email;
/*    */   }
/*    */   
/*    */   public String getPhone() {
/* 71 */     return this.phone;
/*    */   }
/*    */   
/*    */   public void setPhone(String phone) {
/* 75 */     this.phone = phone;
/*    */   }
/*    */   
/*    */   public String getAddress() {
/* 79 */     return this.address;
/*    */   }
/*    */   
/*    */   public void setAddress(String address) {
/* 83 */     this.address = address;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\domain\Contact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */