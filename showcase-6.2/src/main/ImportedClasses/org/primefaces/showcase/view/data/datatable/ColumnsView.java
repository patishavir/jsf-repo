/*     */ package WEB-INF.classes.org.primefaces.showcase.view.data.datatable;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ManagedProperty;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.component.UIComponent;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.showcase.domain.Car;
/*     */ import org.primefaces.showcase.service.CarService;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ManagedBean(name = "dtColumnsView")
/*     */ @ViewScoped
/*     */ public class ColumnsView
/*     */   implements Serializable
/*     */ {
/*  35 */   private static final List<String> VALID_COLUMN_KEYS = Arrays.asList(new String[] { "id", "brand", "year", "color", "price" });
/*     */   
/*  37 */   private String columnTemplate = "id brand year";
/*     */   
/*     */   private List<ColumnModel> columns;
/*     */   
/*     */   private List<Car> cars;
/*     */   
/*     */   private List<Car> filteredCars;
/*     */   
/*     */   @ManagedProperty("#{carService}")
/*     */   private CarService service;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  50 */     this.cars = this.service.createCars(10);
/*     */     
/*  52 */     createDynamicColumns();
/*     */   }
/*     */   
/*     */   public List<Car> getCars() {
/*  56 */     return this.cars;
/*     */   }
/*     */   
/*     */   public List<Car> getFilteredCars() {
/*  60 */     return this.filteredCars;
/*     */   }
/*     */   
/*     */   public void setFilteredCars(List<Car> filteredCars) {
/*  64 */     this.filteredCars = filteredCars;
/*     */   }
/*     */   
/*     */   public void setService(CarService service) {
/*  68 */     this.service = service;
/*     */   }
/*     */   
/*     */   public String getColumnTemplate() {
/*  72 */     return this.columnTemplate;
/*     */   }
/*     */   
/*     */   public void setColumnTemplate(String columnTemplate) {
/*  76 */     this.columnTemplate = columnTemplate;
/*     */   }
/*     */   
/*     */   public List<ColumnModel> getColumns() {
/*  80 */     return this.columns;
/*     */   }
/*     */   
/*     */   private void createDynamicColumns() {
/*  84 */     String[] columnKeys = this.columnTemplate.split(" ");
/*  85 */     this.columns = new ArrayList<ColumnModel>();
/*     */     
/*  87 */     for (String columnKey : columnKeys) {
/*  88 */       String key = columnKey.trim();
/*     */       
/*  90 */       if (VALID_COLUMN_KEYS.contains(key)) {
/*  91 */         this.columns.add(new ColumnModel(columnKey.toUpperCase(), columnKey));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void updateColumns() {
/*  98 */     UIComponent table = FacesContext.getCurrentInstance().getViewRoot().findComponent(":form:cars");
/*  99 */     table.setValueExpression("sortBy", null);
/*     */ 
/*     */     
/* 102 */     createDynamicColumns();
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\datatable\ColumnsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */