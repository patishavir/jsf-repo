/*    */
package org.primefaces.showcase.view.multimedia;

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
/*    */ public class ImagesView
/*    */ {
	/*    */ private List<String> images;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 30 */ this.images = new ArrayList<String>();
		/* 31 */ for (int i = 1; i <= 12; i++) {
			/* 32 */ this.images.add("nature" + i + ".jpg");
			/*    */ }
		/*    */ }

	/*    */
	/*    */ public List<String> getImages() {
		/* 37 */ return this.images;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\multimedia\ImagesView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */