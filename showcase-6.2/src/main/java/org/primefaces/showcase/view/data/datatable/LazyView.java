/*    */
package org.primefaces.showcase.view.data.datatable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.SelectEvent;
/*    */ import org.primefaces.model.LazyDataModel;
/*    */ import org.primefaces.showcase.domain.Car;
/*    */ import org.primefaces.showcase.service.CarService;
/*    */ import org.primefaces.showcase.view.data.datatable.LazyCarDataModel;

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
/*    */ @ManagedBean(name = "dtLazyView")
/*    */ @ViewScoped
/*    */ public class LazyView/*    */ implements Serializable
/*    */ {
	/*    */ private LazyDataModel<Car> lazyModel;
	/*    */ private Car selectedCar;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 43 */ this.lazyModel = (LazyDataModel<Car>) new LazyCarDataModel(this.service.createCars(200));
		/*    */ }

	/*    */
	/*    */ public LazyDataModel<Car> getLazyModel() {
		/* 47 */ return this.lazyModel;
		/*    */ }

	/*    */
	/*    */ public Car getSelectedCar() {
		/* 51 */ return this.selectedCar;
		/*    */ }

	/*    */
	/*    */ public void setSelectedCar(Car selectedCar) {
		/* 55 */ this.selectedCar = selectedCar;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 59 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public void onRowSelect(SelectEvent event) {
		/* 63 */ FacesMessage msg = new FacesMessage("Car Selected", ((Car) event.getObject()).getId());
		/* 64 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\LazyView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */