/*    */
package org.primefaces.showcase.mobile;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.SelectEvent;
/*    */ import org.primefaces.mobile.event.SwipeEvent;
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
/*    */ @ManagedBean(name = "eventsView")
/*    */ @ViewScoped
/*    */ public class EventsView/*    */ implements Serializable
/*    */ {
	/*    */ private List<Car> cars;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 42 */ this.cars = this.service.createCars(10);
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars() {
		/* 46 */ return this.cars;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 50 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public void swipeCar(SwipeEvent event) {
		/* 54 */ Car car = (Car) event.getData();
		/* 55 */ this.cars.remove(car);
		/* 56 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Swiped", "Removed: " + car.getId()));
		/*    */ }

	/*    */
	/*    */ public void tapCar(SelectEvent event) {
		/* 60 */ FacesMessage msg = new FacesMessage("Car Selected", ((Car) event.getObject()).getId());
		/* 61 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * mobile\EventsView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */