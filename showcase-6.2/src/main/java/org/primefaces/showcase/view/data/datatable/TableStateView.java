/*    */
package org.primefaces.showcase.view.data.datatable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.SessionScoped;
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
/*    */ @ManagedBean(name = "dtTableStateView")
/*    */ @SessionScoped
/*    */ public class TableStateView/*    */ implements Serializable
/*    */ {
	/*    */ private List<Car> cars;
	/*    */ private List<Car> filteredCars;
	/*    */ private Car selectedCar;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 42 */ this.cars = this.service.createCars(50);
		/*    */ }

	/*    */
	/*    */ public List<String> getBrands() {
		/* 46 */ return this.service.getBrands();
		/*    */ }

	/*    */
	/*    */ public List<String> getColors() {
		/* 50 */ return this.service.getColors();
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars() {
		/* 54 */ return this.cars;
		/*    */ }

	/*    */
	/*    */ public List<Car> getFilteredCars() {
		/* 58 */ return this.filteredCars;
		/*    */ }

	/*    */
	/*    */ public Car getSelectedCar() {
		/* 62 */ return this.selectedCar;
		/*    */ }

	/*    */
	/*    */ public void setSelectedCar(Car selectedCar) {
		/* 66 */ this.selectedCar = selectedCar;
		/*    */ }

	/*    */
	/*    */ public void setFilteredCars(List<Car> filteredCars) {
		/* 70 */ this.filteredCars = filteredCars;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 74 */ this.service = service;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\TableStateView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */