/*    */
package org.primefaces.showcase.view.data.datatable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.ReorderEvent;
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
/*    */ @ManagedBean(name = "dtReorderView")
/*    */ public class ReorderView/*    */ implements Serializable
/*    */ {
	/*    */ private List<Car> cars1;
	/*    */ private List<Car> cars2;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 41 */ this.cars1 = this.service.createCars(10);
		/* 42 */ this.cars2 = this.service.createCars(10);
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars1() {
		/* 46 */ return this.cars1;
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars2() {
		/* 50 */ return this.cars2;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 54 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public void onRowReorder(ReorderEvent event) {
		/* 58 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Row Moved",
				"From: " + event.getFromIndex() + ", To:" + event.getToIndex());
		/* 59 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\ReorderView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */