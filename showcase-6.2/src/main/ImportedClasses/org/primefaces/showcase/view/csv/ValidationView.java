/*    */ package WEB-INF.classes.org.primefaces.showcase.view.csv;
/*    */ 
/*    */ import java.util.Date;
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
/*    */ public class ValidationView
/*    */ {
/*    */   private String text;
/*    */   private String description;
/*    */   private Integer integer;
/*    */   private Double doubleNumber;
/*    */   private Double money;
/*    */   private String regexText;
/*    */   private Date date;
/*    */   
/*    */   public String getText() {
/* 33 */     return this.text;
/*    */   }
/*    */   public void setText(String text) {
/* 36 */     this.text = text;
/*    */   }
/*    */   
/*    */   public String getDescription() {
/* 40 */     return this.description;
/*    */   }
/*    */   public void setDescription(String description) {
/* 43 */     this.description = description;
/*    */   }
/*    */   
/*    */   public Integer getInteger() {
/* 47 */     return this.integer;
/*    */   }
/*    */   public void setInteger(Integer integer) {
/* 50 */     this.integer = integer;
/*    */   }
/*    */   
/*    */   public Double getDoubleNumber() {
/* 54 */     return this.doubleNumber;
/*    */   }
/*    */   public void setDoubleNumber(Double doubleNumber) {
/* 57 */     this.doubleNumber = doubleNumber;
/*    */   }
/*    */   
/*    */   public Double getMoney() {
/* 61 */     return this.money;
/*    */   }
/*    */   public void setMoney(Double money) {
/* 64 */     this.money = money;
/*    */   }
/*    */   
/*    */   public String getRegexText() {
/* 68 */     return this.regexText;
/*    */   }
/*    */   public void setRegexText(String regexText) {
/* 71 */     this.regexText = regexText;
/*    */   }
/*    */   
/*    */   public Date getDate() {
/* 75 */     return this.date;
/*    */   }
/*    */   public void setDate(Date date) {
/* 78 */     this.date = date;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\csv\ValidationView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */