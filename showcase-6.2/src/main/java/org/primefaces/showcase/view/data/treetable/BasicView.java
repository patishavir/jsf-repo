/*    */
package org.primefaces.showcase.view.data.treetable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import org.primefaces.model.TreeNode;
/*    */ import org.primefaces.showcase.domain.Document;
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
/*    */ @ManagedBean(name = "ttBasicView")
/*    */ @ViewScoped
/*    */ public class BasicView/*    */ implements Serializable
/*    */ {
	/*    */ private TreeNode root;
	/*    */ private Document selectedDocument;
	/*    */ @ManagedProperty("#{documentService}")
	/*    */ private DocumentService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 40 */ this.root = this.service.createDocuments();
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot() {
		/* 44 */ return this.root;
		/*    */ }

	/*    */
	/*    */ public void setService(DocumentService service) {
		/* 48 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public Document getSelectedDocument() {
		/* 52 */ return this.selectedDocument;
		/*    */ }

	/*    */
	/*    */ public void setSelectedDocument(Document selectedDocument) {
		/* 56 */ this.selectedDocument = selectedDocument;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\treetable\BasicView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */