/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.gmap;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
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
/*    */ 
/*    */ 
/*    */ @ManagedBean
/*    */ public class AddMarkersView
/*    */   implements Serializable
/*    */ {
/*    */   private MapModel emptyModel;
/*    */   private String title;
/*    */   private double lat;
/*    */   private double lng;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 42 */     this.emptyModel = (MapModel)new DefaultMapModel();
/*    */   }
/*    */   
/*    */   public MapModel getEmptyModel() {
/* 46 */     return this.emptyModel;
/*    */   }
/*    */   
/*    */   public String getTitle() {
/* 50 */     return this.title;
/*    */   }
/*    */   
/*    */   public void setTitle(String title) {
/* 54 */     this.title = title;
/*    */   }
/*    */   
/*    */   public double getLat() {
/* 58 */     return this.lat;
/*    */   }
/*    */   
/*    */   public void setLat(double lat) {
/* 62 */     this.lat = lat;
/*    */   }
/*    */   
/*    */   public double getLng() {
/* 66 */     return this.lng;
/*    */   }
/*    */   
/*    */   public void setLng(double lng) {
/* 70 */     this.lng = lng;
/*    */   }
/*    */   
/*    */   public void addMarker() {
/* 74 */     Marker marker = new Marker(new LatLng(this.lat, this.lng), this.title);
/* 75 */     this.emptyModel.addOverlay((Overlay)marker);
/*    */     
/* 77 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Marker Added", "Lat:" + this.lat + ", Lng:" + this.lng));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\gmap\AddMarkersView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */