/*     */ package WEB-INF.classes.org.primefaces.showcase.view.data.diagram;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.PrimeFaces;
/*     */ import org.primefaces.event.diagram.ConnectEvent;
/*     */ import org.primefaces.event.diagram.ConnectionChangeEvent;
/*     */ import org.primefaces.event.diagram.DisconnectEvent;
/*     */ import org.primefaces.model.diagram.DefaultDiagramModel;
/*     */ import org.primefaces.model.diagram.DiagramModel;
/*     */ import org.primefaces.model.diagram.Element;
/*     */ import org.primefaces.model.diagram.connector.Connector;
/*     */ import org.primefaces.model.diagram.connector.StraightConnector;
/*     */ import org.primefaces.model.diagram.endpoint.DotEndPoint;
/*     */ import org.primefaces.model.diagram.endpoint.EndPoint;
/*     */ import org.primefaces.model.diagram.endpoint.EndPointAnchor;
/*     */ import org.primefaces.model.diagram.endpoint.RectangleEndPoint;
/*     */ import org.primefaces.model.diagram.overlay.ArrowOverlay;
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
/*     */ @ManagedBean(name = "diagramEditableView")
/*     */ @ViewScoped
/*     */ public class EditableView
/*     */   implements Serializable
/*     */ {
/*     */   private DefaultDiagramModel model;
/*     */   private boolean suspendEvent;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  49 */     this.model = new DefaultDiagramModel();
/*  50 */     this.model.setMaxConnections(-1);
/*     */     
/*  52 */     this.model.getDefaultConnectionOverlays().add(new ArrowOverlay(20, 20, 1.0D, 1));
/*  53 */     StraightConnector connector = new StraightConnector();
/*  54 */     connector.setPaintStyle("{strokeStyle:'#98AFC7', lineWidth:3}");
/*  55 */     connector.setHoverPaintStyle("{strokeStyle:'#5C738B'}");
/*  56 */     this.model.setDefaultConnector((Connector)connector);
/*     */     
/*  58 */     Element computerA = new Element(new NetworkElement(this, "Computer A", "computer-icon.png"), "10em", "6em");
/*  59 */     EndPoint endPointCA = createRectangleEndPoint(EndPointAnchor.BOTTOM);
/*  60 */     endPointCA.setSource(true);
/*  61 */     computerA.addEndPoint(endPointCA);
/*     */     
/*  63 */     Element computerB = new Element(new NetworkElement(this, "Computer B", "computer-icon.png"), "25em", "6em");
/*  64 */     EndPoint endPointCB = createRectangleEndPoint(EndPointAnchor.BOTTOM);
/*  65 */     endPointCB.setSource(true);
/*  66 */     computerB.addEndPoint(endPointCB);
/*     */     
/*  68 */     Element computerC = new Element(new NetworkElement(this, "Computer C", "computer-icon.png"), "40em", "6em");
/*  69 */     EndPoint endPointCC = createRectangleEndPoint(EndPointAnchor.BOTTOM);
/*  70 */     endPointCC.setSource(true);
/*  71 */     computerC.addEndPoint(endPointCC);
/*     */     
/*  73 */     Element serverA = new Element(new NetworkElement(this, "Server A", "server-icon.png"), "15em", "24em");
/*  74 */     EndPoint endPointSA = createDotEndPoint(EndPointAnchor.AUTO_DEFAULT);
/*  75 */     serverA.setDraggable(false);
/*  76 */     endPointSA.setTarget(true);
/*  77 */     serverA.addEndPoint(endPointSA);
/*     */     
/*  79 */     Element serverB = new Element(new NetworkElement(this, "Server B", "server-icon.png"), "35em", "24em");
/*  80 */     EndPoint endPointSB = createDotEndPoint(EndPointAnchor.AUTO_DEFAULT);
/*  81 */     serverB.setDraggable(false);
/*  82 */     endPointSB.setTarget(true);
/*  83 */     serverB.addEndPoint(endPointSB);
/*     */     
/*  85 */     this.model.addElement(computerA);
/*  86 */     this.model.addElement(computerB);
/*  87 */     this.model.addElement(computerC);
/*  88 */     this.model.addElement(serverA);
/*  89 */     this.model.addElement(serverB);
/*     */   }
/*     */   
/*     */   public DiagramModel getModel() {
/*  93 */     return (DiagramModel)this.model;
/*     */   }
/*     */   
/*     */   public void onConnect(ConnectEvent event) {
/*  97 */     if (!this.suspendEvent) {
/*     */       
/*  99 */       FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Connected", "From " + event.getSourceElement().getData() + " To " + event.getTargetElement().getData());
/*     */       
/* 101 */       FacesContext.getCurrentInstance().addMessage(null, msg);
/*     */       
/* 103 */       PrimeFaces.current().ajax().update(new String[] { "form:msgs" });
/*     */     } else {
/*     */       
/* 106 */       this.suspendEvent = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDisconnect(DisconnectEvent event) {
/* 112 */     FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Disconnected", "From " + event.getSourceElement().getData() + " To " + event.getTargetElement().getData());
/*     */     
/* 114 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*     */     
/* 116 */     PrimeFaces.current().ajax().update(new String[] { "form:msgs" });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnectionChange(ConnectionChangeEvent event) {
/* 124 */     FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Connection Changed", "Original Source:" + event.getOriginalSourceElement().getData() + ", New Source: " + event.getNewSourceElement().getData() + ", Original Target: " + event.getOriginalTargetElement().getData() + ", New Target: " + event.getNewTargetElement().getData());
/*     */     
/* 126 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*     */     
/* 128 */     PrimeFaces.current().ajax().update(new String[] { "form:msgs" });
/* 129 */     this.suspendEvent = true;
/*     */   }
/*     */   
/*     */   private EndPoint createDotEndPoint(EndPointAnchor anchor) {
/* 133 */     DotEndPoint endPoint = new DotEndPoint(anchor);
/* 134 */     endPoint.setScope("network");
/* 135 */     endPoint.setTarget(true);
/* 136 */     endPoint.setStyle("{fillStyle:'#98AFC7'}");
/* 137 */     endPoint.setHoverStyle("{fillStyle:'#5C738B'}");
/*     */     
/* 139 */     return (EndPoint)endPoint;
/*     */   }
/*     */   
/*     */   private EndPoint createRectangleEndPoint(EndPointAnchor anchor) {
/* 143 */     RectangleEndPoint endPoint = new RectangleEndPoint(anchor);
/* 144 */     endPoint.setScope("network");
/* 145 */     endPoint.setSource(true);
/* 146 */     endPoint.setStyle("{fillStyle:'#98AFC7'}");
/* 147 */     endPoint.setHoverStyle("{fillStyle:'#5C738B'}");
/*     */     
/* 149 */     return (EndPoint)endPoint;
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\diagram\EditableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */