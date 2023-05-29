/*    */ package WEB-INF.classes.org.primefaces.showcase.mobile;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ViewScoped;
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
/*    */ public class ShowcaseView
/*    */   implements Serializable
/*    */ {
/*    */   private String text;
/* 30 */   private List<String> texts = new ArrayList<String>();
/*    */   
/*    */   public String getText() {
/* 33 */     return this.text;
/*    */   }
/*    */   public void setText(String text) {
/* 36 */     this.text = text;
/*    */   }
/*    */   
/*    */   public List<String> getTexts() {
/* 40 */     return this.texts;
/*    */   }
/*    */   
/*    */   public void add() {
/* 44 */     this.texts.add(this.text);
/* 45 */     this.text = null;
/*    */   }
/*    */   
/*    */   public String navigate() {
/* 49 */     return "pm:target";
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\mobile\ShowcaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */