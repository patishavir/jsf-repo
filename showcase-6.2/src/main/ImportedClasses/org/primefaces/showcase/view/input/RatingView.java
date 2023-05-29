/*    */ package WEB-INF.classes.org.primefaces.showcase.view.input;
/*    */ 
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.event.RateEvent;
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
/*    */ 
/*    */ @ManagedBean
/*    */ public class RatingView
/*    */ {
/*    */   private Integer rating1;
/*    */   private Integer rating2;
/*    */   private Integer rating3;
/* 30 */   private Integer rating4 = Integer.valueOf(3);
/*    */   
/*    */   public void onrate(RateEvent rateEvent) {
/* 33 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Rate Event", "You rated:" + ((Integer)rateEvent.getRating()).intValue());
/* 34 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*    */   }
/*    */   
/*    */   public void oncancel() {
/* 38 */     FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cancel Event", "Rate Reset");
/* 39 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*    */   }
/*    */   
/*    */   public Integer getRating1() {
/* 43 */     return this.rating1;
/*    */   }
/*    */   
/*    */   public void setRating1(Integer rating1) {
/* 47 */     this.rating1 = rating1;
/*    */   }
/*    */   
/*    */   public Integer getRating2() {
/* 51 */     return this.rating2;
/*    */   }
/*    */   
/*    */   public void setRating2(Integer rating2) {
/* 55 */     this.rating2 = rating2;
/*    */   }
/*    */   
/*    */   public Integer getRating3() {
/* 59 */     return this.rating3;
/*    */   }
/*    */   
/*    */   public void setRating3(Integer rating3) {
/* 63 */     this.rating3 = rating3;
/*    */   }
/*    */   
/*    */   public Integer getRating4() {
/* 67 */     return this.rating4;
/*    */   }
/*    */   
/*    */   public void setRating4(Integer rating4) {
/* 71 */     this.rating4 = rating4;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\RatingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */