/*    */ package WEB-INF.classes.org.primefaces.showcase.service;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ import javax.faces.bean.ApplicationScoped;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import org.primefaces.showcase.domain.Car;
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
/*    */ 
/*    */ 
/*    */ @ManagedBean(name = "carService")
/*    */ @ApplicationScoped
/*    */ public class CarService
/*    */ {
/* 35 */   private static final String[] colors = new String[10]; static {
/* 36 */     colors[0] = "Black";
/* 37 */     colors[1] = "White";
/* 38 */     colors[2] = "Green";
/* 39 */     colors[3] = "Red";
/* 40 */     colors[4] = "Blue";
/* 41 */     colors[5] = "Orange";
/* 42 */     colors[6] = "Silver";
/* 43 */     colors[7] = "Yellow";
/* 44 */     colors[8] = "Brown";
/* 45 */     colors[9] = "Maroon";
/*    */   }
/* 47 */   private static final String[] brands = new String[10]; static {
/* 48 */     brands[0] = "BMW";
/* 49 */     brands[1] = "Mercedes";
/* 50 */     brands[2] = "Volvo";
/* 51 */     brands[3] = "Audi";
/* 52 */     brands[4] = "Renault";
/* 53 */     brands[5] = "Fiat";
/* 54 */     brands[6] = "Volkswagen";
/* 55 */     brands[7] = "Honda";
/* 56 */     brands[8] = "Jaguar";
/* 57 */     brands[9] = "Ford";
/*    */   }
/*    */   
/*    */   public List<Car> createCars(int size) {
/* 61 */     List<Car> list = new ArrayList<Car>();
/* 62 */     for (int i = 0; i < size; i++) {
/* 63 */       list.add(new Car(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
/*    */     }
/*    */     
/* 66 */     return list;
/*    */   }
/*    */   
/*    */   private String getRandomId() {
/* 70 */     return UUID.randomUUID().toString().substring(0, 8);
/*    */   }
/*    */   
/*    */   private int getRandomYear() {
/* 74 */     return (int)(Math.random() * 50.0D + 1960.0D);
/*    */   }
/*    */   
/*    */   private String getRandomColor() {
/* 78 */     return colors[(int)(Math.random() * 10.0D)];
/*    */   }
/*    */   
/*    */   private String getRandomBrand() {
/* 82 */     return brands[(int)(Math.random() * 10.0D)];
/*    */   }
/*    */   
/*    */   private int getRandomPrice() {
/* 86 */     return (int)(Math.random() * 100000.0D);
/*    */   }
/*    */   
/*    */   private boolean getRandomSoldState() {
/* 90 */     return (Math.random() > 0.5D);
/*    */   }
/*    */   
/*    */   public List<String> getColors() {
/* 94 */     return Arrays.asList(colors);
/*    */   }
/*    */   
/*    */   public List<String> getBrands() {
/* 98 */     return Arrays.asList(brands);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\service\CarService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */