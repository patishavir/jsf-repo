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
/*    */ import org.primefaces.model.map.Polygon;
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
/*    */ public class PolygonsView
/*    */   implements Serializable
/*    */ {
/*    */   private MapModel polygonModel;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 37 */     this.polygonModel = (MapModel)new DefaultMapModel();
/*    */ 
/*    */     
/* 40 */     LatLng coord1 = new LatLng(36.879466D, 30.667648D);
/* 41 */     LatLng coord2 = new LatLng(36.883707D, 30.689216D);
/* 42 */     LatLng coord3 = new LatLng(36.879703D, 30.706707D);
/*    */ 
/*    */     
/* 45 */     Polygon polygon = new Polygon();
/* 46 */     polygon.getPaths().add(coord1);
/* 47 */     polygon.getPaths().add(coord2);
/* 48 */     polygon.getPaths().add(coord3);
/*    */     
/* 50 */     polygon.setStrokeColor("#FF9900");
/* 51 */     polygon.setFillColor("#FF9900");
/* 52 */     polygon.setStrokeOpacity(0.7D);
/* 53 */     polygon.setFillOpacity(0.7D);
/*    */     
/* 55 */     this.polygonModel.addOverlay((Overlay)polygon);
/*    */   }
/*    */   
/*    */   public MapModel getPolygonModel() {
/* 59 */     return this.polygonModel;
/*    */   }
/*    */   
/*    */   public void onPolygonSelect(OverlaySelectEvent event) {
/* 63 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Polygon Selected", null));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\gmap\PolygonsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */