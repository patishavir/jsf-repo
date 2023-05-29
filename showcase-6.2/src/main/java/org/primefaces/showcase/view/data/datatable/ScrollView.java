/*    */
package org.primefaces.showcase.view.data.datatable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
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
/*    */ @ManagedBean(name = "dtScrollView")
/*    */ @ViewScoped
/*    */ public class ScrollView/*    */ implements Serializable
/*    */ {
	/*    */ private List<Car> cars1;
	/*    */ private List<Car> cars2;
	/*    */ private List<Car> cars3;
	/*    */ private List<Car> cars4;
	/*    */ private List<Car> cars5;
	/*    */ private List<Car> cars6;
	/*    */ private LazyDataModel<Car> lazyModel;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 45 */ this.cars1 = this.service.createCars(50);
		/* 46 */ this.cars2 = this.service.createCars(10);
		/* 47 */ this.cars3 = this.service.createCars(50);
		/* 48 */ this.cars4 = this.service.createCars(50);
		/* 49 */ this.cars5 = this.service.createCars(50);
		/* 50 */ this.cars6 = this.service.createCars(200);
		/* 51 */ this.lazyModel = (LazyDataModel<Car>) new LazyCarDataModel(this.service.createCars(20000));
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars1() {
		/* 55 */ return this.cars1;
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars2() {
		/* 59 */ return this.cars2;
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars3() {
		/* 63 */ return this.cars3;
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars4() {
		/* 67 */ return this.cars4;
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars5() {
		/* 71 */ return this.cars5;
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars6() {
		/* 75 */ return this.cars6;
		/*    */ }

	/*    */
	/*    */ public LazyDataModel<Car> getLazyModel() {
		/* 79 */ return this.lazyModel;
		/*    */ }

	/*    */
	/*    */ public void setLazyModel(LazyDataModel<Car> lazyModel) {
		/* 83 */ this.lazyModel = lazyModel;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 87 */ this.service = service;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\ScrollView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */