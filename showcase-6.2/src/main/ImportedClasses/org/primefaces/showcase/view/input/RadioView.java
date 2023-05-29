/*    */ package WEB-INF.classes.org.primefaces.showcase.view.input;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
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
/*    */ public class RadioView
/*    */ {
/*    */   private String console;
/*    */   private String city;
/*    */   private String city2;
/*    */   private List<String> cities;
/*    */   private String color;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 34 */     this.cities = new ArrayList<String>();
/* 35 */     this.cities.add("Miami");
/* 36 */     this.cities.add("London");
/* 37 */     this.cities.add("Paris");
/* 38 */     this.cities.add("Istanbul");
/* 39 */     this.cities.add("Berlin");
/* 40 */     this.cities.add("Barcelona");
/* 41 */     this.cities.add("Rome");
/* 42 */     this.cities.add("Brasilia");
/* 43 */     this.cities.add("Amsterdam");
/*    */   }
/*    */   
/*    */   public String getConsole() {
/* 47 */     return this.console;
/*    */   }
/*    */   
/*    */   public void setConsole(String console) {
/* 51 */     this.console = console;
/*    */   }
/*    */   
/*    */   public String getCity() {
/* 55 */     return this.city;
/*    */   }
/*    */   
/*    */   public void setCity(String city) {
/* 59 */     this.city = city;
/*    */   }
/*    */   
/*    */   public String getCity2() {
/* 63 */     return this.city2;
/*    */   }
/*    */   
/*    */   public void setCity2(String city2) {
/* 67 */     this.city2 = city2;
/*    */   }
/*    */   
/*    */   public String getColor() {
/* 71 */     return this.color;
/*    */   }
/*    */   
/*    */   public void setColor(String color) {
/* 75 */     this.color = color;
/*    */   }
/*    */   
/*    */   public List<String> getCities() {
/* 79 */     return this.cities;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\RadioView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */