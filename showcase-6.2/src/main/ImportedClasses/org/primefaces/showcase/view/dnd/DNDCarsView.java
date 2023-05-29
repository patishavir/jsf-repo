/*    */ package WEB-INF.classes.org.primefaces.showcase.view.dnd;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import org.primefaces.event.DragDropEvent;
/*    */ import org.primefaces.showcase.domain.Car;
/*    */ import org.primefaces.showcase.service.CarService;
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
/*    */ @ManagedBean(name = "dndCarsView")
/*    */ @ViewScoped
/*    */ public class DNDCarsView
/*    */   implements Serializable
/*    */ {
/*    */   @ManagedProperty("#{carService}")
/*    */   private CarService service;
/*    */   private List<Car> cars;
/*    */   private List<Car> droppedCars;
/*    */   private Car selectedCar;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 44 */     this.cars = this.service.createCars(9);
/* 45 */     this.droppedCars = new ArrayList<Car>();
/*    */   }
/*    */   
/*    */   public void onCarDrop(DragDropEvent ddEvent) {
/* 49 */     Car car = (Car)ddEvent.getData();
/*    */     
/* 51 */     this.droppedCars.add(car);
/* 52 */     this.cars.remove(car);
/*    */   }
/*    */   
/*    */   public void setService(CarService service) {
/* 56 */     this.service = service;
/*    */   }
/*    */   
/*    */   public List<Car> getCars() {
/* 60 */     return this.cars;
/*    */   }
/*    */   
/*    */   public List<Car> getDroppedCars() {
/* 64 */     return this.droppedCars;
/*    */   }
/*    */   
/*    */   public Car getSelectedCar() {
/* 68 */     return this.selectedCar;
/*    */   }
/*    */   
/*    */   public void setSelectedCar(Car selectedCar) {
/* 72 */     this.selectedCar = selectedCar;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\dnd\DNDCarsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */