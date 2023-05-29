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
/*    */ import org.primefaces.model.diagram.connector.StraightConnector;
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
/*    */ @ManagedBean(name = "diagramHierarchicalView")
/*    */ @RequestScoped
/*    */ public class HierarchicalView
/*    */ {
	/*    */ private DefaultDiagramModel model;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 38 */ this.model = new DefaultDiagramModel();
		/* 39 */ this.model.setMaxConnections(-1);
		/* 40 */ this.model.setConnectionsDetachable(false);
		/*    */
		/* 42 */ Element ceo = new Element("CEO", "25em", "6em");
		/* 43 */ ceo.addEndPoint(createEndPoint(EndPointAnchor.BOTTOM));
		/* 44 */ this.model.addElement(ceo);
		/*    */
		/*    */
		/* 47 */ Element cfo = new Element("CFO", "10em", "18em");
		/* 48 */ cfo.addEndPoint(createEndPoint(EndPointAnchor.TOP));
		/* 49 */ cfo.addEndPoint(createEndPoint(EndPointAnchor.BOTTOM));
		/*    */
		/* 51 */ Element fin = new Element("FIN", "5em", "30em");
		/* 52 */ fin.addEndPoint(createEndPoint(EndPointAnchor.TOP));
		/*    */
		/* 54 */ Element pur = new Element("PUR", "20em", "30em");
		/* 55 */ pur.addEndPoint(createEndPoint(EndPointAnchor.TOP));
		/*    */
		/* 57 */ this.model.addElement(cfo);
		/* 58 */ this.model.addElement(fin);
		/* 59 */ this.model.addElement(pur);
		/*    */
		/*    */
		/* 62 */ Element cto = new Element("CTO", "40em", "18em");
		/* 63 */ cto.addEndPoint(createEndPoint(EndPointAnchor.TOP));
		/* 64 */ cto.addEndPoint(createEndPoint(EndPointAnchor.BOTTOM));
		/*    */
		/* 66 */ Element dev = new Element("DEV", "35em", "30em");
		/* 67 */ dev.addEndPoint(createEndPoint(EndPointAnchor.TOP));
		/*    */
		/* 69 */ Element tst = new Element("TST", "50em", "30em");
		/* 70 */ tst.addEndPoint(createEndPoint(EndPointAnchor.TOP));
		/*    */
		/* 72 */ this.model.addElement(cto);
		/* 73 */ this.model.addElement(dev);
		/* 74 */ this.model.addElement(tst);
		/*    */
		/* 76 */ StraightConnector connector = new StraightConnector();
		/* 77 */ connector.setPaintStyle("{strokeStyle:'#404a4e', lineWidth:3}");
		/* 78 */ connector.setHoverPaintStyle("{strokeStyle:'#20282b'}");
		/*    */
		/*    */
		/* 81 */ this.model
				.connect(new Connection(ceo.getEndPoints().get(0), cfo.getEndPoints().get(0), (Connector) connector));
		/* 82 */ this.model
				.connect(new Connection(ceo.getEndPoints().get(0), cto.getEndPoints().get(0), (Connector) connector));
		/* 83 */ this.model
				.connect(new Connection(cfo.getEndPoints().get(1), fin.getEndPoints().get(0), (Connector) connector));
		/* 84 */ this.model
				.connect(new Connection(cfo.getEndPoints().get(1), pur.getEndPoints().get(0), (Connector) connector));
		/* 85 */ this.model
				.connect(new Connection(cto.getEndPoints().get(1), dev.getEndPoints().get(0), (Connector) connector));
		/* 86 */ this.model
				.connect(new Connection(cto.getEndPoints().get(1), tst.getEndPoints().get(0), (Connector) connector));
		/*    */ }

	/*    */
	/*    */ private EndPoint createEndPoint(EndPointAnchor anchor) {
		/* 90 */ DotEndPoint endPoint = new DotEndPoint(anchor);
		/* 91 */ endPoint.setStyle("{fillStyle:'#404a4e'}");
		/* 92 */ endPoint.setHoverStyle("{fillStyle:'#20282b'}");
		/*    */
		/* 94 */ return (EndPoint) endPoint;
		/*    */ }

	/*    */
	/*    */ public DiagramModel getModel() {
		/* 98 */ return (DiagramModel) this.model;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\diagram\HierarchicalView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */