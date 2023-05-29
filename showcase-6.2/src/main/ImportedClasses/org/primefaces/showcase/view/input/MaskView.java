/*    */ package WEB-INF.classes.org.primefaces.showcase.view.input;
/*    */ 
/*    */ import javax.faces.bean.ManagedBean;
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
/*    */ public class MaskView
/*    */ {
/*    */   private String date;
/*    */   private String phone;
/*    */   private String phoneExt;
/*    */   private String taxId;
/*    */   private String ssn;
/*    */   private String productKey;
/*    */   
/*    */   public String getDate() {
/* 31 */     return this.date;
/*    */   }
/*    */   
/*    */   public void setDate(String date) {
/* 35 */     this.date = date;
/*    */   }
/*    */   
/*    */   public String getPhone() {
/* 39 */     return this.phone;
/*    */   }
/*    */   
/*    */   public void setPhone(String phone) {
/* 43 */     this.phone = phone;
/*    */   }
/*    */   
/*    */   public String getPhoneExt() {
/* 47 */     return this.phoneExt;
/*    */   }
/*    */   
/*    */   public void setPhoneExt(String phoneExt) {
/* 51 */     this.phoneExt = phoneExt;
/*    */   }
/*    */   
/*    */   public String getTaxId() {
/* 55 */     return this.taxId;
/*    */   }
/*    */   
/*    */   public void setTaxId(String taxId) {
/* 59 */     this.taxId = taxId;
/*    */   }
/*    */   
/*    */   public String getSsn() {
/* 63 */     return this.ssn;
/*    */   }
/*    */   
/*    */   public void setSsn(String ssn) {
/* 67 */     this.ssn = ssn;
/*    */   }
/*    */   
/*    */   public String getProductKey() {
/* 71 */     return this.productKey;
/*    */   }
/*    */   
/*    */   public void setProductKey(String productKey) {
/* 75 */     this.productKey = productKey;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\MaskView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */