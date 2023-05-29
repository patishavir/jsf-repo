/*    */
package org.primefaces.showcase.view.data.treetable;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import org.primefaces.model.DefaultTreeNode;
/*    */ import org.primefaces.model.TreeNode;
/*    */ import org.primefaces.showcase.domain.Document;

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
/*    */ @ManagedBean(name = "ttPaginatorView")
/*    */ @ViewScoped
/*    */ public class PaginatorView/*    */ implements Serializable
/*    */ {
	/*    */ private TreeNode root;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 34 */ this.root = (TreeNode) new DefaultTreeNode();
		/*    */
		/* 36 */ for (int i = 0; i < 50; i++) {
			/* 37 */ DefaultTreeNode defaultTreeNode = new DefaultTreeNode(
					new Document("Node " + i, String.valueOf((int) (Math.random() * 1000.0D)), "Document"), this.root);
			/*    */
			/* 39 */ for (int j = 0; j < 5; j++) {
				/* 40 */ new DefaultTreeNode(new Document("Node " + i + "." + j,
						String.valueOf((int) (Math.random() * 1000.0D)), "Document"), (TreeNode) defaultTreeNode);
				/*    */ }
			/*    */ }
		/*    */ }

	/*    */
	/*    */ public TreeNode getRoot() {
		/* 46 */ return this.root;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\treetable\PaginatorView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */