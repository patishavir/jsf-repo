/*     */ package WEB-INF.classes.org.primefaces.showcase.view.data;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.component.organigram.OrganigramHelper;
/*     */ import org.primefaces.event.organigram.OrganigramNodeCollapseEvent;
/*     */ import org.primefaces.event.organigram.OrganigramNodeDragDropEvent;
/*     */ import org.primefaces.event.organigram.OrganigramNodeExpandEvent;
/*     */ import org.primefaces.event.organigram.OrganigramNodeSelectEvent;
/*     */ import org.primefaces.model.DefaultOrganigramNode;
/*     */ import org.primefaces.model.OrganigramNode;
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
/*     */ @ManagedBean
/*     */ @ViewScoped
/*     */ public class OrganigramView
/*     */   implements Serializable
/*     */ {
/*     */   private OrganigramNode rootNode;
/*     */   private OrganigramNode selection;
/*     */   private boolean zoom = false;
/*  40 */   private String style = "width: 800px";
/*  41 */   private int leafNodeConnectorHeight = 0;
/*     */   
/*     */   private boolean autoScrollToSelection = false;
/*     */   private String employeeName;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  48 */     this.selection = (OrganigramNode)new DefaultOrganigramNode(null, "Ridvan Agar", null);
/*     */     
/*  50 */     this.rootNode = (OrganigramNode)new DefaultOrganigramNode("root", "CommerceBay GmbH", null);
/*  51 */     this.rootNode.setCollapsible(false);
/*  52 */     this.rootNode.setDroppable(true);
/*     */ 
/*     */     
/*  55 */     OrganigramNode softwareDevelopment = addDivision(this.rootNode, "Software Development", new String[] { "Ridvan Agar" });
/*     */     
/*  57 */     OrganigramNode teamJavaEE = addDivision(softwareDevelopment, "Team JavaEE", new String[0]);
/*  58 */     addDivision(teamJavaEE, "JSF", new String[] { "Thomas Andraschko" });
/*  59 */     addDivision(teamJavaEE, "Backend", new String[] { "Marie Louise" });
/*     */     
/*  61 */     OrganigramNode teamMobile = addDivision(softwareDevelopment, "Team Mobile", new String[0]);
/*  62 */     addDivision(teamMobile, "Android", new String[] { "Andy Ruby" });
/*  63 */     addDivision(teamMobile, "iOS", new String[] { "Stevan Jobs" });
/*     */     
/*  65 */     addDivision(this.rootNode, "Managed Services", new String[] { "Thorsten Schultze", "Sandra Becker" });
/*     */     
/*  67 */     OrganigramNode marketing = addDivision(this.rootNode, "Marketing", new String[0]);
/*  68 */     addDivision(marketing, "Social Media", new String[] { "Ali Mente", "Lisa Boehm" });
/*  69 */     addDivision(marketing, "Press", new String[] { "Michael Gmeiner", "Hans Peter" });
/*     */     
/*  71 */     addDivision(this.rootNode, "Management", new String[] { "Hassan El Manfalouty" });
/*     */   }
/*     */   
/*     */   protected OrganigramNode addDivision(OrganigramNode parent, String name, String... employees) {
/*  75 */     DefaultOrganigramNode defaultOrganigramNode = new DefaultOrganigramNode("division", name, parent);
/*  76 */     defaultOrganigramNode.setDroppable(true);
/*  77 */     defaultOrganigramNode.setDraggable(true);
/*  78 */     defaultOrganigramNode.setSelectable(true);
/*     */     
/*  80 */     if (employees != null) {
/*  81 */       for (String employee : employees) {
/*  82 */         DefaultOrganigramNode defaultOrganigramNode1 = new DefaultOrganigramNode("employee", employee, (OrganigramNode)defaultOrganigramNode);
/*  83 */         defaultOrganigramNode1.setDraggable(true);
/*  84 */         defaultOrganigramNode1.setSelectable(true);
/*     */       } 
/*     */     }
/*     */     
/*  88 */     return (OrganigramNode)defaultOrganigramNode;
/*     */   }
/*     */   
/*     */   public void nodeDragDropListener(OrganigramNodeDragDropEvent event) {
/*  92 */     FacesMessage message = new FacesMessage();
/*  93 */     message.setSummary("Node '" + event.getOrganigramNode().getData() + "' moved from " + event.getSourceOrganigramNode().getData() + " to '" + event.getTargetOrganigramNode().getData() + "'");
/*  94 */     message.setSeverity(FacesMessage.SEVERITY_INFO);
/*     */     
/*  96 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*     */   }
/*     */   
/*     */   public void nodeSelectListener(OrganigramNodeSelectEvent event) {
/* 100 */     FacesMessage message = new FacesMessage();
/* 101 */     message.setSummary("Node '" + event.getOrganigramNode().getData() + "' selected.");
/* 102 */     message.setSeverity(FacesMessage.SEVERITY_INFO);
/*     */     
/* 104 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*     */   }
/*     */   
/*     */   public void nodeCollapseListener(OrganigramNodeCollapseEvent event) {
/* 108 */     FacesMessage message = new FacesMessage();
/* 109 */     message.setSummary("Node '" + event.getOrganigramNode().getData() + "' collapsed.");
/* 110 */     message.setSeverity(FacesMessage.SEVERITY_INFO);
/*     */     
/* 112 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*     */   }
/*     */   
/*     */   public void nodeExpandListener(OrganigramNodeExpandEvent event) {
/* 116 */     FacesMessage message = new FacesMessage();
/* 117 */     message.setSummary("Node '" + event.getOrganigramNode().getData() + "' expanded.");
/* 118 */     message.setSeverity(FacesMessage.SEVERITY_INFO);
/*     */     
/* 120 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeDivision() {
/* 125 */     OrganigramNode currentSelection = OrganigramHelper.findTreeNode(this.rootNode, this.selection);
/* 126 */     setMessage(currentSelection.getData() + " will entfernt werden.", FacesMessage.SEVERITY_INFO);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeEmployee() {
/* 131 */     OrganigramNode currentSelection = OrganigramHelper.findTreeNode(this.rootNode, this.selection);
/* 132 */     currentSelection.getParent().getChildren().remove(currentSelection);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addEmployee() {
/* 137 */     OrganigramNode currentSelection = OrganigramHelper.findTreeNode(this.rootNode, this.selection);
/*     */     
/* 139 */     DefaultOrganigramNode defaultOrganigramNode = new DefaultOrganigramNode("employee", this.employeeName, currentSelection);
/* 140 */     defaultOrganigramNode.setDraggable(true);
/* 141 */     defaultOrganigramNode.setSelectable(true);
/*     */   }
/*     */   
/*     */   private void setMessage(String msg, FacesMessage.Severity severity) {
/* 145 */     FacesMessage message = new FacesMessage();
/* 146 */     message.setSummary(msg);
/* 147 */     message.setSeverity(severity);
/* 148 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*     */   }
/*     */   
/*     */   public OrganigramNode getRootNode() {
/* 152 */     return this.rootNode;
/*     */   }
/*     */   
/*     */   public void setRootNode(OrganigramNode rootNode) {
/* 156 */     this.rootNode = rootNode;
/*     */   }
/*     */   
/*     */   public OrganigramNode getSelection() {
/* 160 */     return this.selection;
/*     */   }
/*     */   
/*     */   public void setSelection(OrganigramNode selection) {
/* 164 */     this.selection = selection;
/*     */   }
/*     */   
/*     */   public boolean isZoom() {
/* 168 */     return this.zoom;
/*     */   }
/*     */   
/*     */   public void setZoom(boolean zoom) {
/* 172 */     this.zoom = zoom;
/*     */   }
/*     */   
/*     */   public String getEmployeeName() {
/* 176 */     return this.employeeName;
/*     */   }
/*     */   
/*     */   public void setEmployeeName(String employeeName) {
/* 180 */     this.employeeName = employeeName;
/*     */   }
/*     */   
/*     */   public String getStyle() {
/* 184 */     return this.style;
/*     */   }
/*     */   
/*     */   public void setStyle(String style) {
/* 188 */     this.style = style;
/*     */   }
/*     */   
/*     */   public int getLeafNodeConnectorHeight() {
/* 192 */     return this.leafNodeConnectorHeight;
/*     */   }
/*     */   
/*     */   public void setLeafNodeConnectorHeight(int leafNodeConnectorHeight) {
/* 196 */     this.leafNodeConnectorHeight = leafNodeConnectorHeight;
/*     */   }
/*     */   
/*     */   public boolean isAutoScrollToSelection() {
/* 200 */     return this.autoScrollToSelection;
/*     */   }
/*     */   
/*     */   public void setAutoScrollToSelection(boolean autoScrollToSelection) {
/* 204 */     this.autoScrollToSelection = autoScrollToSelection;
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\OrganigramView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */