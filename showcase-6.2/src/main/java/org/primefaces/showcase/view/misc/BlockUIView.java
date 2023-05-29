/*    */
package org.primefaces.showcase.view.misc;

/*    */
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
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
/*    */ public class BlockUIView
/*    */ {
	/*    */ private String firstname;
	/*    */ private String lastname;
	/*    */ private List<Car> cars;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 35 */ this.cars = new ArrayList<Car>();
		/* 36 */ this.cars.add(new Car("Y25YIH5", "Fiat", 2014, "Black", 10000, true));
		/* 37 */ this.cars.add(new Car("JHF261G", "BMW", 2013, "Blue", 50000, true));
		/* 38 */ this.cars.add(new Car("HSFY23H", "Ford", 2012, "Black", 35000, false));
		/* 39 */ this.cars.add(new Car("GMDK353", "Volvo", 2014, "White", 40000, true));
		/* 40 */ this.cars.add(new Car("345GKM5", "Jaguar", 2011, "Gray", 48000, false));
		/* 41 */ this.cars.add(new Car("JETER36", "Volkswagen", 2012, "Black", 10000, true));
		/* 42 */ this.cars.add(new Car("3754HWH", "BMW", 2014, "Blue", 33000, true));
		/* 43 */ this.cars.add(new Car("YRTJD45", "Mercedes", 2011, "Red", 44000, false));
		/* 44 */ this.cars.add(new Car("FDGSH34", "Audi", 2010, "Yellow", 20000, false));
		/* 45 */ this.cars.add(new Car("GD534G", "Honda", 2012, "Black", 17000, false));
		/*    */ }

	/*    */
	/*    */ public String getFirstname() {
		/* 49 */ return this.firstname;
		/*    */ }

	/*    */
	/*    */ public void setFirstname(String firstname) {
		/* 53 */ this.firstname = firstname;
		/*    */ }

	/*    */
	/*    */ public String getLastname() {
		/* 57 */ return this.lastname;
		/*    */ }

	/*    */
	/*    */ public void setLastname(String lastname) {
		/* 61 */ this.lastname = lastname;
		/*    */ }

	/*    */
	/*    */ public void save() {
		/* 65 */ FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars() {
		/* 69 */ return this.cars;
		/*    */ }

	/*    */
	/*    */ public void setCars(List<Car> cars) {
		/* 73 */ this.cars = cars;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\misc\BlockUIView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */