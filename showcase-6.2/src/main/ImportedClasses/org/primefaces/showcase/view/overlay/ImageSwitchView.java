/*    */ package WEB-INF.classes.org.primefaces.showcase.view.overlay;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
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
/*    */ public class ImageSwitchView
/*    */ {
/*    */   private List<String> images;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 30 */     this.images = new ArrayList<String>();
/*    */     
/* 32 */     this.images.add("nature1.jpg");
/* 33 */     this.images.add("nature2.jpg");
/* 34 */     this.images.add("nature3.jpg");
/* 35 */     this.images.add("nature4.jpg");
/*    */   }
/*    */   
/*    */   public List<String> getImages() {
/* 39 */     return this.images;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\overlay\ImageSwitchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */