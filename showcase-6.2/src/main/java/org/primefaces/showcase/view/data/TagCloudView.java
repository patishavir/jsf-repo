/*    */
package org.primefaces.showcase.view.data;

/*    */
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.SelectEvent;
/*    */ import org.primefaces.model.tagcloud.DefaultTagCloudItem;
/*    */ import org.primefaces.model.tagcloud.DefaultTagCloudModel;
/*    */ import org.primefaces.model.tagcloud.TagCloudItem;
/*    */ import org.primefaces.model.tagcloud.TagCloudModel;

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
/*    */ public class TagCloudView
/*    */ {
	/*    */ private TagCloudModel model;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 35 */ this.model = (TagCloudModel) new DefaultTagCloudModel();
		/* 36 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("Transformers", 1));
		/* 37 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("RIA", "#", 3));
		/* 38 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("AJAX", 2));
		/* 39 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("jQuery", "#", 5));
		/* 40 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("NextGen", 4));
		/* 41 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("JSF 2.0", "#", 2));
		/* 42 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("FCB", 5));
		/* 43 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("Mobile", 3));
		/* 44 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("Themes", "#", 4));
		/* 45 */ this.model.addTag((TagCloudItem) new DefaultTagCloudItem("Rocks", "#", 1));
		/*    */ }

	/*    */
	/*    */ public TagCloudModel getModel() {
		/* 49 */ return this.model;
		/*    */ }

	/*    */
	/*    */ public void onSelect(SelectEvent event) {
		/* 53 */ TagCloudItem item = (TagCloudItem) event.getObject();
		/* 54 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", item.getLabel());
		/* 55 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\TagCloudView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */