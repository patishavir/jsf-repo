/*    */
package org.primefaces.showcase.view.file;

/*    */
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.FileUploadEvent;
/*    */ import org.primefaces.model.UploadedFile;

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
/*    */ public class FileUploadView
/*    */ {
	/*    */ private UploadedFile file;

	/*    */
	/*    */ public UploadedFile getFile() {
		/* 31 */ return this.file;
		/*    */ }

	/*    */
	/*    */ public void setFile(UploadedFile file) {
		/* 35 */ this.file = file;
		/*    */ }

	/*    */
	/*    */ public void upload() {
		/* 39 */ if (this.file != null) {
			/* 40 */ FacesMessage message = new FacesMessage("Succesful", this.file.getFileName() + " is uploaded.");
			/* 41 */ FacesContext.getCurrentInstance().addMessage(null, message);
			/*    */ }
		/*    */ }

	/*    */
	/*    */ public void handleFileUpload(FileUploadEvent event) {
		/* 46 */ FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
		/* 47 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\file\FileUploadView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */