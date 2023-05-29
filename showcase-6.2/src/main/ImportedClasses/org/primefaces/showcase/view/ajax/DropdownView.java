/*     */ package WEB-INF.classes.org.primefaces.showcase.view.ajax;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
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
/*     */ @ViewScoped
/*     */ public class DropdownView
/*     */   implements Serializable
/*     */ {
/*  31 */   private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
/*     */   private String country;
/*     */   private String city;
/*     */   private Map<String, String> countries;
/*     */   private Map<String, String> cities;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  39 */     this.countries = new HashMap<String, String>();
/*  40 */     this.countries.put("USA", "USA");
/*  41 */     this.countries.put("Germany", "Germany");
/*  42 */     this.countries.put("Brazil", "Brazil");
/*     */     
/*  44 */     Map<String, String> map = new HashMap<String, String>();
/*  45 */     map.put("New York", "New York");
/*  46 */     map.put("San Francisco", "San Francisco");
/*  47 */     map.put("Denver", "Denver");
/*  48 */     this.data.put("USA", map);
/*     */     
/*  50 */     map = new HashMap<String, String>();
/*  51 */     map.put("Berlin", "Berlin");
/*  52 */     map.put("Munich", "Munich");
/*  53 */     map.put("Frankfurt", "Frankfurt");
/*  54 */     this.data.put("Germany", map);
/*     */     
/*  56 */     map = new HashMap<String, String>();
/*  57 */     map.put("Sao Paolo", "Sao Paolo");
/*  58 */     map.put("Rio de Janerio", "Rio de Janerio");
/*  59 */     map.put("Salvador", "Salvador");
/*  60 */     this.data.put("Brazil", map);
/*     */   }
/*     */   
/*     */   public Map<String, Map<String, String>> getData() {
/*  64 */     return this.data;
/*     */   }
/*     */   
/*     */   public String getCountry() {
/*  68 */     return this.country;
/*     */   }
/*     */   
/*     */   public void setCountry(String country) {
/*  72 */     this.country = country;
/*     */   }
/*     */   
/*     */   public String getCity() {
/*  76 */     return this.city;
/*     */   }
/*     */   
/*     */   public void setCity(String city) {
/*  80 */     this.city = city;
/*     */   }
/*     */   
/*     */   public Map<String, String> getCountries() {
/*  84 */     return this.countries;
/*     */   }
/*     */   
/*     */   public Map<String, String> getCities() {
/*  88 */     return this.cities;
/*     */   }
/*     */   
/*     */   public void onCountryChange() {
/*  92 */     if (this.country != null && !this.country.equals("")) {
/*  93 */       this.cities = this.data.get(this.country);
/*     */     } else {
/*  95 */       this.cities = new HashMap<String, String>();
/*     */     } 
/*     */   }
/*     */   public void displayLocation() {
/*     */     FacesMessage msg;
/* 100 */     if (this.city != null && this.country != null) {
/* 101 */       msg = new FacesMessage("Selected", this.city + " of " + this.country);
/*     */     } else {
/* 103 */       msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "City is not selected.");
/*     */     } 
/* 105 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\ajax\DropdownView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */