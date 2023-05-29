/*     */ package WEB-INF.classes.org.primefaces.showcase.view.data.timeline;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Calendar;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
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
/*     */ 
/*     */ @ManagedBean(name = "basicTimelineView")
/*     */ @ViewScoped
/*     */ public class BasicTimelineView
/*     */   implements Serializable
/*     */ {
/*     */   private TimelineModel model;
/*     */   private boolean selectable = true;
/*     */   private boolean zoomable = true;
/*     */   private boolean moveable = true;
/*     */   private boolean stackEvents = true;
/*  39 */   private String eventStyle = "box";
/*     */   private boolean axisOnTop;
/*     */   private boolean showCurrentTime = true;
/*     */   private boolean showNavigation = false;
/*     */   
/*     */   @PostConstruct
/*     */   protected void initialize() {
/*  46 */     this.model = new TimelineModel();
/*     */     
/*  48 */     Calendar cal = Calendar.getInstance();
/*  49 */     cal.set(2014, 5, 12, 0, 0, 0);
/*  50 */     this.model.add(new TimelineEvent("PrimeUI 1.1", cal.getTime()));
/*     */     
/*  52 */     cal.set(2014, 9, 11, 0, 0, 0);
/*  53 */     this.model.add(new TimelineEvent("Primefaces 5.1.3", cal.getTime()));
/*     */     
/*  55 */     cal.set(2015, 11, 8, 0, 0, 0);
/*  56 */     this.model.add(new TimelineEvent("PrimeUI 2.2", cal.getTime()));
/*     */     
/*  58 */     cal.set(2015, 2, 10, 0, 0, 0);
/*  59 */     this.model.add(new TimelineEvent("Sentinel-Layout 1.1", cal.getTime()));
/*     */     
/*  61 */     cal.set(2015, 3, 3, 0, 0, 0);
/*  62 */     this.model.add(new TimelineEvent("Spark-Layout 1.0", cal.getTime()));
/*     */     
/*  64 */     cal.set(2015, 4, 15, 0, 0, 0);
/*  65 */     this.model.add(new TimelineEvent("Ronin-Layout 1.0", cal.getTime()));
/*     */     
/*  67 */     cal.set(2015, 6, 10, 0, 0, 0);
/*  68 */     this.model.add(new TimelineEvent("Modena-Layout 1.0", cal.getTime()));
/*     */     
/*  70 */     cal.set(2015, 5, 15, 0, 0, 0);
/*  71 */     this.model.add(new TimelineEvent("Rio-Layout 1.0", cal.getTime()));
/*     */     
/*  73 */     cal.set(2015, 8, 4, 0, 0, 0);
/*  74 */     this.model.add(new TimelineEvent("Adamantium-Layout 1.0", cal.getTime()));
/*     */     
/*  76 */     cal.set(2015, 11, 14, 0, 0, 0);
/*  77 */     this.model.add(new TimelineEvent("Titan-Layout 1.0", cal.getTime()));
/*     */     
/*  79 */     cal.set(2015, 9, 12, 0, 0, 0);
/*  80 */     this.model.add(new TimelineEvent("Volt-Layout 1.0", cal.getTime()));
/*     */     
/*  82 */     cal.set(2016, 0, 28, 0, 0, 0);
/*  83 */     this.model.add(new TimelineEvent("Atlas-Layout 1.0", cal.getTime()));
/*     */     
/*  85 */     cal.set(2016, 1, 24, 0, 0, 0);
/*  86 */     this.model.add(new TimelineEvent("PrimeUI 4.1.0", cal.getTime()));
/*     */     
/*  88 */     cal.set(2016, 1, 29, 0, 0, 0);
/*  89 */     this.model.add(new TimelineEvent("Primefaces 5.3.8", cal.getTime()));
/*     */     
/*  91 */     cal.set(2016, 1, 29, 0, 0, 0);
/*  92 */     this.model.add(new TimelineEvent("PrimeNG 0.5", cal.getTime()));
/*     */   }
/*     */   
/*     */   public void onSelect(TimelineSelectEvent e) {
/*  96 */     TimelineEvent timelineEvent = e.getTimelineEvent();
/*     */     
/*  98 */     FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected event:", timelineEvent.getData().toString());
/*  99 */     FacesContext.getCurrentInstance().addMessage(null, msg);
/*     */   }
/*     */   
/*     */   public TimelineModel getModel() {
/* 103 */     return this.model;
/*     */   }
/*     */   
/*     */   public boolean isSelectable() {
/* 107 */     return this.selectable;
/*     */   }
/*     */   
/*     */   public void setSelectable(boolean selectable) {
/* 111 */     this.selectable = selectable;
/*     */   }
/*     */   
/*     */   public boolean isZoomable() {
/* 115 */     return this.zoomable;
/*     */   }
/*     */   
/*     */   public void setZoomable(boolean zoomable) {
/* 119 */     this.zoomable = zoomable;
/*     */   }
/*     */   
/*     */   public boolean isMoveable() {
/* 123 */     return this.moveable;
/*     */   }
/*     */   
/*     */   public void setMoveable(boolean moveable) {
/* 127 */     this.moveable = moveable;
/*     */   }
/*     */   
/*     */   public boolean isStackEvents() {
/* 131 */     return this.stackEvents;
/*     */   }
/*     */   
/*     */   public void setStackEvents(boolean stackEvents) {
/* 135 */     this.stackEvents = stackEvents;
/*     */   }
/*     */   
/*     */   public String getEventStyle() {
/* 139 */     return this.eventStyle;
/*     */   }
/*     */   
/*     */   public void setEventStyle(String eventStyle) {
/* 143 */     this.eventStyle = eventStyle;
/*     */   }
/*     */   
/*     */   public boolean isAxisOnTop() {
/* 147 */     return this.axisOnTop;
/*     */   }
/*     */   
/*     */   public void setAxisOnTop(boolean axisOnTop) {
/* 151 */     this.axisOnTop = axisOnTop;
/*     */   }
/*     */   
/*     */   public boolean isShowCurrentTime() {
/* 155 */     return this.showCurrentTime;
/*     */   }
/*     */   
/*     */   public void setShowCurrentTime(boolean showCurrentTime) {
/* 159 */     this.showCurrentTime = showCurrentTime;
/*     */   }
/*     */   
/*     */   public boolean isShowNavigation() {
/* 163 */     return this.showNavigation;
/*     */   }
/*     */   
/*     */   public void setShowNavigation(boolean showNavigation) {
/* 167 */     this.showNavigation = showNavigation;
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\timeline\BasicTimelineView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */