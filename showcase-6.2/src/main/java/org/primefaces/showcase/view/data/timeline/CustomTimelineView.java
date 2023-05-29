/*    */
package org.primefaces.showcase.view.data.timeline;

/*    */
/*    */ import java.io.Serializable;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import java.util.TimeZone;
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
/*    */ @ManagedBean(name = "customTimelineView")
/*    */ @ViewScoped
/*    */ public class CustomTimelineView/*    */ implements Serializable
/*    */ {
	/*    */ private TimelineModel model;
	/*    */ private Date start;
	/*    */ private Date end;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 39 */ Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		/* 40 */ Date now = new Date();
		/*    */
		/* 42 */ cal.setTimeInMillis(now.getTime() - 14400000L);
		/* 43 */ this.start = cal.getTime();
		/*    */
		/* 45 */ cal.setTimeInMillis(now.getTime() + 28800000L);
		/* 46 */ this.end = cal.getTime();
		/*    */
		/*    */
		/* 49 */ String[] NAMES = { "User 1", "User 2", "User 3", "User 4", "User 5", "User 6" };
		/*    */
		/*    */
		/* 52 */ this.model = new TimelineModel();
		/*    */
		/* 54 */ for (String name : NAMES) {
			/* 55 */ now = new Date();
			/* 56 */ Date end = new Date(now.getTime() - 43200000L);
			/*    */
			/* 58 */ for (int i = 0; i < 5; i++) {
				/* 59 */ Date start = new Date(end.getTime() + Math.round(Math.random() * 5.0D) * 60L * 60L * 1000L);
				/* 60 */ end = new Date(start.getTime() + Math.round(4.0D + Math.random() * 5.0D) * 60L * 60L * 1000L);
				/*    */
				/* 62 */ long r = Math.round(Math.random() * 2.0D);
				/* 63 */ String availability = (r == 0L) ? "Unavailable" : ((r == 1L) ? "Available" : "Maybe");
				/*    */
				/*    */
				/* 66 */ TimelineEvent event = new TimelineEvent(availability, start, end, Boolean.valueOf(true), name,
						availability.toLowerCase());
				/* 67 */ this.model.add(event);
				/*    */ }
			/*    */ }
		/*    */ }

	/*    */
	/*    */ public TimelineModel getModel() {
		/* 73 */ return this.model;
		/*    */ }

	/*    */
	/*    */ public Date getStart() {
		/* 77 */ return this.start;
		/*    */ }

	/*    */
	/*    */ public Date getEnd() {
		/* 81 */ return this.end;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\timeline\CustomTimelineView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */