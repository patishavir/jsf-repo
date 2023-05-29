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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Sale
/*    */   implements Serializable
/*    */ {
/*    */   private String manufacturer;
/*    */   private int lastYearSale;
/*    */   private int thisYearSale;
/*    */   private int lastYearProfit;
/*    */   private int thisYearProfit;
/*    */   
/*    */   public Sale() {}
/*    */   
/*    */   public Sale(String manufacturer, int lastYearSale, int thisYearSale, int lastYearProfit, int thisYearProfit) {
/* 35 */     this.manufacturer = manufacturer;
/* 36 */     this.lastYearSale = lastYearSale;
/* 37 */     this.thisYearSale = thisYearSale;
/* 38 */     this.lastYearProfit = lastYearProfit;
/* 39 */     this.thisYearProfit = thisYearProfit;
/*    */   }
/*    */   
/*    */   public int getLastYearProfit() {
/* 43 */     return this.lastYearProfit;
/*    */   }
/*    */   
/*    */   public void setLastYearProfit(int lastYearProfit) {
/* 47 */     this.lastYearProfit = lastYearProfit;
/*    */   }
/*    */   
/*    */   public int getLastYearSale() {
/* 51 */     return this.lastYearSale;
/*    */   }
/*    */   
/*    */   public void setLastYearSale(int lastYearSale) {
/* 55 */     this.lastYearSale = lastYearSale;
/*    */   }
/*    */   
/*    */   public String getManufacturer() {
/* 59 */     return this.manufacturer;
/*    */   }
/*    */   
/*    */   public void setManufacturer(String manufacturer) {
/* 63 */     this.manufacturer = manufacturer;
/*    */   }
/*    */   
/*    */   public int getThisYearProfit() {
/* 67 */     return this.thisYearProfit;
/*    */   }
/*    */   
/*    */   public void setThisYearProfit(int thisYearProfit) {
/* 71 */     this.thisYearProfit = thisYearProfit;
/*    */   }
/*    */   
/*    */   public int getThisYearSale() {
/* 75 */     return this.thisYearSale;
/*    */   }
/*    */   
/*    */   public void setThisYearSale(int thisYearSale) {
/* 79 */     this.thisYearSale = thisYearSale;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\domain\Sale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */