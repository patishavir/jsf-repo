/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
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
/*    */ @ManagedBean
/*    */ public class RingView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars;
/*    */   private Car selectedCar;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 34 */     this.cars = new ArrayList<Car>();
/*    */     
/* 36 */     this.cars.add(new Car("1", "Ford", 2000, "Black"));
/* 37 */     this.cars.add(new Car("2", "Audi", 2003, "Orange"));
/* 38 */     this.cars.add(new Car("4", "BMW", 2012, "Red"));
/* 39 */     this.cars.add(new Car("5", "Fiat", 2001, "Yellow"));
/* 40 */     this.cars.add(new Car("6", "Mercedes", 2014, "Blue"));
/*    */   }
/*    */   
/*    */   public List<Car> getCars() {
/* 44 */     return this.cars;
/*    */   }
/*    */   
/*    */   public void setCars(List<Car> cars) {
/* 48 */     this.cars = cars;
/*    */   }
/*    */   
/*    */   public Car getSelectedCar() {
/* 52 */     return this.selectedCar;
/*    */   }
/*    */   
/*    */   public void setSelectedCar(Car selectedCar) {
/* 56 */     this.selectedCar = selectedCar;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\RingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */