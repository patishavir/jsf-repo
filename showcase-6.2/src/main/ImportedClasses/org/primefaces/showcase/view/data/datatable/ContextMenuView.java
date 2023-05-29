/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.datatable;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
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
/*    */ @ManagedBean(name = "dtContextMenuView")
/*    */ @ViewScoped
/*    */ public class ContextMenuView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars;
/*    */   private Car selectedCar;
/*    */   @ManagedProperty("#{carService}")
/*    */   private CarService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 40 */     this.cars = this.service.createCars(10);
/*    */   }
/*    */   
/*    */   public List<Car> getCars() {
/* 44 */     return this.cars;
/*    */   }
/*    */   
/*    */   public Car getSelectedCar() {
/* 48 */     return this.selectedCar;
/*    */   }
/*    */   
/*    */   public void setSelectedCar(Car selectedCar) {
/* 52 */     this.selectedCar = selectedCar;
/*    */   }
/*    */   
/*    */   public void setService(CarService service) {
/* 56 */     this.service = service;
/*    */   }
/*    */   
/*    */   public void deleteCar() {
/* 60 */     this.cars.remove(this.selectedCar);
/* 61 */     this.selectedCar = null;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\datatable\ContextMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */