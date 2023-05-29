/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.diagram;
/*    */ 
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.RequestScoped;
/*    */ import org.primefaces.model.diagram.Connection;
/*    */ import org.primefaces.model.diagram.DefaultDiagramModel;
/*    */ import org.primefaces.model.diagram.DiagramModel;
/*    */ import org.primefaces.model.diagram.Element;
/*    */ import org.primefaces.model.diagram.connector.Connector;
/*    */ import org.primefaces.model.diagram.connector.StateMachineConnector;
/*    */ import org.primefaces.model.diagram.endpoint.BlankEndPoint;
/*    */ import org.primefaces.model.diagram.endpoint.EndPoint;
/*    */ import org.primefaces.model.diagram.endpoint.EndPointAnchor;
/*    */ import org.primefaces.model.diagram.overlay.ArrowOverlay;
/*    */ import org.primefaces.model.diagram.overlay.LabelOverlay;
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
/*    */ @ManagedBean(name = "diagramStateMachineView")
/*    */ @RequestScoped
/*    */ public class StateMachineView
/*    */ {
/*    */   private DefaultDiagramModel model;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 40 */     this.model = new DefaultDiagramModel();
/* 41 */     this.model.setMaxConnections(-1);
/*    */     
/* 43 */     StateMachineConnector connector = new StateMachineConnector();
/* 44 */     connector.setOrientation(StateMachineConnector.Orientation.ANTICLOCKWISE);
/* 45 */     connector.setPaintStyle("{strokeStyle:'#7D7463',lineWidth:3}");
/* 46 */     this.model.setDefaultConnector((Connector)connector);
/*    */     
/* 48 */     Element start = new Element(null, "15em", "5em");
/* 49 */     start.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.BOTTOM));
/* 50 */     start.setStyleClass("start-node");
/*    */     
/* 52 */     Element idle = new Element("Idle", "10em", "20em");
/* 53 */     idle.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.TOP));
/* 54 */     idle.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.BOTTOM_RIGHT));
/* 55 */     idle.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.BOTTOM_LEFT));
/*    */     
/* 57 */     Element turnedOn = new Element("TurnedOn", "10em", "35em");
/* 58 */     turnedOn.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.TOP));
/* 59 */     turnedOn.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.RIGHT));
/* 60 */     turnedOn.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.BOTTOM_RIGHT));
/*    */     
/* 62 */     Element activity = new Element("Activity", "45em", "35em");
/* 63 */     activity.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.LEFT));
/* 64 */     activity.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.BOTTOM_LEFT));
/* 65 */     activity.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.TOP));
/* 66 */     activity.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.TOP_RIGHT));
/* 67 */     activity.addEndPoint((EndPoint)new BlankEndPoint(EndPointAnchor.TOP_LEFT));
/*    */     
/* 69 */     this.model.addElement(start);
/* 70 */     this.model.addElement(idle);
/* 71 */     this.model.addElement(turnedOn);
/* 72 */     this.model.addElement(activity);
/*    */     
/* 74 */     this.model.connect(createConnection(start.getEndPoints().get(0), idle.getEndPoints().get(0), null));
/* 75 */     this.model.connect(createConnection(idle.getEndPoints().get(1), turnedOn.getEndPoints().get(0), "Turn On"));
/* 76 */     this.model.connect(createConnection(turnedOn.getEndPoints().get(0), idle.getEndPoints().get(2), "Turn Off"));
/* 77 */     this.model.connect(createConnection(turnedOn.getEndPoints().get(1), activity.getEndPoints().get(0), null));
/* 78 */     this.model.connect(createConnection(activity.getEndPoints().get(1), turnedOn.getEndPoints().get(2), "Request Turn Off"));
/* 79 */     this.model.connect(createConnection(activity.getEndPoints().get(2), activity.getEndPoints().get(2), "Talk"));
/* 80 */     this.model.connect(createConnection(activity.getEndPoints().get(3), activity.getEndPoints().get(3), "Run"));
/* 81 */     this.model.connect(createConnection(activity.getEndPoints().get(4), activity.getEndPoints().get(4), "Walk"));
/*    */   }
/*    */   
/*    */   public DiagramModel getModel() {
/* 85 */     return (DiagramModel)this.model;
/*    */   }
/*    */   
/*    */   private Connection createConnection(EndPoint from, EndPoint to, String label) {
/* 89 */     Connection conn = new Connection(from, to);
/* 90 */     conn.getOverlays().add(new ArrowOverlay(20, 20, 1.0D, 1));
/*    */     
/* 92 */     if (label != null) {
/* 93 */       conn.getOverlays().add(new LabelOverlay(label, "flow-label", 0.5D));
/*    */     }
/*    */     
/* 96 */     return conn;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\diagram\StateMachineView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */