/*    */
package org.primefaces.showcase.view.df;

/*    */
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.PrimeFaces;
/*    */ import org.primefaces.event.SelectEvent;
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
/*    */
/*    */ @ManagedBean(name = "dfView")
/*    */ public class DFView
/*    */ {
	/*    */ public void viewCars() {
		/* 32 */ Map<String, Object> options = new HashMap<String, Object>();
		/* 33 */ options.put("resizable", Boolean.valueOf(false));
		/* 34 */ PrimeFaces.current().dialog().openDynamic("viewCars", options, null);
		/*    */ }

	/*    */
	/*    */ public void viewCarsCustomized() {
		/* 38 */ Map<String, Object> options = new HashMap<String, Object>();
		/* 39 */ options.put("modal", Boolean.valueOf(true));
		/* 40 */ options.put("width", Integer.valueOf(640));
		/* 41 */ options.put("height", Integer.valueOf(340));
		/* 42 */ options.put("contentWidth", "100%");
		/* 43 */ options.put("contentHeight", "100%");
		/* 44 */ options.put("headerElement", "customheader");
		/*    */
		/* 46 */ PrimeFaces.current().dialog().openDynamic("viewCars", options, null);
		/*    */ }

	/*    */
	/*    */ public void chooseCar() {
		/* 50 */ Map<String, Object> options = new HashMap<String, Object>();
		/* 51 */ options.put("resizable", Boolean.valueOf(false));
		/* 52 */ options.put("draggable", Boolean.valueOf(false));
		/* 53 */ options.put("modal", Boolean.valueOf(true));
		/* 54 */ PrimeFaces.current().dialog().openDynamic("selectCar", options, null);
		/*    */ }

	/*    */
	/*    */ public void onCarChosen(SelectEvent event) {
		/* 58 */ Car car = (Car) event.getObject();
		/* 59 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected",
				"Id:" + car.getId());
		/*    */
		/* 61 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }

	/*    */
	/*    */ public void showMessage() {
		/* 65 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life",
				"Echoes in eternity.");
		/*    */
		/* 67 */ PrimeFaces.current().dialog().showMessageDynamic(message);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\df\DFView.class Java compiler version: 6 (50.0) JD-Core Version: 1.1.3
 */