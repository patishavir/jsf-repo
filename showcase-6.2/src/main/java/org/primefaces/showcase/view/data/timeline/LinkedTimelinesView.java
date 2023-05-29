/*     */
package org.primefaces.showcase.view.data.timeline;

/*     */
/*     */ import java.io.Serializable;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.component.timeline.TimelineUpdater;
/*     */ import org.primefaces.event.timeline.TimelineSelectEvent;
/*     */ import org.primefaces.model.timeline.TimelineEvent;
/*     */ import org.primefaces.model.timeline.TimelineModel;

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
/*     */ @ManagedBean(name = "linkedTimelinesView")
/*     */ @ViewScoped
/*     */ public class LinkedTimelinesView/*     */ implements Serializable
/*     */ {
	/*     */ private TimelineModel modelFirst;
	/*     */ private TimelineModel modelSecond;
	/*     */ private boolean aSelected;

	/*     */
	/*     */ @PostConstruct
	/*     */ public void init() {
		/* 41 */ createFirstTimeline();
		/* 42 */ createSecondTimeline();
		/*     */ }

	/*     */
	/*     */ private void createFirstTimeline() {
		/* 46 */ this.modelFirst = new TimelineModel();
		/*     */
		/* 48 */ Calendar cal = Calendar.getInstance();
		/* 49 */ cal.set(2015, 7, 22, 17, 30, 0);
		/* 50 */ this.modelFirst.add(
				new TimelineEvent(new Task(this, "Mail from boss", "images/timeline/mail.png", false), cal.getTime()));
		/*     */
		/* 52 */ cal.set(2015, 7, 23, 23, 0, 0);
		/* 53 */ this.modelFirst.add(new TimelineEvent(
				new Task(this, "Call back my boss", "images/timeline/callback.png", false), cal.getTime()));
		/*     */
		/* 55 */ cal.set(2015, 7, 24, 21, 45, 0);
		/* 56 */ this.modelFirst.add(new TimelineEvent(
				new Task(this, "Travel to Spain", "images/timeline/location.png", false), cal.getTime()));
		/*     */
		/* 58 */ cal.set(2015, 7, 26, 0, 0, 0);
		/* 59 */ Date startWork = cal.getTime();
		/* 60 */ cal.set(2015, 8, 2, 0, 0, 0);
		/* 61 */ Date endWork = cal.getTime();
		/* 62 */ this.modelFirst.add(new TimelineEvent(
				new Task(this, "Do homework", "images/timeline/homework.png", true), startWork, endWork));
		/*     */
		/* 64 */ cal.set(2015, 7, 28, 0, 0, 0);
		/* 65 */ this.modelFirst.add(
				new TimelineEvent(new Task(this, "Create memo", "images/timeline/memo.png", false), cal.getTime()));
		/*     */
		/* 67 */ cal.set(2015, 7, 31, 0, 0, 0);
		/* 68 */ Date startReport = cal.getTime();
		/* 69 */ cal.set(2015, 8, 3, 0, 0, 0);
		/* 70 */ Date endReport = cal.getTime();
		/* 71 */ this.modelFirst.add(new TimelineEvent(
				new Task(this, "Create report", "images/timeline/report.png", true), startReport, endReport));
		/*     */ }

	/*     */
	/*     */ private void createSecondTimeline() {
		/* 75 */ this.modelSecond = new TimelineModel();
		/*     */
		/* 77 */ Calendar cal = Calendar.getInstance();
		/*     */
		/* 79 */ cal.set(2015, 7, 23, 0, 0, 0);
		/* 80 */ Date startProject = cal.getTime();
		/* 81 */ cal.set(2015, 7, 30, 0, 0, 0);
		/* 82 */ Date endProject = cal.getTime();
		/* 83 */ this.modelSecond.add(new TimelineEvent("Project A", startProject, endProject));
		/*     */
		/* 85 */ cal.set(2015, 7, 27, 0, 0, 0);
		/* 86 */ startProject = cal.getTime();
		/* 87 */ cal.set(2015, 7, 31, 0, 0, 0);
		/* 88 */ endProject = cal.getTime();
		/* 89 */ this.modelSecond.add(new TimelineEvent("Project B", startProject, endProject));
		/*     */ }

	/*     */
	/*     */
	/*     */ public void onSelect(TimelineSelectEvent e) {
		/* 94 */ TimelineUpdater timelineUpdater = TimelineUpdater.getCurrentInstance(":form:timelineSecond");
		/*     */
		/* 96 */ if (this.aSelected) {
			/*     */
			/* 98 */ timelineUpdater.select(1);
			/*     */ } else {
			/*     */
			/* 101 */ timelineUpdater.select(0);
			/*     */ }
		/*     */
		/* 104 */ this.aSelected = !this.aSelected;
		/*     */
		/*     */
		/* 107 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Selected project: " + (this.aSelected ? "A" : "B"), null);
		/* 108 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*     */ }

	/*     */
	/*     */ public TimelineModel getModelFirst() {
		/* 112 */ return this.modelFirst;
		/*     */ }

	/*     */
	/*     */ public TimelineModel getModelSecond() {
		/* 116 */ return this.modelSecond;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\timeline\LinkedTimelinesView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */