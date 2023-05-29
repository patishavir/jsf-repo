/*    */
package org.primefaces.showcase.view.panel;

/*    */
/*    */ import java.io.Serializable;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.CloseEvent;
/*    */ import org.primefaces.event.DashboardReorderEvent;
/*    */ import org.primefaces.event.ToggleEvent;
/*    */ import org.primefaces.model.DashboardColumn;
/*    */ import org.primefaces.model.DashboardModel;
/*    */ import org.primefaces.model.DefaultDashboardColumn;
/*    */ import org.primefaces.model.DefaultDashboardModel;

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
/*    */ @ViewScoped
/*    */ public class DashboardView/*    */ implements Serializable
/*    */ {
	/*    */ private DashboardModel model;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 41 */ this.model = (DashboardModel) new DefaultDashboardModel();
		/* 42 */ DefaultDashboardColumn defaultDashboardColumn1 = new DefaultDashboardColumn();
		/* 43 */ DefaultDashboardColumn defaultDashboardColumn2 = new DefaultDashboardColumn();
		/* 44 */ DefaultDashboardColumn defaultDashboardColumn3 = new DefaultDashboardColumn();
		/*    */
		/* 46 */ defaultDashboardColumn1.addWidget("sports");
		/* 47 */ defaultDashboardColumn1.addWidget("finance");
		/*    */
		/* 49 */ defaultDashboardColumn2.addWidget("lifestyle");
		/* 50 */ defaultDashboardColumn2.addWidget("weather");
		/*    */
		/* 52 */ defaultDashboardColumn3.addWidget("politics");
		/*    */
		/* 54 */ this.model.addColumn((DashboardColumn) defaultDashboardColumn1);
		/* 55 */ this.model.addColumn((DashboardColumn) defaultDashboardColumn2);
		/* 56 */ this.model.addColumn((DashboardColumn) defaultDashboardColumn3);
		/*    */ }

	/*    */
	/*    */ public void handleReorder(DashboardReorderEvent event) {
		/* 60 */ FacesMessage message = new FacesMessage();
		/* 61 */ message.setSeverity(FacesMessage.SEVERITY_INFO);
		/* 62 */ message.setSummary("Reordered: " + event.getWidgetId());
		/* 63 */ message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex()
				+ ", Sender index: " + event.getSenderColumnIndex());
		/*    */
		/* 65 */ addMessage(message);
		/*    */ }

	/*    */
	/*    */ public void handleClose(CloseEvent event) {
		/* 69 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed",
				"Closed panel id:'" + event.getComponent().getId() + "'");
		/*    */
		/* 71 */ addMessage(message);
		/*    */ }

	/*    */
	/*    */ public void handleToggle(ToggleEvent event) {
		/* 75 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				event.getComponent().getId() + " toggled", "Status:" + event.getVisibility().name());
		/*    */
		/* 77 */ addMessage(message);
		/*    */ }

	/*    */
	/*    */ private void addMessage(FacesMessage message) {
		/* 81 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }

	/*    */
	/*    */ public DashboardModel getModel() {
		/* 85 */ return this.model;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\panel\DashboardView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */