/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.datatable;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
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
/*    */ @ManagedBean(name = "dtFilterView")
/*    */ @ViewScoped
/*    */ public class FilterView
/*    */   implements Serializable
/*    */ {
/*    */   private List<Car> cars;
/*    */   private List<Car> filteredCars;
/*    */   @ManagedProperty("#{carService}")
/*    */   private CarService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 41 */     this.cars = this.service.createCars(10);
/*    */   }
/*    */   
/*    */   public boolean filterByPrice(Object value, Object filter, Locale locale) {
/* 45 */     String filterText = (filter == null) ? null : filter.toString().trim();
/* 46 */     if (filterText == null || filterText.equals("")) {
/* 47 */       return true;
/*    */     }
/*    */     
/* 50 */     if (value == null) {
/* 51 */       return false;
/*    */     }
/*    */     
/* 54 */     return (((Comparable<Integer>)value).compareTo(Integer.valueOf(filterText)) > 0);
/*    */   }
/*    */   
/*    */   public List<String> getBrands() {
/* 58 */     return this.service.getBrands();
/*    */   }
/*    */   
/*    */   public List<String> getColors() {
/* 62 */     return this.service.getColors();
/*    */   }
/*    */   
/*    */   public List<Car> getCars() {
/* 66 */     return this.cars;
/*    */   }
/*    */   
/*    */   public List<Car> getFilteredCars() {
/* 70 */     return this.filteredCars;
/*    */   }
/*    */   
/*    */   public void setFilteredCars(List<Car> filteredCars) {
/* 74 */     this.filteredCars = filteredCars;
/*    */   }
/*    */   
/*    */   public void setService(CarService service) {
/* 78 */     this.service = service;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\datatable\FilterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */