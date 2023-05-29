/*    */
package org.primefaces.showcase.view.data.gmap;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.map.OverlaySelectEvent;
/*    */ import org.primefaces.model.map.DefaultMapModel;
/*    */ import org.primefaces.model.map.LatLng;
/*    */ import org.primefaces.model.map.LatLngBounds;
/*    */ import org.primefaces.model.map.MapModel;
/*    */ import org.primefaces.model.map.Overlay;
/*    */ import org.primefaces.model.map.Rectangle;

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
/*    */ public class RectanglesView/*    */ implements Serializable
/*    */ {
	/*    */ private MapModel rectangleModel;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 38 */ this.rectangleModel = (MapModel) new DefaultMapModel();
		/*    */
		/*    */
		/* 41 */ LatLng ne = new LatLng(36.879466D, 30.667648D);
		/* 42 */ LatLng sw = new LatLng(36.885233D, 30.702323D);
		/*    */
		/*    */
		/* 45 */ Rectangle rect = new Rectangle(new LatLngBounds(sw, ne));
		/* 46 */ rect.setStrokeColor("#d93c3c");
		/* 47 */ rect.setFillColor("#d93c3c");
		/* 48 */ rect.setFillOpacity(0.5D);
		/* 49 */ this.rectangleModel.addOverlay((Overlay) rect);
		/*    */ }

	/*    */
	/*    */ public MapModel getRectangleModel() {
		/* 53 */ return this.rectangleModel;
		/*    */ }

	/*    */
	/*    */ public void onRectangleSelect(OverlaySelectEvent event) {
		/* 57 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Rectangle Selected", null));
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\gmap\RectanglesView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */