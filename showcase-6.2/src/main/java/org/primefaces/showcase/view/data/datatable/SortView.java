/*    */
package org.primefaces.showcase.view.data.datatable;

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
/*    */ @ManagedBean(name = "dtSortView")
/*    */ @ViewScoped
/*    */ public class SortView/*    */ implements Serializable
/*    */ {
	/*    */ private List<Car> cars1;
	/*    */ private List<Car> cars2;
	/*    */ private List<Car> cars3;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 40 */ this.cars1 = this.service.createCars(10);
		/* 41 */ this.cars2 = this.service.createCars(10);
		/* 42 */ this.cars3 = this.service.createCars(50);
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
	/*    */ public List<Car> getCars3() {
		/* 54 */ return this.cars2;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 58 */ this.service = service;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\SortView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */