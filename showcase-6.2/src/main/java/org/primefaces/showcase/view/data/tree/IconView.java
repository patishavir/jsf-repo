/*    */
package org.primefaces.showcase.view.data.tree;

/*    */
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
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
/*    */ @ManagedBean(name = "treeIconView")
/*    */ public class IconView
/*    */ {
	/*    */ private TreeNode root;
	/*    */ @ManagedProperty("#{documentService}")
	/*    */ private DocumentService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 34 */ this.root = this.service.createDocuments();
		/*    */ }

	/*    */
	/*    */ public void setService(DocumentService service) {
		/* 38 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot() {
		/* 42 */ return this.root;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\tree\IconView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */