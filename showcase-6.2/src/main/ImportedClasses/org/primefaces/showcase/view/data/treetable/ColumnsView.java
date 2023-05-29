/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.treetable;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
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
/*    */ @ManagedBean(name = "ttColumnsView")
/*    */ @ViewScoped
/*    */ public class ColumnsView
/*    */   implements Serializable
/*    */ {
/* 33 */   private static final List<String> VALID_COLUMN_KEYS = Arrays.asList(new String[] { "name", "size", "type" });
/*    */   
/* 35 */   private String columnTemplate = "name size type";
/*    */   
/*    */   private List<ColumnModel> columns;
/*    */   
/*    */   private TreeNode root;
/*    */   
/*    */   @ManagedProperty("#{documentService}")
/*    */   private DocumentService service;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 46 */     this.root = this.service.createDocuments();
/*    */     
/* 48 */     createDynamicColumns();
/*    */   }
/*    */   
/*    */   public TreeNode getRoot() {
/* 52 */     return this.root;
/*    */   }
/*    */   
/*    */   public void setService(DocumentService service) {
/* 56 */     this.service = service;
/*    */   }
/*    */   
/*    */   public void createDynamicColumns() {
/* 60 */     String[] columnKeys = this.columnTemplate.split(" ");
/* 61 */     this.columns = new ArrayList<ColumnModel>();
/*    */     
/* 63 */     for (String columnKey : columnKeys) {
/* 64 */       String key = columnKey.trim();
/*    */       
/* 66 */       if (VALID_COLUMN_KEYS.contains(key)) {
/* 67 */         this.columns.add(new ColumnModel(columnKey.toUpperCase(), columnKey));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public String getColumnTemplate() {
/* 73 */     return this.columnTemplate;
/*    */   }
/*    */   
/*    */   public void setColumnTemplate(String columnTemplate) {
/* 77 */     this.columnTemplate = columnTemplate;
/*    */   }
/*    */   
/*    */   public List<ColumnModel> getColumns() {
/* 81 */     return this.columns;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\treetable\ColumnsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */