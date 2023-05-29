/*     */ package WEB-INF.classes.org.primefaces.showcase.view.input;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.model.SelectItem;
/*     */ import javax.faces.model.SelectItemGroup;
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
/*     */ public class CheckboxView
/*     */ {
/*     */   private String[] selectedConsoles;
/*     */   private String[] selectedConsoles2;
/*     */   private String[] selectedCities;
/*     */   private String[] selectedCities2;
/*     */   private List<String> cities;
/*     */   private List<SelectItem> cars;
/*     */   private String[] selectedCars;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  38 */     this.cities = new ArrayList<String>();
/*  39 */     this.cities.add("Miami");
/*  40 */     this.cities.add("London");
/*  41 */     this.cities.add("Paris");
/*  42 */     this.cities.add("Istanbul");
/*  43 */     this.cities.add("Berlin");
/*  44 */     this.cities.add("Barcelona");
/*  45 */     this.cities.add("Rome");
/*  46 */     this.cities.add("Brasilia");
/*  47 */     this.cities.add("Amsterdam");
/*     */     
/*  49 */     this.cars = new ArrayList<SelectItem>();
/*  50 */     SelectItemGroup germanCars = new SelectItemGroup("German Cars");
/*  51 */     germanCars.setSelectItems(new SelectItem[] { new SelectItem("BMW", "BMW"), new SelectItem("Mercedes", "Mercedes"), new SelectItem("Volkswagen", "Volkswagen") });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     SelectItemGroup americanCars = new SelectItemGroup("American Cars");
/*  58 */     americanCars.setSelectItems(new SelectItem[] { new SelectItem("Chrysler", "Chrysler"), new SelectItem("GM", "GM"), new SelectItem("Ford", "Ford") });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     this.cars.add(germanCars);
/*  65 */     this.cars.add(americanCars);
/*     */   }
/*     */   
/*     */   public String[] getSelectedConsoles() {
/*  69 */     return this.selectedConsoles;
/*     */   }
/*     */   
/*     */   public void setSelectedConsoles(String[] selectedConsoles) {
/*  73 */     this.selectedConsoles = selectedConsoles;
/*     */   }
/*     */   
/*     */   public String[] getSelectedCities() {
/*  77 */     return this.selectedCities;
/*     */   }
/*     */   
/*     */   public void setSelectedCities(String[] selectedCities) {
/*  81 */     this.selectedCities = selectedCities;
/*     */   }
/*     */   
/*     */   public String[] getSelectedCities2() {
/*  85 */     return this.selectedCities2;
/*     */   }
/*     */   
/*     */   public void setSelectedCities2(String[] selectedCities2) {
/*  89 */     this.selectedCities2 = selectedCities2;
/*     */   }
/*     */   
/*     */   public String[] getSelectedConsoles2() {
/*  93 */     return this.selectedConsoles2;
/*     */   }
/*     */   
/*     */   public void setSelectedConsoles2(String[] selectedConsoles2) {
/*  97 */     this.selectedConsoles2 = selectedConsoles2;
/*     */   }
/*     */   
/*     */   public List<String> getCities() {
/* 101 */     return this.cities;
/*     */   }
/*     */   
/*     */   public List<SelectItem> getCars() {
/* 105 */     return this.cars;
/*     */   }
/*     */   
/*     */   public void setCars(List<SelectItem> cars) {
/* 109 */     this.cars = cars;
/*     */   }
/*     */   
/*     */   public String[] getSelectedCars() {
/* 113 */     return this.selectedCars;
/*     */   }
/*     */   
/*     */   public void setSelectedCars(String[] selectedCars) {
/* 117 */     this.selectedCars = selectedCars;
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\CheckboxView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */