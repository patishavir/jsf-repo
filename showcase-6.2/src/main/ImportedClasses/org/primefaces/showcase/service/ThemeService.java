/*    */ package WEB-INF.classes.org.primefaces.showcase.service;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ApplicationScoped;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import org.primefaces.showcase.domain.Theme;
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
/*    */ @ManagedBean(name = "themeService", eager = true)
/*    */ @ApplicationScoped
/*    */ public class ThemeService
/*    */ {
/*    */   private List<Theme> themes;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 35 */     this.themes = new ArrayList<Theme>();
/* 36 */     this.themes.add(new Theme(0, "Afterdark", "afterdark"));
/* 37 */     this.themes.add(new Theme(1, "Afternoon", "afternoon"));
/* 38 */     this.themes.add(new Theme(2, "Afterwork", "afterwork"));
/* 39 */     this.themes.add(new Theme(3, "Aristo", "aristo"));
/* 40 */     this.themes.add(new Theme(4, "Black-Tie", "black-tie"));
/* 41 */     this.themes.add(new Theme(5, "Blitzer", "blitzer"));
/* 42 */     this.themes.add(new Theme(6, "Bluesky", "bluesky"));
/* 43 */     this.themes.add(new Theme(7, "Bootstrap", "bootstrap"));
/* 44 */     this.themes.add(new Theme(8, "Casablanca", "casablanca"));
/* 45 */     this.themes.add(new Theme(9, "Cupertino", "cupertino"));
/* 46 */     this.themes.add(new Theme(10, "Cruze", "cruze"));
/* 47 */     this.themes.add(new Theme(11, "Dark-Hive", "dark-hive"));
/* 48 */     this.themes.add(new Theme(12, "Delta", "delta"));
/* 49 */     this.themes.add(new Theme(13, "Dot-Luv", "dot-luv"));
/* 50 */     this.themes.add(new Theme(14, "Eggplant", "eggplant"));
/* 51 */     this.themes.add(new Theme(15, "Excite-Bike", "excite-bike"));
/* 52 */     this.themes.add(new Theme(16, "Flick", "flick"));
/* 53 */     this.themes.add(new Theme(17, "Glass-X", "glass-x"));
/* 54 */     this.themes.add(new Theme(18, "Home", "home"));
/* 55 */     this.themes.add(new Theme(19, "Hot-Sneaks", "hot-sneaks"));
/* 56 */     this.themes.add(new Theme(20, "Humanity", "humanity"));
/* 57 */     this.themes.add(new Theme(21, "Le-Frog", "le-frog"));
/* 58 */     this.themes.add(new Theme(22, "Midnight", "midnight"));
/* 59 */     this.themes.add(new Theme(23, "Mint-Choc", "mint-choc"));
/* 60 */     this.themes.add(new Theme(24, "Omega", "omega"));
/* 61 */     this.themes.add(new Theme(25, "Overcast", "overcast"));
/* 62 */     this.themes.add(new Theme(26, "Pepper-Grinder", "pepper-grinder"));
/* 63 */     this.themes.add(new Theme(27, "Redmond", "redmond"));
/* 64 */     this.themes.add(new Theme(28, "Rocket", "rocket"));
/* 65 */     this.themes.add(new Theme(29, "Sam", "sam"));
/* 66 */     this.themes.add(new Theme(30, "Smoothness", "smoothness"));
/* 67 */     this.themes.add(new Theme(31, "South-Street", "south-street"));
/* 68 */     this.themes.add(new Theme(32, "Start", "start"));
/* 69 */     this.themes.add(new Theme(33, "Sunny", "sunny"));
/* 70 */     this.themes.add(new Theme(34, "Swanky-Purse", "swanky-purse"));
/* 71 */     this.themes.add(new Theme(35, "Trontastic", "trontastic"));
/* 72 */     this.themes.add(new Theme(36, "UI-Darkness", "ui-darkness"));
/* 73 */     this.themes.add(new Theme(37, "UI-Lightness", "ui-lightness"));
/* 74 */     this.themes.add(new Theme(38, "Vader", "vader"));
/*    */   }
/*    */   
/*    */   public List<Theme> getThemes() {
/* 78 */     return this.themes;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\service\ThemeService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */