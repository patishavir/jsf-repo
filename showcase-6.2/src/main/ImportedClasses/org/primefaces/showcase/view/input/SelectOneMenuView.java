/*     */ package WEB-INF.classes.org.primefaces.showcase.view.input;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ManagedProperty;
/*     */ import javax.faces.model.SelectItem;
/*     */ import javax.faces.model.SelectItemGroup;
/*     */ import org.primefaces.showcase.domain.Theme;
/*     */ import org.primefaces.showcase.service.ThemeService;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ManagedBean
/*     */ public class SelectOneMenuView
/*     */ {
/*     */   private String console;
/*     */   private String car;
/*     */   private List<SelectItem> cars;
/*     */   private String city;
/*  40 */   private Map<String, String> cities = new HashMap<String, String>();
/*     */   
/*     */   private Theme theme;
/*     */   
/*     */   private List<Theme> themes;
/*     */   
/*     */   private String option;
/*     */   
/*     */   private List<String> options;
/*     */   @ManagedProperty("#{themeService}")
/*     */   private ThemeService service;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  54 */     SelectItemGroup g1 = new SelectItemGroup("German Cars");
/*  55 */     g1.setSelectItems(new SelectItem[] { new SelectItem("BMW", "BMW"), new SelectItem("Mercedes", "Mercedes"), new SelectItem("Volkswagen", "Volkswagen") });
/*     */     
/*  57 */     SelectItemGroup g2 = new SelectItemGroup("American Cars");
/*  58 */     g2.setSelectItems(new SelectItem[] { new SelectItem("Chrysler", "Chrysler"), new SelectItem("GM", "GM"), new SelectItem("Ford", "Ford") });
/*     */     
/*  60 */     this.cars = new ArrayList<SelectItem>();
/*  61 */     this.cars.add(g1);
/*  62 */     this.cars.add(g2);
/*     */ 
/*     */     
/*  65 */     this.cities = new HashMap<String, String>();
/*  66 */     this.cities.put("New York", "New York");
/*  67 */     this.cities.put("London", "London");
/*  68 */     this.cities.put("Paris", "Paris");
/*  69 */     this.cities.put("Barcelona", "Barcelona");
/*  70 */     this.cities.put("Istanbul", "Istanbul");
/*  71 */     this.cities.put("Berlin", "Berlin");
/*     */ 
/*     */     
/*  74 */     this.themes = this.service.getThemes();
/*     */ 
/*     */     
/*  77 */     this.options = new ArrayList<String>();
/*  78 */     for (int i = 0; i < 20; i++) {
/*  79 */       this.options.add("Option " + i);
/*     */     }
/*     */   }
/*     */   
/*     */   public String getConsole() {
/*  84 */     return this.console;
/*     */   }
/*     */   
/*     */   public void setConsole(String console) {
/*  88 */     this.console = console;
/*     */   }
/*     */   
/*     */   public String getCar() {
/*  92 */     return this.car;
/*     */   }
/*     */   
/*     */   public void setCar(String car) {
/*  96 */     this.car = car;
/*     */   }
/*     */   
/*     */   public String getCity() {
/* 100 */     return this.city;
/*     */   }
/*     */   
/*     */   public void setCity(String city) {
/* 104 */     this.city = city;
/*     */   }
/*     */   
/*     */   public Theme getTheme() {
/* 108 */     return this.theme;
/*     */   }
/*     */   
/*     */   public void setTheme(Theme theme) {
/* 112 */     this.theme = theme;
/*     */   }
/*     */   
/*     */   public List<SelectItem> getCars() {
/* 116 */     return this.cars;
/*     */   }
/*     */   
/*     */   public Map<String, String> getCities() {
/* 120 */     return this.cities;
/*     */   }
/*     */   
/*     */   public List<Theme> getThemes() {
/* 124 */     return this.themes;
/*     */   }
/*     */   
/*     */   public void setService(ThemeService service) {
/* 128 */     this.service = service;
/*     */   }
/*     */   
/*     */   public String getOption() {
/* 132 */     return this.option;
/*     */   }
/*     */   
/*     */   public void setOption(String option) {
/* 136 */     this.option = option;
/*     */   }
/*     */   
/*     */   public List<String> getOptions() {
/* 140 */     return this.options;
/*     */   }
/*     */   
/*     */   public void setOptions(List<String> options) {
/* 144 */     this.options = options;
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\SelectOneMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */