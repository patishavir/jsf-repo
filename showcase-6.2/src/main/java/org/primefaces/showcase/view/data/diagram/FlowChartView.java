/*    */
package org.primefaces.showcase.view.data.diagram;

/*    */
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.RequestScoped;
/*    */ import org.primefaces.model.diagram.Connection;
/*    */ import org.primefaces.model.diagram.DefaultDiagramModel;
/*    */ import org.primefaces.model.diagram.DiagramModel;
/*    */ import org.primefaces.model.diagram.Element;
/*    */ import org.primefaces.model.diagram.connector.Connector;
/*    */ import org.primefaces.model.diagram.connector.FlowChartConnector;
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
/*    */ @ManagedBean(name = "diagramFlowChartView")
/*    */ @RequestScoped
/*    */ public class FlowChartView
/*    */ {
	/*    */ private DefaultDiagramModel model;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 40 */ this.model = new DefaultDiagramModel();
		/* 41 */ this.model.setMaxConnections(-1);
		/*    */
		/* 43 */ FlowChartConnector connector = new FlowChartConnector();
		/* 44 */ connector.setPaintStyle("{strokeStyle:'#C7B097',lineWidth:3}");
		/* 45 */ this.model.setDefaultConnector((Connector) connector);
		/*    */
		/* 47 */ Element start = new Element("Fight for your dream", "20em", "6em");
		/* 48 */ start.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.BOTTOM));
		/* 49 */ start.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.LEFT));
		/*    */
		/* 51 */ Element trouble = new Element("Do you meet some trouble?", "20em", "18em");
		/* 52 */ trouble.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.TOP));
		/* 53 */ trouble.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.BOTTOM));
		/* 54 */ trouble.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.RIGHT));
		/*    */
		/* 56 */ Element giveup = new Element("Do you give up?", "20em", "30em");
		/* 57 */ giveup.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.TOP));
		/* 58 */ giveup.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.LEFT));
		/* 59 */ giveup.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.RIGHT));
		/*    */
		/* 61 */ Element succeed = new Element("Succeed", "50em", "18em");
		/* 62 */ succeed.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.LEFT));
		/* 63 */ succeed.setStyleClass("ui-diagram-success");
		/*    */
		/* 65 */ Element fail = new Element("Fail", "50em", "30em");
		/* 66 */ fail.addEndPoint((EndPoint) new BlankEndPoint(EndPointAnchor.LEFT));
		/* 67 */ fail.setStyleClass("ui-diagram-fail");
		/*    */
		/* 69 */ this.model.addElement(start);
		/* 70 */ this.model.addElement(trouble);
		/* 71 */ this.model.addElement(giveup);
		/* 72 */ this.model.addElement(succeed);
		/* 73 */ this.model.addElement(fail);
		/*    */
		/* 75 */ this.model.connect(createConnection(start.getEndPoints().get(0), trouble.getEndPoints().get(0), null));
		/* 76 */ this.model
				.connect(createConnection(trouble.getEndPoints().get(1), giveup.getEndPoints().get(0), "Yes"));
		/* 77 */ this.model.connect(createConnection(giveup.getEndPoints().get(1), start.getEndPoints().get(1), "No"));
		/* 78 */ this.model
				.connect(createConnection(trouble.getEndPoints().get(2), succeed.getEndPoints().get(0), "No"));
		/* 79 */ this.model.connect(createConnection(giveup.getEndPoints().get(2), fail.getEndPoints().get(0), "Yes"));
		/*    */ }

	/*    */
	/*    */ public DiagramModel getModel() {
		/* 83 */ return (DiagramModel) this.model;
		/*    */ }

	/*    */
	/*    */ private Connection createConnection(EndPoint from, EndPoint to, String label) {
		/* 87 */ Connection conn = new Connection(from, to);
		/* 88 */ conn.getOverlays().add(new ArrowOverlay(20, 20, 1.0D, 1));
		/*    */
		/* 90 */ if (label != null) {
			/* 91 */ conn.getOverlays().add(new LabelOverlay(label, "flow-label", 0.5D));
			/*    */ }
		/*    */
		/* 94 */ return conn;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\diagram\FlowChartView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */