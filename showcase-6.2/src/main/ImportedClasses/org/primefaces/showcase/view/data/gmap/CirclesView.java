/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.gmap;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.map.OverlaySelectEvent;
/*    */ import org.primefaces.model.map.Circle;
/*    */ import org.primefaces.model.map.DefaultMapModel;
/*    */ import org.primefaces.model.map.LatLng;
/*    */ import org.primefaces.model.map.MapModel;
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
/*    */ public class CirclesView
/*    */   implements Serializable
/*    */ {
/*    */   private MapModel circleModel;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 38 */     this.circleModel = (MapModel)new DefaultMapModel();
/*    */ 
/*    */     
/* 41 */     LatLng coord1 = new LatLng(36.879466D, 30.667648D);
/* 42 */     LatLng coord4 = new LatLng(36.885233D, 30.702323D);
/*    */ 
/*    */     
/* 45 */     Circle circle1 = new Circle(coord1, 500.0D);
/* 46 */     circle1.setStrokeColor("#d93c3c");
/* 47 */     circle1.setFillColor("#d93c3c");
/* 48 */     circle1.setFillOpacity(0.5D);
/*    */     
/* 50 */     Circle circle2 = new Circle(coord4, 300.0D);
/* 51 */     circle2.setStrokeColor("#00ff00");
/* 52 */     circle2.setFillColor("#00ff00");
/* 53 */     circle2.setStrokeOpacity(0.7D);
/* 54 */     circle2.setFillOpacity(0.7D);
/*    */     
/* 56 */     this.circleModel.addOverlay((Overlay)circle1);
/* 57 */     this.circleModel.addOverlay((Overlay)circle2);
/*    */   }
/*    */   
/*    */   public MapModel getCircleModel() {
/* 61 */     return this.circleModel;
/*    */   }
/*    */   
/*    */   public void onCircleSelect(OverlaySelectEvent event) {
/* 65 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Circle Selected", null));
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\gmap\CirclesView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */