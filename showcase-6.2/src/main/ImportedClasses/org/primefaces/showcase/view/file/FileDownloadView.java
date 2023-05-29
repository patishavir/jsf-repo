/*    */ package WEB-INF.classes.org.primefaces.showcase.view.file;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.model.DefaultStreamedContent;
/*    */ import org.primefaces.model.StreamedContent;
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
/*    */ public class FileDownloadView
/*    */ {
/*    */   private StreamedContent file;
/*    */   
/*    */   public FileDownloadView() {
/* 31 */     InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/demo/images/optimus.jpg");
/* 32 */     this.file = (StreamedContent)new DefaultStreamedContent(stream, "image/jpg", "downloaded_optimus.jpg");
/*    */   }
/*    */   
/*    */   public StreamedContent getFile() {
/* 36 */     return this.file;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\file\FileDownloadView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */