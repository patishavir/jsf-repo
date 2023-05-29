/*    */
package org.primefaces.showcase.view.data;

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
/*    */
/*    */
/*    */
/*    */ @ManagedBean
/*    */ @ViewScoped
/*    */ public class DataListView/*    */ implements Serializable
/*    */ {
	/*    */ private List<Car> cars1;
	/*    */ private List<Car> cars2;
	/*    */ private List<Car> cars3;
	/*    */ private Car selectedCar;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 44 */ this.cars1 = this.service.createCars(10);
		/* 45 */ this.cars2 = this.service.createCars(5);
		/* 46 */ this.cars3 = this.service.createCars(50);
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars1() {
		/* 50 */ return this.cars1;
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars2() {
		/* 54 */ return this.cars2;
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars3() {
		/* 58 */ return this.cars3;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 62 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public Car getSelectedCar() {
		/* 66 */ return this.selectedCar;
		/*    */ }

	/*    */
	/*    */ public void setSelectedCar(Car selectedCar) {
		/* 70 */ this.selectedCar = selectedCar;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\DataListView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */