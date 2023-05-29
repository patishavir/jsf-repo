/*     */ package WEB-INF.classes.org.primefaces.showcase.view.input;
/*     */ 
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.context.FacesContext;
/*     */ import javax.faces.event.ValueChangeEvent;
/*     */ import org.primefaces.event.SlideEndEvent;
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
/*     */ public class SliderView
/*     */ {
/*     */   private int number1;
/*     */   private float number2;
/*     */   private int number3;
/*     */   private int number4;
/*     */   private int number5;
/*     */   private int number6;
/*     */   private int number7;
/*  35 */   private int number8 = 30;
/*  36 */   private int number9 = 80;
/*     */   
/*     */   public int getNumber1() {
/*  39 */     return this.number1;
/*     */   }
/*     */   
/*     */   public void setNumber1(int number1) {
/*  43 */     this.number1 = number1;
/*     */   }
/*     */   
/*     */   public float getNumber2() {
/*  47 */     return this.number2;
/*     */   }
/*     */   
/*     */   public void setNumber2(float number2) {
/*  51 */     this.number2 = number2;
/*     */   }
/*     */   
/*     */   public int getNumber3() {
/*  55 */     return this.number3;
/*     */   }
/*     */   
/*     */   public void setNumber3(int number3) {
/*  59 */     this.number3 = number3;
/*     */   }
/*     */   
/*     */   public int getNumber4() {
/*  63 */     return this.number4;
/*     */   }
/*     */   
/*     */   public void setNumber4(int number4) {
/*  67 */     this.number4 = number4;
/*     */   }
/*     */   
/*     */   public int getNumber5() {
/*  71 */     return this.number5;
/*     */   }
/*     */   
/*     */   public void setNumber5(int number5) {
/*  75 */     this.number5 = number5;
/*     */   }
/*     */   
/*     */   public int getNumber6() {
/*  79 */     return this.number6;
/*     */   }
/*     */   
/*     */   public void setNumber6(int number6) {
/*  83 */     this.number6 = number6;
/*     */   }
/*     */   
/*     */   public int getNumber7() {
/*  87 */     return this.number7;
/*     */   }
/*     */   
/*     */   public void setNumber7(int number7) {
/*  91 */     this.number7 = number7;
/*     */   }
/*     */   
/*     */   public int getNumber8() {
/*  95 */     return this.number8;
/*     */   }
/*     */   
/*     */   public void setNumber8(int number8) {
/*  99 */     this.number8 = number8;
/*     */   }
/*     */   
/*     */   public int getNumber9() {
/* 103 */     return this.number9;
/*     */   }
/*     */   
/*     */   public void setNumber9(int number9) {
/* 107 */     this.number9 = number9;
/*     */   }
/*     */   
/*     */   public void onInputChanged(ValueChangeEvent event) {
/* 111 */     FacesMessage message = new FacesMessage("Input Changed", "Value: " + event.getNewValue());
/* 112 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*     */   }
/*     */   
/*     */   public void onSlideEnd(SlideEndEvent event) {
/* 116 */     FacesMessage message = new FacesMessage("Slide Ended", "Value: " + event.getValue());
/* 117 */     FacesContext.getCurrentInstance().addMessage(null, message);
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\SliderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */