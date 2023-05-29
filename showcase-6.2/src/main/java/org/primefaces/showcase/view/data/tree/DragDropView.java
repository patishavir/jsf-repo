/*    */
package org.primefaces.showcase.view.data.tree;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.TreeDragDropEvent;
/*    */ import org.primefaces.model.DefaultTreeNode;
/*    */ import org.primefaces.model.TreeNode;

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
/*    */
/*    */ @ManagedBean(name = "treeDNDView")
/*    */ @ViewScoped
/*    */ public class DragDropView/*    */ implements Serializable
/*    */ {
	/*    */ private TreeNode root1;
	/*    */ private TreeNode root2;
	/*    */ private TreeNode selectedNode1;
	/*    */ private TreeNode selectedNode2;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 42 */ this.root1 = (TreeNode) new DefaultTreeNode("Root", null);
		/* 43 */ DefaultTreeNode defaultTreeNode1 = new DefaultTreeNode("Node 0", this.root1);
		/* 44 */ DefaultTreeNode defaultTreeNode2 = new DefaultTreeNode("Node 1", this.root1);
		/* 45 */ DefaultTreeNode defaultTreeNode3 = new DefaultTreeNode("Node 2", this.root1);
		/*    */
		/* 47 */ DefaultTreeNode defaultTreeNode4 = new DefaultTreeNode("Node 0.0", (TreeNode) defaultTreeNode1);
		/* 48 */ DefaultTreeNode defaultTreeNode5 = new DefaultTreeNode("Node 0.1", (TreeNode) defaultTreeNode1);
		/*    */
		/* 50 */ DefaultTreeNode defaultTreeNode6 = new DefaultTreeNode("Node 1.0", (TreeNode) defaultTreeNode2);
		/* 51 */ DefaultTreeNode defaultTreeNode7 = new DefaultTreeNode("Node 1.1", (TreeNode) defaultTreeNode2);
		/*    */
		/* 53 */ DefaultTreeNode defaultTreeNode8 = new DefaultTreeNode("Node 0.0.0", (TreeNode) defaultTreeNode4);
		/* 54 */ DefaultTreeNode defaultTreeNode9 = new DefaultTreeNode("Node 0.0.1", (TreeNode) defaultTreeNode4);
		/* 55 */ DefaultTreeNode defaultTreeNode10 = new DefaultTreeNode("Node 0.1.0", (TreeNode) defaultTreeNode5);
		/*    */
		/* 57 */ DefaultTreeNode defaultTreeNode11 = new DefaultTreeNode("Node 1.0.0", (TreeNode) defaultTreeNode6);
		/*    */
		/* 59 */ this.root2 = (TreeNode) new DefaultTreeNode("Root2", null);
		/* 60 */ DefaultTreeNode defaultTreeNode12 = new DefaultTreeNode("Item 0", this.root2);
		/* 61 */ DefaultTreeNode defaultTreeNode13 = new DefaultTreeNode("Item 1", this.root2);
		/* 62 */ DefaultTreeNode defaultTreeNode14 = new DefaultTreeNode("Item 2", this.root2);
		/*    */
		/* 64 */ DefaultTreeNode defaultTreeNode15 = new DefaultTreeNode("Item 0.0", (TreeNode) defaultTreeNode12);
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot1() {
		/* 68 */ return this.root1;
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot2() {
		/* 72 */ return this.root2;
		/*    */ }

	/*    */
	/*    */ public TreeNode getSelectedNode1() {
		/* 76 */ return this.selectedNode1;
		/*    */ }

	/*    */
	/*    */ public void setSelectedNode1(TreeNode selectedNode1) {
		/* 80 */ this.selectedNode1 = selectedNode1;
		/*    */ }

	/*    */
	/*    */ public TreeNode getSelectedNode2() {
		/* 84 */ return this.selectedNode2;
		/*    */ }

	/*    */
	/*    */ public void setSelectedNode2(TreeNode selectedNode2) {
		/* 88 */ this.selectedNode2 = selectedNode2;
		/*    */ }

	/*    */
	/*    */ public void onDragDrop(TreeDragDropEvent event) {
		/* 92 */ TreeNode dragNode = event.getDragNode();
		/* 93 */ TreeNode dropNode = event.getDropNode();
		/* 94 */ int dropIndex = event.getDropIndex();
		/*    */
		/* 96 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Dragged " + dragNode.getData(),
				"Dropped on " + dropNode.getData() + " at " + dropIndex);
		/* 97 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\tree\DragDropView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */