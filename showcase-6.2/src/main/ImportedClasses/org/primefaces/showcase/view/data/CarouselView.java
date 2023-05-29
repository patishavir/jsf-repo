/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data;
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
/*    */ @ManagedBean
/*    */ @ViewScoped
/*    */ public class CarouselView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars;
/*    */   private Car selectedCar;
/*    */   @ManagedProperty("#{carService}")
/*    */   private CarService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 40 */     this.cars = this.service.createCars(9);
/*    */   }
/*    */   
/*    */   public List<Car> getCars() {
/* 44 */     return this.cars;
/*    */   }
/*    */   
/*    */   public void setService(CarService service) {
/* 48 */     this.service = service;
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


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\CarouselView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */