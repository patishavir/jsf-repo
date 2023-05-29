/*    */
package org.primefaces.showcase.view.data.treetable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
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
/*    */ @ManagedBean(name = "ttContextMenuView")
/*    */ @ViewScoped
/*    */ public class ContextMenuView/*    */ implements Serializable
/*    */ {
	/*    */ private TreeNode root;
	/*    */ private TreeNode selectedNode;
	/*    */ @ManagedProperty("#{documentService}")
	/*    */ private DocumentService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 39 */ this.root = this.service.createDocuments();
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot() {
		/* 43 */ return this.root;
		/*    */ }

	/*    */
	/*    */ public void setService(DocumentService service) {
		/* 47 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public TreeNode getSelectedNode() {
		/* 51 */ return this.selectedNode;
		/*    */ }

	/*    */
	/*    */ public void setSelectedNode(TreeNode selectedNode) {
		/* 55 */ this.selectedNode = selectedNode;
		/*    */ }

	/*    */
	/*    */ public void deleteNode() {
		/* 59 */ this.selectedNode.getChildren().clear();
		/* 60 */ this.selectedNode.getParent().getChildren().remove(this.selectedNode);
		/* 61 */ this.selectedNode.setParent(null);
		/*    */
		/* 63 */ this.selectedNode = null;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\treetable\ContextMenuView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */