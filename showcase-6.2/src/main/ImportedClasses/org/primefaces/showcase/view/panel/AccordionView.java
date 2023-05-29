/*    */ package WEB-INF.classes.org.primefaces.showcase.view.panel;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.TabChangeEvent;
/*    */ import org.primefaces.event.TabCloseEvent;
/*    */ import org.primefaces.showcase.domain.Car;
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
/*    */ public class AccordionView
/*    */ {
/*    */   private List<Car> cars;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 35 */     this.cars = new ArrayList<Car>();
/* 36 */     this.cars.add(new Car("Y25YIH5", "Fiat", 2014, "Black", 10000, true));
/* 37 */     this.cars.add(new Car("JHF261G", "BMW", 2013, "Blue", 50000, true));
/* 38 */     this.cars.add(new Car("HSFY23H", "Ford", 2012, "Black", 35000, false));
/* 39 */     this.cars.add(new Car("GMDK353", "Volvo", 2014, "White", 40000, true));
/* 40 */     this.cars.add(new Car("345GKM5", "Jaguar", 2011, "Gray", 48000, false));
/*    */   }
/*    */   
/*    */   public List<Car> getCars() {
/* 44 */     return this.cars;
/*    */   }
/*    */   
/*    */   public void onTabChange(TabChangeEvent event) {
/* 48 */     FacesMessage msg = new FacesMessage("Tab Changed", "Active Tab: " + event.getTab().getTitle());
/* 49 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */   
/*    */   public void onTabClose(TabCloseEvent event) {
/* 53 */     FacesMessage msg = new FacesMessage("Tab Closed", "Closed tab: " + event.getTab().getTitle());
/* 54 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\panel\AccordionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */