/*    */
package org.primefaces.showcase.view.data.datatable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
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
/*    */ @ManagedBean(name = "dtSummaryRowView")
/*    */ public class SummaryRowView/*    */ implements Serializable
/*    */ {
	/*    */ private List<Car> cars;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 36 */ this.cars = this.service.createCars(50);
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars() {
		/* 40 */ return this.cars;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 44 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public int getRandomPrice() {
		/* 48 */ return (int) (Math.random() * 100000.0D);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\SummaryRowView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */