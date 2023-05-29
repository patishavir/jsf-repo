/*    */ package WEB-INF.classes.org.primefaces.showcase.mobile;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.mobile.event.SwipeEvent;
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
/*    */ @ManagedBean(name = "dtMobileView")
/*    */ @ViewScoped
/*    */ public class DatatableView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars1;
/*    */   private List<Car> cars2;
/*    */   private List<Car> cars3;
/*    */   private List<Car> selectedCars;
/*    */   @ManagedProperty("#{carService}")
/*    */   private CarService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 45 */     this.cars1 = this.service.createCars(10);
/* 46 */     this.cars2 = this.service.createCars(10);
/* 47 */     this.cars3 = this.service.createCars(50);
/*    */   }
/*    */   
/*    */   public List<Car> getCars1() {
/* 51 */     return this.cars1;
/*    */   }
/*    */   
/*    */   public List<Car> getCars2() {
/* 55 */     return this.cars2;
/*    */   }
/*    */   
/*    */   public List<Car> getCars3() {
/* 59 */     return this.cars3;
/*    */   }
/*    */   
/*    */   public void setService(CarService service) {
/* 63 */     this.service = service;
/*    */   }
/*    */   
/*    */   public List<Car> getSelectedCars() {
/* 67 */     return this.selectedCars;
/*    */   }
/*    */   
/*    */   public void setSelectedCars(List<Car> selectedCars) {
/* 71 */     this.selectedCars = selectedCars;
/*    */   }
/*    */   
/*    */   public void onRowSwipeRight(SwipeEvent event) {
/* 75 */     Car car = (Car)event.getData();
/* 76 */     this.cars3.remove(car);
/*    */     
/* 78 */     if (this.selectedCars != null && !this.selectedCars.isEmpty()) {
/* 79 */       this.selectedCars.remove(car);
/*    */     }
/*    */   }
/*    */   
/*    */   public void onRowSwipeLeft(SwipeEvent event) {
/* 84 */     FacesMessage msg = new FacesMessage("Swiped Left", ((Car)event.getData()).getId());
/* 85 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\mobile\DatatableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */