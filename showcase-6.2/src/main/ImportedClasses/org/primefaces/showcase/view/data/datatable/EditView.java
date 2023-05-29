/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.datatable;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.CellEditEvent;
/*    */ import org.primefaces.event.RowEditEvent;
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
/*    */ @ManagedBean(name = "dtEditView")
/*    */ @ViewScoped
/*    */ public class EditView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars1;
/*    */   private List<Car> cars2;
/*    */   @ManagedProperty("#{carService}")
/*    */   private CarService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 43 */     this.cars1 = this.service.createCars(10);
/* 44 */     this.cars2 = this.service.createCars(10);
/*    */   }
/*    */   
/*    */   public List<Car> getCars1() {
/* 48 */     return this.cars1;
/*    */   }
/*    */   
/*    */   public List<Car> getCars2() {
/* 52 */     return this.cars2;
/*    */   }
/*    */   
/*    */   public List<String> getBrands() {
/* 56 */     return this.service.getBrands();
/*    */   }
/*    */   
/*    */   public List<String> getColors() {
/* 60 */     return this.service.getColors();
/*    */   }
/*    */   
/*    */   public void setService(CarService service) {
/* 64 */     this.service = service;
/*    */   }
/*    */   
/*    */   public void onRowEdit(RowEditEvent event) {
/* 68 */     FacesMessage msg = new FacesMessage("Car Edited", ((Car)event.getObject()).getId());
/* 69 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */   
/*    */   public void onRowCancel(RowEditEvent event) {
/* 73 */     FacesMessage msg = new FacesMessage("Edit Cancelled", ((Car)event.getObject()).getId());
/* 74 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */   
/*    */   public void onCellEdit(CellEditEvent event) {
/* 78 */     Object oldValue = event.getOldValue();
/* 79 */     Object newValue = event.getNewValue();
/*    */     
/* 81 */     if (newValue != null && !newValue.equals(oldValue)) {
/* 82 */       FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
/* 83 */       FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\datatable\EditView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */