/*    */ package WEB-INF.classes.org.primefaces.showcase.view.data.diagram;
/*    */ 
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.RequestScoped;
/*    */ import org.primefaces.model.diagram.Connection;
/*    */ import org.primefaces.model.diagram.DefaultDiagramModel;
/*    */ import org.primefaces.model.diagram.DiagramModel;
/*    */ import org.primefaces.model.diagram.Element;
/*    */ import org.primefaces.model.diagram.endpoint.DotEndPoint;
/*    */ import org.primefaces.model.diagram.endpoint.EndPoint;
/*    */ import org.primefaces.model.diagram.endpoint.EndPointAnchor;
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
/*    */ @ManagedBean(name = "diagramBasicView")
/*    */ @RequestScoped
/*    */ public class BasicView
/*    */ {
/*    */   private DefaultDiagramModel model;
/*    */   
/*    */   @PostConstruct
/*    */   public void init() {
/* 36 */     this.model = new DefaultDiagramModel();
/* 37 */     this.model.setMaxConnections(-1);
/* 38 */     this.model.setConnectionsDetachable(false);
/*    */     
/* 40 */     Element elementA = new Element("A", "20em", "6em");
/* 41 */     elementA.addEndPoint((EndPoint)new DotEndPoint(EndPointAnchor.BOTTOM));
/*    */     
/* 43 */     Element elementB = new Element("B", "10em", "18em");
/* 44 */     elementB.addEndPoint((EndPoint)new DotEndPoint(EndPointAnchor.TOP));
/*    */     
/* 46 */     Element elementC = new Element("C", "40em", "18em");
/* 47 */     elementC.addEndPoint((EndPoint)new DotEndPoint(EndPointAnchor.TOP));
/*    */     
/* 49 */     this.model.addElement(elementA);
/* 50 */     this.model.addElement(elementB);
/* 51 */     this.model.addElement(elementC);
/*    */     
/* 53 */     this.model.connect(new Connection(elementA.getEndPoints().get(0), elementB.getEndPoints().get(0)));
/* 54 */     this.model.connect(new Connection(elementA.getEndPoints().get(0), elementC.getEndPoints().get(0)));
/*    */   }
/*    */   
/*    */   public DiagramModel getModel() {
/* 58 */     return (DiagramModel)this.model;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\diagram\BasicView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */