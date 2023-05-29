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
/*    */ @ManagedBean(name = "dtBasicView")
/*    */ @ViewScoped
/*    */ public class BasicView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars;
/*    */   @ManagedProperty("#{carService}")
/*    */   private CarService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 38 */     this.cars = this.service.createCars(10);
/*    */   }
/*    */   
/*    */   public List<Car> getCars() {
/* 42 */     return this.cars;
/*    */   }
/*    */   
/*    */   public void setService(CarService service) {
/* 46 */     this.service = service;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\datatable\BasicView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */