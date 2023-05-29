/*    */
package org.primefaces.showcase.view.multimedia;

/*    */
/*    */ import java.io.File;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.ExternalContext;
/*    */ import javax.faces.context.FacesContext;
/*    */ import javax.imageio.stream.FileImageOutputStream;
/*    */ import org.primefaces.model.CroppedImage;

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
/*    */ public class CropperView
/*    */ {
	/*    */ private CroppedImage croppedImage;
	/*    */ private String newImageName;

	/*    */
	/*    */ public CroppedImage getCroppedImage() {
		/* 34 */ return this.croppedImage;
		/*    */ }

	/*    */
	/*    */ public void setCroppedImage(CroppedImage croppedImage) {
		/* 38 */ this.croppedImage = croppedImage;
		/*    */ }

	/*    */
	/*    */ public void crop() {
		/* 42 */ if (this.croppedImage == null) {
			/*    */ return;
			/*    */ }
		/*    */
		/* 46 */ setNewImageName(getRandomImageName());
		/* 47 */ ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		/*    */
		/* 49 */ String newFileName = externalContext.getRealPath("") + File.separator + "resources" + File.separator
				+ "demo" + File.separator + "images" + File.separator + "crop" + File.separator + getNewImageName()
				+ ".jpg";
		/*    */
		/*    */
		/*    */ try {
			/* 53 */ FileImageOutputStream imageOutput = new FileImageOutputStream(new File(newFileName));
			/* 54 */ imageOutput.write(this.croppedImage.getBytes(), 0, (this.croppedImage.getBytes()).length);
			/* 55 */ imageOutput.close();
			/* 56 */ } catch (Exception e) {
			/* 57 */ FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Cropping failed."));
			/*    */
			/*    */ return;
			/*    */ }
		/* 61 */ FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Cropping finished."));
		/*    */ }

	/*    */
	/*    */ private String getRandomImageName() {
		/* 65 */ int i = (int) (Math.random() * 100000.0D);
		/*    */
		/* 67 */ return String.valueOf(i);
		/*    */ }

	/*    */
	/*    */ public String getNewImageName() {
		/* 71 */ return this.newImageName;
		/*    */ }

	/*    */
	/*    */ public void setNewImageName(String newImageName) {
		/* 75 */ this.newImageName = newImageName;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\multimedia\CropperView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */