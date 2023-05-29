/*    */
package org.primefaces.showcase.view.data.treetable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.CellEditEvent;
/*    */ import org.primefaces.event.RowEditEvent;
/*    */ import org.primefaces.model.TreeNode;
/*    */ import org.primefaces.showcase.service.DocumentService;

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
/*    */ @ManagedBean(name = "ttEditView")
/*    */ @ViewScoped
/*    */ public class EditView/*    */ implements Serializable
/*    */ {
	/*    */ private TreeNode root;
	/*    */ private TreeNode root2;
	/*    */ @ManagedProperty("#{documentService}")
	/*    */ private DocumentService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 43 */ this.root = this.service.createDocuments();
		/* 44 */ this.root2 = this.service.createDocuments();
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot() {
		/* 48 */ return this.root;
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot2() {
		/* 52 */ return this.root2;
		/*    */ }

	/*    */
	/*    */ public void setService(DocumentService service) {
		/* 56 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public void onRowEdit(RowEditEvent event) {
		/* 60 */ FacesMessage msg = new FacesMessage("Document Edited", ((TreeNode) event.getObject()).toString());
		/* 61 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }

	/*    */
	/*    */ public void onRowCancel(RowEditEvent event) {
		/* 65 */ FacesMessage msg = new FacesMessage("Edit Cancelled", ((TreeNode) event.getObject()).toString());
		/* 66 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*    */ }

	/*    */
	/*    */ public void onCellEdit(CellEditEvent event) {
		/* 70 */ Object oldValue = event.getOldValue();
		/* 71 */ Object newValue = event.getNewValue();
		/*    */
		/* 73 */ if (newValue != null && !newValue.equals(oldValue)) {
			/* 74 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed",
					"Old: " + oldValue + ", New:" + newValue);
			/* 75 */ FacesContext.getCurrentInstance().addMessage(null, msg);
			/*    */ }
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\treetable\EditView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */