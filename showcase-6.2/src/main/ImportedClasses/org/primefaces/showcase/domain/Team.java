/*    */ package WEB-INF.classes.org.primefaces.showcase.domain;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.primefaces.showcase.domain.Stats;
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
/*    */ public class Team
/*    */   implements Serializable
/*    */ {
/*    */   private String name;
/*    */   private List<Stats> stats;
/*    */   
/*    */   public Team() {
/* 29 */     this.stats = new ArrayList<Stats>();
/*    */   }
/*    */   
/*    */   public Team(String name) {
/* 33 */     this.name = name;
/* 34 */     this.stats = new ArrayList<Stats>();
/*    */   }
/*    */   
/*    */   public String getName() {
/* 38 */     return this.name;
/*    */   }
/*    */   
/*    */   public void setName(String name) {
/* 42 */     this.name = name;
/*    */   }
/*    */   
/*    */   public List<Stats> getStats() {
/* 46 */     return this.stats;
/*    */   }
/*    */   
/*    */   public void setStats(List<Stats> stats) {
/* 50 */     this.stats = stats;
/*    */   }
/*    */   
/*    */   public int getAllWins() {
/* 54 */     int sum = 0;
/*    */     
/* 56 */     for (Stats s : this.stats) {
/* 57 */       sum += s.getWin();
/*    */     }
/*    */     
/* 60 */     return sum;
/*    */   }
/*    */   
/*    */   public int getAllLosses() {
/* 64 */     int sum = 0;
/*    */     
/* 66 */     for (Stats s : this.stats) {
/* 67 */       sum += s.getLoss();
/*    */     }
/*    */     
/* 70 */     return sum;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\domain\Team.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */