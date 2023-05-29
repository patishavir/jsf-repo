/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.SelectEvent;
/*    */ import org.primefaces.event.UnselectEvent;
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
/*    */ 
/*    */ 
/*    */ @ManagedBean
/*    */ public class OrderListView
/*    */ {
/*    */   @ManagedProperty("#{themeService}")
/*    */   private ThemeService service;
/*    */   private List<String> cities;
/*    */   private List<Theme> themes;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 43 */     this.cities = new ArrayList<String>();
/* 44 */     this.cities.add("San Francisco");
/* 45 */     this.cities.add("London");
/* 46 */     this.cities.add("Paris");
/* 47 */     this.cities.add("Istanbul");
/* 48 */     this.cities.add("Berlin");
/* 49 */     this.cities.add("Barcelona");
/* 50 */     this.cities.add("Rome");
/*    */ 
/*    */     
/* 53 */     this.themes = this.service.getThemes().subList(0, 6);
/*    */   }
/*    */   
/*    */   public ThemeService getService() {
/* 57 */     return this.service;
/*    */   }
/*    */   
/*    */   public void setService(ThemeService service) {
/* 61 */     this.service = service;
/*    */   }
/*    */   
/*    */   public List<String> getCities() {
/* 65 */     return this.cities;
/*    */   }
/*    */   
/*    */   public void setCities(List<String> cities) {
/* 69 */     this.cities = cities;
/*    */   }
/*    */   
/*    */   public List<Theme> getThemes() {
/* 73 */     return this.themes;
/*    */   }
/*    */   
/*    */   public void setThemes(List<Theme> themes) {
/* 77 */     this.themes = themes;
/*    */   }
/*    */   
/*    */   public void onSelect(SelectEvent event) {
/* 81 */     FacesContext context = FacesContext.getCurrentInstance();
/* 82 */     context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", event.getObject().toString()));
/*    */   }
/*    */   
/*    */   public void onUnselect(UnselectEvent event) {
/* 86 */     FacesContext context = FacesContext.getCurrentInstance();
/* 87 */     context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
/*    */   }
/*    */   
/*    */   public void onReorder() {
/* 91 */     FacesContext context = FacesContext.getCurrentInstance();
/* 92 */     context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "List Reordered", null));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\OrderListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */