/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.treetable;
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
/*    */ @ManagedBean(name = "ttScrollableView")
/*    */ @ViewScoped
/*    */ public class ScrollableView
/*    */   implements Serializable
/*    */ {
/*    */   private TreeNode root1;
/*    */   private TreeNode root2;
/*    */   private TreeNode root3;
/*    */   @ManagedProperty("#{documentService}")
/*    */   private DocumentService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 39 */     this.root1 = this.service.createDocuments();
/* 40 */     this.root2 = this.service.createDocuments();
/* 41 */     this.root3 = this.service.createDocuments();
/*    */     
/* 43 */     ((TreeNode)this.root1.getChildren().get(0)).setExpanded(true);
/* 44 */     ((TreeNode)this.root1.getChildren().get(1)).setExpanded(true);
/*    */   }
/*    */   
/*    */   public TreeNode getRoot1() {
/* 48 */     return this.root1;
/*    */   }
/*    */   
/*    */   public TreeNode getRoot2() {
/* 52 */     return this.root2;
/*    */   }
/*    */   
/*    */   public TreeNode getRoot3() {
/* 56 */     return this.root3;
/*    */   }
/*    */   
/*    */   public void setService(DocumentService service) {
/* 60 */     this.service = service;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\treetable\ScrollableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */