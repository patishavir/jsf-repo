/*    */ package WEB-INF.classes.org.primefaces.showcase.view.df;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import org.primefaces.PrimeFaces;
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
/*    */ @ManagedBean(name = "dfCarsView")
/*    */ @ViewScoped
/*    */ public class DFCarsView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars;
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
/*    */   public void selectCarFromDialog(Car car) {
/* 52 */     PrimeFaces.current().dialog().closeDynamic(car);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\df\DFCarsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */