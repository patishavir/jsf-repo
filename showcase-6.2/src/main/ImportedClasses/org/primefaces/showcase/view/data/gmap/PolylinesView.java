/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.gmap;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.map.OverlaySelectEvent;
/*    */ import org.primefaces.model.map.DefaultMapModel;
/*    */ import org.primefaces.model.map.LatLng;
/*    */ import org.primefaces.model.map.MapModel;
/*    */ import org.primefaces.model.map.Overlay;
/*    */ import org.primefaces.model.map.Polyline;
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
/*    */ public class PolylinesView
/*    */   implements Serializable
/*    */ {
/*    */   private MapModel polylineModel;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 37 */     this.polylineModel = (MapModel)new DefaultMapModel();
/*    */ 
/*    */     
/* 40 */     LatLng coord1 = new LatLng(36.879466D, 30.667648D);
/* 41 */     LatLng coord2 = new LatLng(36.883707D, 30.689216D);
/* 42 */     LatLng coord3 = new LatLng(36.879703D, 30.706707D);
/* 43 */     LatLng coord4 = new LatLng(36.885233D, 30.702323D);
/*    */ 
/*    */     
/* 46 */     Polyline polyline = new Polyline();
/* 47 */     polyline.getPaths().add(coord1);
/* 48 */     polyline.getPaths().add(coord2);
/* 49 */     polyline.getPaths().add(coord3);
/* 50 */     polyline.getPaths().add(coord4);
/*    */     
/* 52 */     polyline.setStrokeWeight(10);
/* 53 */     polyline.setStrokeColor("#FF9900");
/* 54 */     polyline.setStrokeOpacity(0.7D);
/*    */     
/* 56 */     this.polylineModel.addOverlay((Overlay)polyline);
/*    */   }
/*    */   
/*    */   public MapModel getPolylineModel() {
/* 60 */     return this.polylineModel;
/*    */   }
/*    */   
/*    */   public void onPolylineSelect(OverlaySelectEvent event) {
/* 64 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Polyline Selected", null));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\gmap\PolylinesView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */