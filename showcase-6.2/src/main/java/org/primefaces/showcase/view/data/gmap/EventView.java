/*    */
package org.primefaces.showcase.view.data.gmap;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.map.PointSelectEvent;
/*    */ import org.primefaces.event.map.StateChangeEvent;
/*    */ import org.primefaces.model.map.LatLng;
/*    */ import org.primefaces.model.map.LatLngBounds;

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
/*    */ public class EventView/*    */ implements Serializable
/*    */ {
	/*    */ public void onStateChange(StateChangeEvent event) {
		/* 32 */ LatLngBounds bounds = event.getBounds();
		/* 33 */ int zoomLevel = event.getZoomLevel();
		/*    */
		/* 35 */ addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Zoom Level", String.valueOf(zoomLevel)));
		/* 36 */ addMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Center", event.getCenter().toString()));
		/* 37 */ addMessage(
				new FacesMessage(FacesMessage.SEVERITY_INFO, "NorthEast", bounds.getNorthEast().toString()));
		/* 38 */ addMessage(
				new FacesMessage(FacesMessage.SEVERITY_INFO, "SouthWest", bounds.getSouthWest().toString()));
		/*    */ }

	/*    */
	/*    */ public void onPointSelect(PointSelectEvent event) {
		/* 42 */ LatLng latlng = event.getLatLng();
		/*    */
		/* 44 */ FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Point Selected", "Lat:" + latlng.getLat() + ", Lng:" + latlng.getLng()));
		/*    */ }

	/*    */
	/*    */ public void addMessage(FacesMessage message) {
		/* 48 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\gmap\EventView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */