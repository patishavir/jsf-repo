/*    */
package org.primefaces.showcase.view.data.gmap;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
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
/*    */ @ManagedBean
/*    */ public class MarkersView/*    */ implements Serializable
/*    */ {
	/*    */ private MapModel simpleModel;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 34 */ this.simpleModel = (MapModel) new DefaultMapModel();
		/*    */
		/*    */
		/* 37 */ LatLng coord1 = new LatLng(36.879466D, 30.667648D);
		/* 38 */ LatLng coord2 = new LatLng(36.883707D, 30.689216D);
		/* 39 */ LatLng coord3 = new LatLng(36.879703D, 30.706707D);
		/* 40 */ LatLng coord4 = new LatLng(36.885233D, 30.702323D);
		/*    */
		/*    */
		/* 43 */ this.simpleModel.addOverlay((Overlay) new Marker(coord1, "Konyaalti"));
		/* 44 */ this.simpleModel.addOverlay((Overlay) new Marker(coord2, "Ataturk Parki"));
		/* 45 */ this.simpleModel.addOverlay((Overlay) new Marker(coord3, "Karaalioglu Parki"));
		/* 46 */ this.simpleModel.addOverlay((Overlay) new Marker(coord4, "Kaleici"));
		/*    */ }

	/*    */
	/*    */ public MapModel getSimpleModel() {
		/* 50 */ return this.simpleModel;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\gmap\MarkersView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */