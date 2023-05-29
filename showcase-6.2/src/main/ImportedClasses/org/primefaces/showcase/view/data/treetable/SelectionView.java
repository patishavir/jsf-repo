/*     */ package WEB-INF.classes.org.primefaces.showcase.view.data.treetable;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ManagedProperty;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.model.TreeNode;
/*     */ import org.primefaces.showcase.service.DocumentService;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ManagedBean(name = "ttSelectionView")
/*     */ @ViewScoped
/*     */ public class SelectionView
/*     */   implements Serializable
/*     */ {
/*     */   private TreeNode root1;
/*     */   private TreeNode root2;
/*     */   private TreeNode root3;
/*     */   private TreeNode selectedNode;
/*     */   private TreeNode[] selectedNodes1;
/*     */   private TreeNode[] selectedNodes2;
/*     */   @ManagedProperty("#{documentService}")
/*     */   private DocumentService service;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  44 */     this.root1 = this.service.createDocuments();
/*  45 */     this.root2 = this.service.createDocuments();
/*  46 */     this.root3 = this.service.createCheckboxDocuments();
/*     */   }
/*     */   
/*     */   public TreeNode getRoot1() {
/*  50 */     return this.root1;
/*     */   }
/*     */   
/*     */   public TreeNode getRoot2() {
/*  54 */     return this.root2;
/*     */   }
/*     */   
/*     */   public TreeNode getRoot3() {
/*  58 */     return this.root3;
/*     */   }
/*     */   
/*     */   public TreeNode getSelectedNode() {
/*  62 */     return this.selectedNode;
/*     */   }
/*     */   
/*     */   public void setSelectedNode(TreeNode selectedNode) {
/*  66 */     this.selectedNode = selectedNode;
/*     */   }
/*     */   
/*     */   public TreeNode[] getSelectedNodes1() {
/*  70 */     return this.selectedNodes1;
/*     */   }
/*     */   
/*     */   public void setSelectedNodes1(TreeNode[] selectedNodes1) {
/*  74 */     this.selectedNodes1 = selectedNodes1;
/*     */   }
/*     */   
/*     */   public TreeNode[] getSelectedNodes2() {
/*  78 */     return this.selectedNodes2;
/*     */   }
/*     */   
/*     */   public void setSelectedNodes2(TreeNode[] selectedNodes2) {
/*  82 */     this.selectedNodes2 = selectedNodes2;
/*     */   }
/*     */   
/*     */   public void setService(DocumentService service) {
/*  86 */     this.service = service;
/*     */   }
/*     */   
/*     */   public void displaySelectedSingle() {
/*  90 */     if (this.selectedNode != null) {
/*  91 */       FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", this.selectedNode.getData().toString());
/*  92 */       FacesContext.getCurrentInstance().addMessage(null, message);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void displaySelectedMultiple(TreeNode[] nodes) {
/*  97 */     if (nodes != null && nodes.length > 0) {
/*  98 */       StringBuilder builder = new StringBuilder();
/*     */       
/* 100 */       for (TreeNode node : nodes) {
/* 101 */         builder.append(node.getData().toString());
/* 102 */         builder.append("<br />");
/*     */       } 
/*     */       
/* 105 */       FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", builder.toString());
/* 106 */       FacesContext.getCurrentInstance().addMessage(null, message);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\treetable\SelectionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */