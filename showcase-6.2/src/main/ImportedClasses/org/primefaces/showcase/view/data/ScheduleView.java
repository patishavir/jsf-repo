/*     */ package WEB-INF.classes.org.primefaces.showcase.view.data;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
/*     */ import javax.faces.event.ActionEvent;
/*     */ import org.primefaces.event.ScheduleEntryMoveEvent;
/*     */ import org.primefaces.event.ScheduleEntryResizeEvent;
/*     */ import org.primefaces.event.SelectEvent;
/*     */ import org.primefaces.model.DefaultScheduleEvent;
/*     */ import org.primefaces.model.DefaultScheduleModel;
/*     */ import org.primefaces.model.ScheduleEvent;
/*     */ import org.primefaces.model.ScheduleModel;
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
/*     */ 
/*     */ 
/*     */ @ManagedBean
/*     */ @ViewScoped
/*     */ public class ScheduleView
/*     */   implements Serializable
/*     */ {
/*     */   private ScheduleModel eventModel;
/*     */   private ScheduleModel lazyEventModel;
/*  45 */   private ScheduleEvent event = (ScheduleEvent)new DefaultScheduleEvent();
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  49 */     this.eventModel = (ScheduleModel)new DefaultScheduleModel();
/*  50 */     this.eventModel.addEvent((ScheduleEvent)new DefaultScheduleEvent("Champions League Match", previousDay8Pm(), previousDay11Pm()));
/*  51 */     this.eventModel.addEvent((ScheduleEvent)new DefaultScheduleEvent("Birthday Party", today1Pm(), today6Pm()));
/*  52 */     this.eventModel.addEvent((ScheduleEvent)new DefaultScheduleEvent("Breakfast at Tiffanys", nextDay9Am(), nextDay11Am()));
/*  53 */     this.eventModel.addEvent((ScheduleEvent)new DefaultScheduleEvent("Plant the new garden stuff", theDayAfter3Pm(), fourDaysLater3pm()));
/*     */     
/*  55 */     this.lazyEventModel = (ScheduleModel)new Object(this);
/*     */   }
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
/*     */   public Date getRandomDate(Date base) {
/*  69 */     Calendar date = Calendar.getInstance();
/*  70 */     date.setTime(base);
/*  71 */     date.add(5, (int)(Math.random() * 30.0D) + 1);
/*     */     
/*  73 */     return date.getTime();
/*     */   }
/*     */   
/*     */   public Date getInitialDate() {
/*  77 */     Calendar calendar = Calendar.getInstance();
/*  78 */     calendar.set(calendar.get(1), 1, calendar.get(5), 0, 0, 0);
/*     */     
/*  80 */     return calendar.getTime();
/*     */   }
/*     */   
/*     */   public ScheduleModel getEventModel() {
/*  84 */     return this.eventModel;
/*     */   }
/*     */   
/*     */   public ScheduleModel getLazyEventModel() {
/*  88 */     return this.lazyEventModel;
/*     */   }
/*     */   
/*     */   private Calendar today() {
/*  92 */     Calendar calendar = Calendar.getInstance();
/*  93 */     calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
/*     */     
/*  95 */     return calendar;
/*     */   }
/*     */   
/*     */   private Date previousDay8Pm() {
/*  99 */     Calendar t = (Calendar)today().clone();
/* 100 */     t.set(9, 1);
/* 101 */     t.set(5, t.get(5) - 1);
/* 102 */     t.set(10, 8);
/*     */     
/* 104 */     return t.getTime();
/*     */   }
/*     */   
/*     */   private Date previousDay11Pm() {
/* 108 */     Calendar t = (Calendar)today().clone();
/* 109 */     t.set(9, 1);
/* 110 */     t.set(5, t.get(5) - 1);
/* 111 */     t.set(10, 11);
/*     */     
/* 113 */     return t.getTime();
/*     */   }
/*     */   
/*     */   private Date today1Pm() {
/* 117 */     Calendar t = (Calendar)today().clone();
/* 118 */     t.set(9, 1);
/* 119 */     t.set(10, 1);
/*     */     
/* 121 */     return t.getTime();
/*     */   }
/*     */   
/*     */   private Date theDayAfter3Pm() {
/* 125 */     Calendar t = (Calendar)today().clone();
/* 126 */     t.set(5, t.get(5) + 2);
/* 127 */     t.set(9, 1);
/* 128 */     t.set(10, 3);
/*     */     
/* 130 */     return t.getTime();
/*     */   }
/*     */   
/*     */   private Date today6Pm() {
/* 134 */     Calendar t = (Calendar)today().clone();
/* 135 */     t.set(9, 1);
/* 136 */     t.set(10, 6);
/*     */     
/* 138 */     return t.getTime();
/*     */   }
/*     */   
/*     */   private Date nextDay9Am() {
/* 142 */     Calendar t = (Calendar)today().clone();
/* 143 */     t.set(9, 0);
/* 144 */     t.set(5, t.get(5) + 1);
/* 145 */     t.set(10, 9);
/*     */     
/* 147 */     return t.getTime();
/*     */   }
/*     */   
/*     */   private Date nextDay11Am() {
/* 151 */     Calendar t = (Calendar)today().clone();
/* 152 */     t.set(9, 0);
/* 153 */     t.set(5, t.get(5) + 1);
/* 154 */     t.set(10, 11);
/*     */     
/* 156 */     return t.getTime();
/*     */   }
/*     */   
/*     */   private Date fourDaysLater3pm() {
/* 160 */     Calendar t = (Calendar)today().clone();
/* 161 */     t.set(9, 1);
/* 162 */     t.set(5, t.get(5) + 4);
/* 163 */     t.set(10, 3);
/*     */     
/* 165 */     return t.getTime();
/*     */   }
/*     */   
/*     */   public ScheduleEvent getEvent() {
/* 169 */     return this.event;
/*     */   }
/*     */   
/*     */   public void setEvent(ScheduleEvent event) {
/* 173 */     this.event = event;
/*     */   }
/*     */   
/*     */   public void addEvent(ActionEvent actionEvent) {
/* 177 */     if (this.event.getId() == null) {
/* 178 */       this.eventModel.addEvent(this.event);
/*     */     } else {
/* 180 */       this.eventModel.updateEvent(this.event);
/*     */     } 
/* 182 */     this.event = (ScheduleEvent)new DefaultScheduleEvent();
/*     */   }
/*     */   
/*     */   public void onEventSelect(SelectEvent selectEvent) {
/* 186 */     this.event = (ScheduleEvent)selectEvent.getObject();
/*     */   }
/*     */   
/*     */   public void onDateSelect(SelectEvent selectEvent) {
/* 190 */     this.event = (ScheduleEvent)new DefaultScheduleEvent("", (Date)selectEvent.getObject(), (Date)selectEvent.getObject());
/*     */   }
/*     */   
/*     */   public void onEventMove(ScheduleEntryMoveEvent event) {
/* 194 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event moved", "Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());
/*     */     
/* 196 */     addMessage(message);
/*     */   }
/*     */   
/*     */   public void onEventResize(ScheduleEntryResizeEvent event) {
/* 200 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Event resized", "Day delta:" + event.getDayDelta() + ", Minute delta:" + event.getMinuteDelta());
/*     */     
/* 202 */     addMessage(message);
/*     */   }
/*     */   
/*     */   private void addMessage(FacesMessage message) {
/* 206 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\ScheduleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */