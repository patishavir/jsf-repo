/*    */ package WEB-INF.classes.org.primefaces.showcase.view.multimedia;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import javax.faces.FacesException;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.ExternalContext;
/*    */ import javax.faces.context.FacesContext;
/*    */ import javax.imageio.stream.FileImageOutputStream;
/*    */ import org.primefaces.event.CaptureEvent;
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
/*    */ public class PhotoCamView
/*    */ {
/*    */   private String filename;
/*    */   
/*    */   private String getRandomImageName() {
/* 35 */     int i = (int)(Math.random() * 1.0E7D);
/*    */     
/* 37 */     return String.valueOf(i);
/*    */   }
/*    */   
/*    */   public String getFilename() {
/* 41 */     return this.filename;
/*    */   }
/*    */   
/*    */   public void oncapture(CaptureEvent captureEvent) {
/* 45 */     this.filename = getRandomImageName();
/* 46 */     byte[] data = captureEvent.getData();
/*    */     
/* 48 */     ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
/* 49 */     String newFileName = externalContext.getRealPath("") + File.separator + "resources" + File.separator + "demo" + File.separator + "images" + File.separator + "photocam" + File.separator + this.filename + ".jpeg";
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 54 */       FileImageOutputStream imageOutput = new FileImageOutputStream(new File(newFileName));
/* 55 */       imageOutput.write(data, 0, data.length);
/* 56 */       imageOutput.close();
/*    */     }
/* 58 */     catch (IOException e) {
/* 59 */       throw new FacesException("Error in writing captured image.", e);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\multimedia\PhotoCamView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */