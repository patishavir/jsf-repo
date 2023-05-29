/*    */ package WEB-INF.classes.org.primefaces.showcase.service;
/*    */ 
/*    */ import javax.faces.bean.ApplicationScoped;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import org.primefaces.model.CheckboxTreeNode;
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
/*    */ 
/*    */ @ManagedBean(name = "documentService")
/*    */ @ApplicationScoped
/*    */ public class DocumentService
/*    */ {
/*    */   public TreeNode createDocuments() {
/* 30 */     DefaultTreeNode defaultTreeNode1 = new DefaultTreeNode(new Document("Files", "-", "Folder"), null);
/*    */     
/* 32 */     DefaultTreeNode defaultTreeNode2 = new DefaultTreeNode(new Document("Documents", "-", "Folder"), (TreeNode)defaultTreeNode1);
/* 33 */     DefaultTreeNode defaultTreeNode3 = new DefaultTreeNode(new Document("Pictures", "-", "Folder"), (TreeNode)defaultTreeNode1);
/* 34 */     DefaultTreeNode defaultTreeNode4 = new DefaultTreeNode(new Document("Movies", "-", "Folder"), (TreeNode)defaultTreeNode1);
/*    */     
/* 36 */     DefaultTreeNode defaultTreeNode5 = new DefaultTreeNode(new Document("Work", "-", "Folder"), (TreeNode)defaultTreeNode2);
/* 37 */     DefaultTreeNode defaultTreeNode6 = new DefaultTreeNode(new Document("PrimeFaces", "-", "Folder"), (TreeNode)defaultTreeNode2);
/*    */ 
/*    */     
/* 40 */     DefaultTreeNode defaultTreeNode7 = new DefaultTreeNode("document", new Document("Expenses.doc", "30 KB", "Word Document"), (TreeNode)defaultTreeNode5);
/* 41 */     DefaultTreeNode defaultTreeNode8 = new DefaultTreeNode("document", new Document("Resume.doc", "10 KB", "Word Document"), (TreeNode)defaultTreeNode5);
/* 42 */     DefaultTreeNode defaultTreeNode9 = new DefaultTreeNode("document", new Document("RefDoc.pages", "40 KB", "Pages Document"), (TreeNode)defaultTreeNode6);
/*    */ 
/*    */     
/* 45 */     DefaultTreeNode defaultTreeNode10 = new DefaultTreeNode("picture", new Document("barcelona.jpg", "30 KB", "JPEG Image"), (TreeNode)defaultTreeNode3);
/* 46 */     DefaultTreeNode defaultTreeNode11 = new DefaultTreeNode("picture", new Document("logo.jpg", "45 KB", "JPEG Image"), (TreeNode)defaultTreeNode3);
/* 47 */     DefaultTreeNode defaultTreeNode12 = new DefaultTreeNode("picture", new Document("optimusprime.png", "96 KB", "PNG Image"), (TreeNode)defaultTreeNode3);
/*    */ 
/*    */     
/* 50 */     DefaultTreeNode defaultTreeNode13 = new DefaultTreeNode(new Document("Al Pacino", "-", "Folder"), (TreeNode)defaultTreeNode4);
/* 51 */     DefaultTreeNode defaultTreeNode14 = new DefaultTreeNode(new Document("Robert De Niro", "-", "Folder"), (TreeNode)defaultTreeNode4);
/*    */     
/* 53 */     DefaultTreeNode defaultTreeNode15 = new DefaultTreeNode("mp3", new Document("Scarface", "15 GB", "Movie File"), (TreeNode)defaultTreeNode13);
/* 54 */     DefaultTreeNode defaultTreeNode16 = new DefaultTreeNode("mp3", new Document("Carlitos' Way", "24 GB", "Movie File"), (TreeNode)defaultTreeNode13);
/*    */     
/* 56 */     DefaultTreeNode defaultTreeNode17 = new DefaultTreeNode("mp3", new Document("Goodfellas", "23 GB", "Movie File"), (TreeNode)defaultTreeNode14);
/* 57 */     DefaultTreeNode defaultTreeNode18 = new DefaultTreeNode("mp3", new Document("Untouchables", "17 GB", "Movie File"), (TreeNode)defaultTreeNode14);
/*    */     
/* 59 */     return (TreeNode)defaultTreeNode1;
/*    */   }
/*    */   
/*    */   public TreeNode createCheckboxDocuments() {
/* 63 */     CheckboxTreeNode checkboxTreeNode1 = new CheckboxTreeNode(new Document("Files", "-", "Folder"), null);
/*    */     
/* 65 */     CheckboxTreeNode checkboxTreeNode2 = new CheckboxTreeNode(new Document("Documents", "-", "Folder"), (TreeNode)checkboxTreeNode1);
/* 66 */     CheckboxTreeNode checkboxTreeNode3 = new CheckboxTreeNode(new Document("Pictures", "-", "Folder"), (TreeNode)checkboxTreeNode1);
/* 67 */     CheckboxTreeNode checkboxTreeNode4 = new CheckboxTreeNode(new Document("Movies", "-", "Folder"), (TreeNode)checkboxTreeNode1);
/*    */     
/* 69 */     CheckboxTreeNode checkboxTreeNode5 = new CheckboxTreeNode(new Document("Work", "-", "Folder"), (TreeNode)checkboxTreeNode2);
/* 70 */     CheckboxTreeNode checkboxTreeNode6 = new CheckboxTreeNode(new Document("PrimeFaces", "-", "Folder"), (TreeNode)checkboxTreeNode2);
/*    */ 
/*    */     
/* 73 */     CheckboxTreeNode checkboxTreeNode7 = new CheckboxTreeNode("document", new Document("Expenses.doc", "30 KB", "Word Document"), (TreeNode)checkboxTreeNode5);
/* 74 */     CheckboxTreeNode checkboxTreeNode8 = new CheckboxTreeNode("document", new Document("Resume.doc", "10 KB", "Word Document"), (TreeNode)checkboxTreeNode5);
/* 75 */     CheckboxTreeNode checkboxTreeNode9 = new CheckboxTreeNode("document", new Document("RefDoc.pages", "40 KB", "Pages Document"), (TreeNode)checkboxTreeNode6);
/*    */ 
/*    */     
/* 78 */     CheckboxTreeNode checkboxTreeNode10 = new CheckboxTreeNode("picture", new Document("barcelona.jpg", "30 KB", "JPEG Image"), (TreeNode)checkboxTreeNode3);
/* 79 */     CheckboxTreeNode checkboxTreeNode11 = new CheckboxTreeNode("picture", new Document("logo.jpg", "45 KB", "JPEG Image"), (TreeNode)checkboxTreeNode3);
/* 80 */     CheckboxTreeNode checkboxTreeNode12 = new CheckboxTreeNode("picture", new Document("optimusprime.png", "96 KB", "PNG Image"), (TreeNode)checkboxTreeNode3);
/*    */ 
/*    */     
/* 83 */     CheckboxTreeNode checkboxTreeNode13 = new CheckboxTreeNode(new Document("Al Pacino", "-", "Folder"), (TreeNode)checkboxTreeNode4);
/* 84 */     CheckboxTreeNode checkboxTreeNode14 = new CheckboxTreeNode(new Document("Robert De Niro", "-", "Folder"), (TreeNode)checkboxTreeNode4);
/*    */     
/* 86 */     CheckboxTreeNode checkboxTreeNode15 = new CheckboxTreeNode("mp3", new Document("Scarface", "15 GB", "Movie File"), (TreeNode)checkboxTreeNode13);
/* 87 */     CheckboxTreeNode checkboxTreeNode16 = new CheckboxTreeNode("mp3", new Document("Carlitos' Way", "24 GB", "Movie File"), (TreeNode)checkboxTreeNode13);
/*    */     
/* 89 */     CheckboxTreeNode checkboxTreeNode17 = new CheckboxTreeNode("mp3", new Document("Goodfellas", "23 GB", "Movie File"), (TreeNode)checkboxTreeNode14);
/* 90 */     CheckboxTreeNode checkboxTreeNode18 = new CheckboxTreeNode("mp3", new Document("Untouchables", "17 GB", "Movie File"), (TreeNode)checkboxTreeNode14);
/*    */     
/* 92 */     return (TreeNode)checkboxTreeNode1;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\service\DocumentService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */