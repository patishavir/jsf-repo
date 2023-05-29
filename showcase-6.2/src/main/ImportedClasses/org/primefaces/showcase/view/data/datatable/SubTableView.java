/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.datatable;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import org.primefaces.showcase.domain.Stats;
/*    */ import org.primefaces.showcase.domain.Team;
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
/*    */ @ManagedBean(name = "dtSubTableView")
/*    */ public class SubTableView
/*    */ {
/*    */   private List<Team> teams;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 32 */     this.teams = new ArrayList<Team>();
/* 33 */     Team lakers = new Team("Los Angeles Lakers");
/* 34 */     lakers.getStats().add(new Stats("2005-2006", 50, 32));
/* 35 */     lakers.getStats().add(new Stats("2006-2007", 44, 38));
/* 36 */     lakers.getStats().add(new Stats("2007-2008", 40, 42));
/* 37 */     lakers.getStats().add(new Stats("2008-2009", 45, 37));
/* 38 */     lakers.getStats().add(new Stats("2009-2010", 48, 34));
/* 39 */     lakers.getStats().add(new Stats("2010-2011", 42, 42));
/* 40 */     this.teams.add(lakers);
/*    */     
/* 42 */     Team celtics = new Team("Boston Celtics");
/* 43 */     celtics.getStats().add(new Stats("2005-2006", 46, 36));
/* 44 */     celtics.getStats().add(new Stats("2006-2007", 50, 32));
/* 45 */     celtics.getStats().add(new Stats("2007-2008", 41, 41));
/* 46 */     celtics.getStats().add(new Stats("2008-2009", 45, 37));
/* 47 */     celtics.getStats().add(new Stats("2009-2010", 38, 44));
/* 48 */     celtics.getStats().add(new Stats("2010-2011", 35, 47));
/* 49 */     this.teams.add(celtics);
/*    */   }
/*    */   
/*    */   public List<Team> getTeams() {
/* 53 */     return this.teams;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\datatable\SubTableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */