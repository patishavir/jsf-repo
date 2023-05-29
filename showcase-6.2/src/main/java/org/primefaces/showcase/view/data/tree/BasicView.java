/*    */
package org.primefaces.showcase.view.data.tree;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
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
/*    */ @ManagedBean(name = "treeBasicView")
/*    */ @ViewScoped
/*    */ public class BasicView/*    */ implements Serializable
/*    */ {
	/*    */ private TreeNode root;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 33 */ this.root = (TreeNode) new DefaultTreeNode("Root", null);
		/* 34 */ DefaultTreeNode defaultTreeNode1 = new DefaultTreeNode("Node 0", this.root);
		/* 35 */ DefaultTreeNode defaultTreeNode2 = new DefaultTreeNode("Node 1", this.root);
		/*    */
		/* 37 */ DefaultTreeNode defaultTreeNode3 = new DefaultTreeNode("Node 0.0", (TreeNode) defaultTreeNode1);
		/* 38 */ DefaultTreeNode defaultTreeNode4 = new DefaultTreeNode("Node 0.1", (TreeNode) defaultTreeNode1);
		/*    */
		/* 40 */ DefaultTreeNode defaultTreeNode5 = new DefaultTreeNode("Node 1.0", (TreeNode) defaultTreeNode2);
		/*    */
		/* 42 */ defaultTreeNode2.getChildren().add(new DefaultTreeNode("Node 1.1"));
		/* 43 */ defaultTreeNode3.getChildren().add(new DefaultTreeNode("Node 0.0.0"));
		/* 44 */ defaultTreeNode3.getChildren().add(new DefaultTreeNode("Node 0.0.1"));
		/* 45 */ defaultTreeNode4.getChildren().add(new DefaultTreeNode("Node 0.1.0"));
		/* 46 */ defaultTreeNode5.getChildren().add(new DefaultTreeNode("Node 1.0.0"));
		/* 47 */ this.root.getChildren().add(new DefaultTreeNode("Node 2"));
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot() {
		/* 51 */ return this.root;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\tree\BasicView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */