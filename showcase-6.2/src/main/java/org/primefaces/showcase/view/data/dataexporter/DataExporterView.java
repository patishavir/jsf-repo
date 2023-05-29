/*    */
package org.primefaces.showcase.view.data.dataexporter;

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
/*    */
/*    */ @ManagedBean
/*    */ public class DataExporterView/*    */ implements Serializable
/*    */ {
	/*    */ private List<Car> cars;
	/*    */ @ManagedProperty("#{carService}")
	/*    */ private CarService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 37 */ this.cars = this.service.createCars(100);
		/*    */ }

	/*    */
	/*    */ public List<Car> getCars() {
		/* 41 */ return this.cars;
		/*    */ }

	/*    */
	/*    */ public void setService(CarService service) {
		/* 45 */ this.service = service;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\dataexporter\DataExporterView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */