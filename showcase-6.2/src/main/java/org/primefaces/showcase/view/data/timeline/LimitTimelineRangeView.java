/*    */
package org.primefaces.showcase.view.data.timeline;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
/*    */ import org.primefaces.model.timeline.TimelineEvent;
/*    */ import org.primefaces.model.timeline.TimelineModel;

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
/*    */ @ManagedBean(name = "limitTimelineRangeView")
/*    */ @ViewScoped
/*    */ public class LimitTimelineRangeView/*    */ implements Serializable
/*    */ {
	/*    */ private TimelineModel model;
	/*    */ private Date min;
	/*    */ private Date max;
	/*    */ private long zoomMin;
	/*    */ private long zoomMax;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 40 */ this.model = new TimelineModel();
		/*    */
		/* 42 */ Calendar cal = Calendar.getInstance();
		/* 43 */ cal.set(2015, 4, 25, 0, 0, 0);
		/* 44 */ this.model.add(new TimelineEvent("First", cal.getTime()));
		/*    */
		/* 46 */ cal.set(2015, 4, 26, 0, 0, 0);
		/* 47 */ this.model.add(new TimelineEvent("Last", cal.getTime()));
		/*    */
		/*    */
		/* 50 */ cal.set(2015, 0, 1, 0, 0, 0);
		/* 51 */ this.min = cal.getTime();
		/*    */
		/*    */
		/* 54 */ cal.set(2015, 11, 31, 0, 0, 0);
		/* 55 */ this.max = cal.getTime();
		/*    */
		/*    */
		/* 58 */ this.zoomMin = 86400000L;
		/*    */
		/*    */
		/* 61 */ this.zoomMax = 8035200000L;
		/*    */ }

	/*    */
	/*    */ public TimelineModel getModel() {
		/* 65 */ return this.model;
		/*    */ }

	/*    */
	/*    */ public Date getMin() {
		/* 69 */ return this.min;
		/*    */ }

	/*    */
	/*    */ public Date getMax() {
		/* 73 */ return this.max;
		/*    */ }

	/*    */
	/*    */ public long getZoomMin() {
		/* 77 */ return this.zoomMin;
		/*    */ }

	/*    */
	/*    */ public long getZoomMax() {
		/* 81 */ return this.zoomMax;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\timeline\LimitTimelineRangeView.class Java compiler version: 6
 * (50.0) JD-Core Version: 1.1.3
 */