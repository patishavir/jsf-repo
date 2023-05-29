/*    */ package WEB-INF.classes.org.primefaces.showcase.view.misc;
/*    */ 
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import org.primefaces.showcase.domain.Theme;
/*    */ import org.primefaces.showcase.service.ThemeService;
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
/*    */ @ManagedBean
/*    */ public class ThemeSwitcherView
/*    */ {
/*    */   private List<Theme> themes;
/*    */   @ManagedProperty("#{themeService}")
/*    */   private ThemeService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 35 */     this.themes = this.service.getThemes();
/*    */   }
/*    */   
/*    */   public List<Theme> getThemes() {
/* 39 */     return this.themes;
/*    */   }
/*    */   
/*    */   public void setService(ThemeService service) {
/* 43 */     this.service = service;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\misc\ThemeSwitcherView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */