/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.tree;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
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
/*    */ @ManagedBean(name = "treeContextMenuView")
/*    */ @ViewScoped
/*    */ public class ContextMenuView
/*    */   implements Serializable
/*    */ {
/*    */   private TreeNode root;
/*    */   private TreeNode selectedNode;
/*    */   @ManagedProperty("#{documentService}")
/*    */   private DocumentService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 41 */     this.root = this.service.createDocuments();
/*    */   }
/*    */   
/*    */   public TreeNode getRoot() {
/* 45 */     return this.root;
/*    */   }
/*    */   
/*    */   public TreeNode getSelectedNode() {
/* 49 */     return this.selectedNode;
/*    */   }
/*    */   
/*    */   public void setSelectedNode(TreeNode selectedNode) {
/* 53 */     this.selectedNode = selectedNode;
/*    */   }
/*    */   
/*    */   public void setService(DocumentService service) {
/* 57 */     this.service = service;
/*    */   }
/*    */   
/*    */   public void displaySelectedSingle() {
/* 61 */     if (this.selectedNode != null) {
/* 62 */       FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", this.selectedNode.getData().toString());
/* 63 */       FacesContext.getCurrentInstance().addMessage(null, message);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void deleteNode() {
/* 68 */     this.selectedNode.getChildren().clear();
/* 69 */     this.selectedNode.getParent().getChildren().remove(this.selectedNode);
/* 70 */     this.selectedNode.setParent(null);
/*    */     
/* 72 */     this.selectedNode = null;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\tree\ContextMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */