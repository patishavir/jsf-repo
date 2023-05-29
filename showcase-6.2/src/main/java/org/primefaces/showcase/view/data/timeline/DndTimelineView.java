/*     */
package org.primefaces.showcase.view.data.timeline;

/*     */
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.TimeZone;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
/*     */ import javax.faces.event.AjaxBehaviorEvent;
/*     */ import org.primefaces.component.timeline.TimelineUpdater;
/*     */ import org.primefaces.event.timeline.TimelineDragDropEvent;
/*     */ import org.primefaces.model.timeline.TimelineEvent;
/*     */ import org.primefaces.model.timeline.TimelineModel;
/*     */ import org.primefaces.showcase.domain.Event;

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
/*     */
/*     */ @ManagedBean(name = "dndTimelineView")
/*     */ @ViewScoped
/*     */ public class DndTimelineView/*     */ implements Serializable
/*     */ {
	/*     */ private TimelineModel model;
	/*     */ private Date start;
	/*     */ private Date end;
	/* 45 */ private List<Event> events = new ArrayList<Event>();

	/*     */
	/*     */ @PostConstruct
	/*     */ public void init() {
		/* 49 */ Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		/* 50 */ Date now = new Date();
		/*     */
		/* 52 */ cal.setTimeInMillis(now.getTime() - 14400000L);
		/* 53 */ this.start = cal.getTime();
		/*     */
		/* 55 */ cal.setTimeInMillis(now.getTime() + 28800000L);
		/* 56 */ this.end = cal.getTime();
		/*     */
		/* 58 */ this.model = new TimelineModel();
		/*     */
		/* 60 */ for (int i = 1; i <= 10; i++) {
			/* 61 */ this.events.add(new Event("Event " + i));
			/*     */ }
		/*     */ }

	/*     */
	/*     */
	/*     */
	/*     */
	/*     */ public void onDrop(TimelineDragDropEvent e) {
		/* 69 */ Event dndEvent = (Event) e.getData();
		/* 70 */ dndEvent.setStart(e.getStartDate());
		/* 71 */ dndEvent.setEnd(e.getEndDate());
		/*     */
		/*     */
		/* 74 */ TimelineEvent event = new TimelineEvent(dndEvent, e.getStartDate(), e.getEndDate(),
				Boolean.valueOf(false), e.getGroup());
		/*     */
		/*     */
		/* 77 */ TimelineUpdater timelineUpdater = TimelineUpdater.getCurrentInstance("timeline");
		/* 78 */ this.model.add(event, timelineUpdater);
		/*     */
		/*     */
		/* 81 */ this.events.remove(dndEvent);
		/*     */
		/* 83 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"The " + dndEvent.getName() + " was added", null);
		/* 84 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*     */ }

	/*     */
	/*     */ public void onSwitchTimeZone(AjaxBehaviorEvent e) {
		/* 88 */ this.model.clear();
		/*     */ }

	/*     */
	/*     */ public TimelineModel getModel() {
		/* 92 */ return this.model;
		/*     */ }

	/*     */
	/*     */ public List<Event> getEvents() {
		/* 96 */ return this.events;
		/*     */ }

	/*     */
	/*     */ public Date getStart() {
		/* 100 */ return this.start;
		/*     */ }

	/*     */
	/*     */ public Date getEnd() {
		/* 104 */ return this.end;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\timeline\DndTimelineView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */