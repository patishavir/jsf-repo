/*    */
package org.primefaces.showcase.view.data.gmap;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import org.primefaces.event.map.OverlaySelectEvent;
/*    */ import org.primefaces.model.map.DefaultMapModel;
/*    */ import org.primefaces.model.map.LatLng;
/*    */ import org.primefaces.model.map.MapModel;
/*    */ import org.primefaces.model.map.Marker;
/*    */ import org.primefaces.model.map.Overlay;

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
/*    */ public class InfoWindowView/*    */ implements Serializable
/*    */ {
	/*    */ private MapModel advancedModel;
	/*    */ private Marker marker;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 39 */ this.advancedModel = (MapModel) new DefaultMapModel();
		/*    */
		/*    */
		/* 42 */ LatLng coord1 = new LatLng(36.879466D, 30.667648D);
		/* 43 */ LatLng coord2 = new LatLng(36.883707D, 30.689216D);
		/* 44 */ LatLng coord3 = new LatLng(36.879703D, 30.706707D);
		/* 45 */ LatLng coord4 = new LatLng(36.885233D, 30.702323D);
		/*    */
		/*    */
		/* 48 */ this.advancedModel.addOverlay((Overlay) new Marker(coord1, "Konyaalti", "konyaalti.png",
				"https://maps.google.com/mapfiles/ms/micons/blue-dot.png"));
		/* 49 */ this.advancedModel.addOverlay((Overlay) new Marker(coord2, "Ataturk Parki", "ataturkparki.png"));
		/* 50 */ this.advancedModel.addOverlay((Overlay) new Marker(coord4, "Kaleici", "kaleici.png",
				"https://maps.google.com/mapfiles/ms/micons/pink-dot.png"));
		/* 51 */ this.advancedModel.addOverlay((Overlay) new Marker(coord3, "Karaalioglu Parki", "karaalioglu.png",
				"https://maps.google.com/mapfiles/ms/micons/yellow-dot.png"));
		/*    */ }

	/*    */
	/*    */ public MapModel getAdvancedModel() {
		/* 55 */ return this.advancedModel;
		/*    */ }

	/*    */
	/*    */ public void onMarkerSelect(OverlaySelectEvent event) {
		/* 59 */ this.marker = (Marker) event.getOverlay();
		/*    */ }

	/*    */
	/*    */ public Marker getMarker() {
		/* 63 */ return this.marker;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\gmap\InfoWindowView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */