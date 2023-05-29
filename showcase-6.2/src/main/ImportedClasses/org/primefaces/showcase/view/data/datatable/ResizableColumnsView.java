/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.datatable;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.ColumnResizeEvent;
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
/*    */ @ManagedBean(name = "dtResizableColumnsView")
/*    */ public class ResizableColumnsView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars1;
/*    */   private List<Car> cars2;
/*    */   @ManagedProperty("#{carService}")
/*    */   private CarService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 40 */     this.cars1 = this.service.createCars(10);
/* 41 */     this.cars2 = this.service.createCars(10);
/*    */   }
/*    */   
/*    */   public void onResize(ColumnResizeEvent event) {
/* 45 */     FacesMessage msg = new FacesMessage("Column " + event.getColumn().getClientId() + " resized", "W:" + event.getWidth() + ", H:" + event.getHeight());
/* 46 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */   
/*    */   public List<Car> getCars1() {
/* 50 */     return this.cars1;
/*    */   }
/*    */   
/*    */   public List<Car> getCars2() {
/* 54 */     return this.cars2;
/*    */   }
/*    */   
/*    */   public void setService(CarService service) {
/* 58 */     this.service = service;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\datatable\ResizableColumnsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */