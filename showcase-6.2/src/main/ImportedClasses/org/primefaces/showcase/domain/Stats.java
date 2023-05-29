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
/*    */ public class Stats
/*    */   implements Serializable
/*    */ {
/*    */   private String season;
/*    */   private int win;
/*    */   private int loss;
/*    */   
/*    */   public Stats() {}
/*    */   
/*    */   public Stats(String season, int win, int loss) {
/* 31 */     this.season = season;
/* 32 */     this.win = win;
/* 33 */     this.loss = loss;
/*    */   }
/*    */   
/*    */   public int getWin() {
/* 37 */     return this.win;
/*    */   }
/*    */   
/*    */   public void setWin(int win) {
/* 41 */     this.win = win;
/*    */   }
/*    */   
/*    */   public int getLoss() {
/* 45 */     return this.loss;
/*    */   }
/*    */   
/*    */   public void setLoss(int loss) {
/* 49 */     this.loss = loss;
/*    */   }
/*    */   
/*    */   public String getSeason() {
/* 53 */     return this.season;
/*    */   }
/*    */   
/*    */   public void setSeason(String season) {
/* 57 */     this.season = season;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\domain\Stats.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */