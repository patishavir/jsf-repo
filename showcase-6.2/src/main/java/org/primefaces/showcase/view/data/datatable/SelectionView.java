/*     */
package org.primefaces.showcase.view.data.datatable;

/*     */
/*     */ import java.io.Serializable;
/*     */ import java.util.List;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ManagedProperty;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.event.SelectEvent;
/*     */ import org.primefaces.event.UnselectEvent;
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
/*     */
/*     */ @ManagedBean(name = "dtSelectionView")
/*     */ @ViewScoped
/*     */ public class SelectionView/*     */ implements Serializable
/*     */ {
	/*     */ private List<Car> cars1;
	/*     */ private List<Car> cars2;
	/*     */ private List<Car> cars3;
	/*     */ private List<Car> cars4;
	/*     */ private List<Car> cars5;
	/*     */ private List<Car> cars6;
	/*     */ private Car selectedCar;
	/*     */ private List<Car> selectedCars;
	/*     */ @ManagedProperty("#{carService}")
	/*     */ private CarService service;

	/*     */
	/*     */ @PostConstruct
	/*     */ public void init() {
		/* 49 */ this.cars1 = this.service.createCars(10);
		/* 50 */ this.cars2 = this.service.createCars(10);
		/* 51 */ this.cars3 = this.service.createCars(10);
		/* 52 */ this.cars4 = this.service.createCars(10);
		/* 53 */ this.cars5 = this.service.createCars(10);
		/* 54 */ this.cars6 = this.service.createCars(10);
		/*     */ }

	/*     */
	/*     */ public List<Car> getCars1() {
		/* 58 */ return this.cars1;
		/*     */ }

	/*     */
	/*     */ public List<Car> getCars2() {
		/* 62 */ return this.cars2;
		/*     */ }

	/*     */
	/*     */ public List<Car> getCars3() {
		/* 66 */ return this.cars3;
		/*     */ }

	/*     */
	/*     */ public List<Car> getCars4() {
		/* 70 */ return this.cars4;
		/*     */ }

	/*     */
	/*     */ public List<Car> getCars5() {
		/* 74 */ return this.cars5;
		/*     */ }

	/*     */
	/*     */ public List<Car> getCars6() {
		/* 78 */ return this.cars6;
		/*     */ }

	/*     */
	/*     */ public void setService(CarService service) {
		/* 82 */ this.service = service;
		/*     */ }

	/*     */
	/*     */ public Car getSelectedCar() {
		/* 86 */ return this.selectedCar;
		/*     */ }

	/*     */
	/*     */ public void setSelectedCar(Car selectedCar) {
		/* 90 */ this.selectedCar = selectedCar;
		/*     */ }

	/*     */
	/*     */ public List<Car> getSelectedCars() {
		/* 94 */ return this.selectedCars;
		/*     */ }

	/*     */
	/*     */ public void setSelectedCars(List<Car> selectedCars) {
		/* 98 */ this.selectedCars = selectedCars;
		/*     */ }

	/*     */
	/*     */ public void onRowSelect(SelectEvent event) {
		/* 102 */ FacesMessage msg = new FacesMessage("Car Selected", ((Car) event.getObject()).getId());
		/* 103 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*     */ }

	/*     */
	/*     */ public void onRowUnselect(UnselectEvent event) {
		/* 107 */ FacesMessage msg = new FacesMessage("Car Unselected", ((Car) event.getObject()).getId());
		/* 108 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\SelectionView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */