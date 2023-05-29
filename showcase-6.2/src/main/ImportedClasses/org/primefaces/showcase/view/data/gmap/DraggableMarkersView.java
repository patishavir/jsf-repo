/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.gmap;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.map.MarkerDragEvent;
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
/*    */ public class DraggableMarkersView
/*    */   implements Serializable
/*    */ {
/*    */   private MapModel draggableModel;
/*    */   private Marker marker;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 41 */     this.draggableModel = (MapModel)new DefaultMapModel();
/*    */ 
/*    */     
/* 44 */     LatLng coord1 = new LatLng(36.879466D, 30.667648D);
/* 45 */     LatLng coord2 = new LatLng(36.883707D, 30.689216D);
/* 46 */     LatLng coord3 = new LatLng(36.879703D, 30.706707D);
/* 47 */     LatLng coord4 = new LatLng(36.885233D, 30.702323D);
/*    */ 
/*    */     
/* 50 */     this.draggableModel.addOverlay((Overlay)new Marker(coord1, "Konyaalti"));
/* 51 */     this.draggableModel.addOverlay((Overlay)new Marker(coord2, "Ataturk Parki"));
/* 52 */     this.draggableModel.addOverlay((Overlay)new Marker(coord3, "Karaalioglu Parki"));
/* 53 */     this.draggableModel.addOverlay((Overlay)new Marker(coord4, "Kaleici"));
/*    */     
/* 55 */     for (Marker premarker : this.draggableModel.getMarkers()) {
/* 56 */       premarker.setDraggable(true);
/*    */     }
/*    */   }
/*    */   
/*    */   public MapModel getDraggableModel() {
/* 61 */     return this.draggableModel;
/*    */   }
/*    */   
/*    */   public void onMarkerDrag(MarkerDragEvent event) {
/* 65 */     this.marker = event.getMarker();
/*    */     
/* 67 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Dragged", "Lat:" + this.marker.getLatlng().getLat() + ", Lng:" + this.marker.getLatlng().getLng()));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\gmap\DraggableMarkersView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */