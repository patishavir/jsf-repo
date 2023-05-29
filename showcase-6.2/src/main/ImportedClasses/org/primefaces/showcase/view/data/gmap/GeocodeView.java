/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.gmap;
/*    */ 
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import org.primefaces.event.map.GeocodeEvent;
/*    */ import org.primefaces.event.map.ReverseGeocodeEvent;
/*    */ import org.primefaces.model.map.DefaultMapModel;
/*    */ import org.primefaces.model.map.GeocodeResult;
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
/*    */ public class GeocodeView
/*    */ {
/*    */   private MapModel geoModel;
/*    */   private MapModel revGeoModel;
/* 34 */   private String centerGeoMap = "41.850033, -87.6500523";
/* 35 */   private String centerRevGeoMap = "41.850033, -87.6500523";
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 39 */     this.geoModel = (MapModel)new DefaultMapModel();
/* 40 */     this.revGeoModel = (MapModel)new DefaultMapModel();
/*    */   }
/*    */   
/*    */   public void onGeocode(GeocodeEvent event) {
/* 44 */     List<GeocodeResult> results = event.getResults();
/*    */     
/* 46 */     if (results != null && !results.isEmpty()) {
/* 47 */       LatLng center = ((GeocodeResult)results.get(0)).getLatLng();
/* 48 */       this.centerGeoMap = center.getLat() + "," + center.getLng();
/*    */       
/* 50 */       for (int i = 0; i < results.size(); i++) {
/* 51 */         GeocodeResult result = results.get(i);
/* 52 */         this.geoModel.addOverlay((Overlay)new Marker(result.getLatLng(), result.getAddress()));
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void onReverseGeocode(ReverseGeocodeEvent event) {
/* 58 */     List<String> addresses = event.getAddresses();
/* 59 */     LatLng coord = event.getLatlng();
/*    */     
/* 61 */     if (addresses != null && !addresses.isEmpty()) {
/* 62 */       this.centerRevGeoMap = coord.getLat() + "," + coord.getLng();
/* 63 */       this.revGeoModel.addOverlay((Overlay)new Marker(coord, addresses.get(0)));
/*    */     } 
/*    */   }
/*    */   
/*    */   public MapModel getGeoModel() {
/* 68 */     return this.geoModel;
/*    */   }
/*    */   
/*    */   public MapModel getRevGeoModel() {
/* 72 */     return this.revGeoModel;
/*    */   }
/*    */   
/*    */   public String getCenterGeoMap() {
/* 76 */     return this.centerGeoMap;
/*    */   }
/*    */   
/*    */   public String getCenterRevGeoMap() {
/* 80 */     return this.centerRevGeoMap;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\gmap\GeocodeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */