/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.UUID;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import org.primefaces.event.SelectEvent;
/*    */ import org.primefaces.model.mindmap.DefaultMindmapNode;
/*    */ import org.primefaces.model.mindmap.MindmapNode;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @ManagedBean
/*    */ public class MindmapView
/*    */   implements Serializable
/*    */ {
/* 34 */   private MindmapNode root = (MindmapNode)new DefaultMindmapNode("google.com", "Google WebSite", "FFCC00", false);
/*    */   public MindmapView() {
/* 36 */     DefaultMindmapNode defaultMindmapNode1 = new DefaultMindmapNode("IPs", "IP Numbers", "6e9ebf", true);
/* 37 */     DefaultMindmapNode defaultMindmapNode2 = new DefaultMindmapNode("NS(s)", "Namespaces", "6e9ebf", true);
/* 38 */     DefaultMindmapNode defaultMindmapNode3 = new DefaultMindmapNode("Malware", "Malicious Software", "6e9ebf", true);
/*    */     
/* 40 */     this.root.addNode((MindmapNode)defaultMindmapNode1);
/* 41 */     this.root.addNode((MindmapNode)defaultMindmapNode2);
/* 42 */     this.root.addNode((MindmapNode)defaultMindmapNode3);
/*    */   }
/*    */   private MindmapNode selectedNode;
/*    */   public MindmapNode getRoot() {
/* 46 */     return this.root;
/*    */   }
/*    */   
/*    */   public MindmapNode getSelectedNode() {
/* 50 */     return this.selectedNode;
/*    */   }
/*    */   public void setSelectedNode(MindmapNode selectedNode) {
/* 53 */     this.selectedNode = selectedNode;
/*    */   }
/*    */   
/*    */   public void onNodeSelect(SelectEvent event) {
/* 57 */     MindmapNode node = (MindmapNode)event.getObject();
/*    */ 
/*    */     
/* 60 */     if (node.getChildren().isEmpty()) {
/* 61 */       Object label = node.getLabel();
/*    */       
/* 63 */       if (label.equals("NS(s)")) {
/* 64 */         for (int i = 0; i < 25; i++) {
/* 65 */           node.addNode((MindmapNode)new DefaultMindmapNode("ns" + i + ".google.com", "Namespace " + i + " of Google", "82c542", false));
/*    */         }
/*    */       }
/* 68 */       else if (label.equals("IPs")) {
/* 69 */         for (int i = 0; i < 18; i++) {
/* 70 */           node.addNode((MindmapNode)new DefaultMindmapNode("1.1.1." + i, "IP Number: 1.1.1." + i, "fce24f", false));
/*    */         }
/*    */       }
/* 73 */       else if (label.equals("Malware")) {
/* 74 */         for (int i = 0; i < 18; i++) {
/* 75 */           String random = UUID.randomUUID().toString();
/* 76 */           node.addNode((MindmapNode)new DefaultMindmapNode("Malware-" + random, "Malicious Software: " + random, "3399ff", false));
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void onNodeDblselect(SelectEvent event) {
/* 83 */     this.selectedNode = (MindmapNode)event.getObject();
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\MindmapView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */