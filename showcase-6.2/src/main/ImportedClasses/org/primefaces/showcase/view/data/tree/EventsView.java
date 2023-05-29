/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.tree;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.NodeCollapseEvent;
/*    */ import org.primefaces.event.NodeExpandEvent;
/*    */ import org.primefaces.event.NodeSelectEvent;
/*    */ import org.primefaces.event.NodeUnselectEvent;
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
/*    */ @ManagedBean(name = "treeEventsView")
/*    */ @ViewScoped
/*    */ public class EventsView
/*    */   implements Serializable
/*    */ {
/*    */   private TreeNode root;
/*    */   private TreeNode selectedNode;
/*    */   @ManagedProperty("#{documentService}")
/*    */   private DocumentService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 45 */     this.root = this.service.createDocuments();
/*    */   }
/*    */   
/*    */   public TreeNode getRoot() {
/* 49 */     return this.root;
/*    */   }
/*    */   
/*    */   public TreeNode getSelectedNode() {
/* 53 */     return this.selectedNode;
/*    */   }
/*    */   
/*    */   public void setSelectedNode(TreeNode selectedNode) {
/* 57 */     this.selectedNode = selectedNode;
/*    */   }
/*    */   
/*    */   public void setService(DocumentService service) {
/* 61 */     this.service = service;
/*    */   }
/*    */   
/*    */   public void onNodeExpand(NodeExpandEvent event) {
/* 65 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Expanded", event.getTreeNode().toString());
/* 66 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*    */   }
/*    */   
/*    */   public void onNodeCollapse(NodeCollapseEvent event) {
/* 70 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Collapsed", event.getTreeNode().toString());
/* 71 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*    */   }
/*    */   
/*    */   public void onNodeSelect(NodeSelectEvent event) {
/* 75 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", event.getTreeNode().toString());
/* 76 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*    */   }
/*    */   
/*    */   public void onNodeUnselect(NodeUnselectEvent event) {
/* 80 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Unselected", event.getTreeNode().toString());
/* 81 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\tree\EventsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */