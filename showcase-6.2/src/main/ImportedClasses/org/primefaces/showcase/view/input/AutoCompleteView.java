/*     */ package WEB-INF.classes.org.primefaces.showcase.view.input;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ManagedProperty;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.event.SelectEvent;
/*     */ import org.primefaces.showcase.domain.Theme;
/*     */ import org.primefaces.showcase.service.ThemeService;
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
/*     */ public class AutoCompleteView
/*     */ {
/*     */   private String txt1;
/*     */   private String txt2;
/*     */   private String txt3;
/*     */   private String txt4;
/*     */   private String txt5;
/*     */   private String txt6;
/*     */   private String txt7;
/*     */   private String txt8;
/*     */   private Theme theme1;
/*     */   private Theme theme2;
/*     */   private Theme theme3;
/*     */   private Theme theme4;
/*     */   private List<Theme> selectedThemes;
/*     */   @ManagedProperty("#{themeService}")
/*     */   private ThemeService service;
/*     */   
/*     */   public List<String> completeText(String query) {
/*  50 */     List<String> results = new ArrayList<String>();
/*  51 */     for (int i = 0; i < 10; i++) {
/*  52 */       results.add(query + i);
/*     */     }
/*     */     
/*  55 */     return results;
/*     */   }
/*     */   
/*     */   public List<Theme> completeTheme(String query) {
/*  59 */     List<Theme> allThemes = this.service.getThemes();
/*  60 */     List<Theme> filteredThemes = new ArrayList<Theme>();
/*     */     
/*  62 */     for (int i = 0; i < allThemes.size(); i++) {
/*  63 */       Theme skin = allThemes.get(i);
/*  64 */       if (skin.getName().toLowerCase().contains(query)) {
/*  65 */         filteredThemes.add(skin);
/*     */       }
/*     */     } 
/*     */     
/*  69 */     return filteredThemes;
/*     */   }
/*     */   
/*     */   public List<Theme> completeThemeContains(String query) {
/*  73 */     List<Theme> allThemes = this.service.getThemes();
/*  74 */     List<Theme> filteredThemes = new ArrayList<Theme>();
/*     */     
/*  76 */     for (int i = 0; i < allThemes.size(); i++) {
/*  77 */       Theme skin = allThemes.get(i);
/*  78 */       if (skin.getName().toLowerCase().contains(query)) {
/*  79 */         filteredThemes.add(skin);
/*     */       }
/*     */     } 
/*     */     
/*  83 */     return filteredThemes;
/*     */   }
/*     */   
/*     */   public void onItemSelect(SelectEvent event) {
/*  87 */     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item Selected", event.getObject().toString()));
/*     */   }
/*     */   
/*     */   public String getTxt1() {
/*  91 */     return this.txt1;
/*     */   }
/*     */   
/*     */   public void setTxt1(String txt1) {
/*  95 */     this.txt1 = txt1;
/*     */   }
/*     */   
/*     */   public String getTxt2() {
/*  99 */     return this.txt2;
/*     */   }
/*     */   
/*     */   public void setTxt2(String txt2) {
/* 103 */     this.txt2 = txt2;
/*     */   }
/*     */   
/*     */   public String getTxt3() {
/* 107 */     return this.txt3;
/*     */   }
/*     */   
/*     */   public void setTxt3(String txt3) {
/* 111 */     this.txt3 = txt3;
/*     */   }
/*     */   
/*     */   public String getTxt4() {
/* 115 */     return this.txt4;
/*     */   }
/*     */   
/*     */   public void setTxt4(String txt4) {
/* 119 */     this.txt4 = txt4;
/*     */   }
/*     */   
/*     */   public String getTxt5() {
/* 123 */     return this.txt5;
/*     */   }
/*     */   
/*     */   public void setTxt5(String txt5) {
/* 127 */     this.txt5 = txt5;
/*     */   }
/*     */   
/*     */   public String getTxt6() {
/* 131 */     return this.txt6;
/*     */   }
/*     */   
/*     */   public void setTxt6(String txt6) {
/* 135 */     this.txt6 = txt6;
/*     */   }
/*     */   
/*     */   public String getTxt7() {
/* 139 */     return this.txt7;
/*     */   }
/*     */   
/*     */   public void setTxt7(String txt7) {
/* 143 */     this.txt7 = txt7;
/*     */   }
/*     */   
/*     */   public String getTxt8() {
/* 147 */     return this.txt8;
/*     */   }
/*     */   
/*     */   public void setTxt8(String txt8) {
/* 151 */     this.txt8 = txt8;
/*     */   }
/*     */   
/*     */   public Theme getTheme1() {
/* 155 */     return this.theme1;
/*     */   }
/*     */   
/*     */   public void setTheme1(Theme theme1) {
/* 159 */     this.theme1 = theme1;
/*     */   }
/*     */   
/*     */   public Theme getTheme2() {
/* 163 */     return this.theme2;
/*     */   }
/*     */   
/*     */   public void setTheme2(Theme theme2) {
/* 167 */     this.theme2 = theme2;
/*     */   }
/*     */   
/*     */   public Theme getTheme3() {
/* 171 */     return this.theme3;
/*     */   }
/*     */   
/*     */   public void setTheme3(Theme theme3) {
/* 175 */     this.theme3 = theme3;
/*     */   }
/*     */   
/*     */   public Theme getTheme4() {
/* 179 */     return this.theme4;
/*     */   }
/*     */   
/*     */   public void setTheme4(Theme theme4) {
/* 183 */     this.theme4 = theme4;
/*     */   }
/*     */   
/*     */   public List<Theme> getSelectedThemes() {
/* 187 */     return this.selectedThemes;
/*     */   }
/*     */   
/*     */   public void setSelectedThemes(List<Theme> selectedThemes) {
/* 191 */     this.selectedThemes = selectedThemes;
/*     */   }
/*     */   
/*     */   public void setService(ThemeService service) {
/* 195 */     this.service = service;
/*     */   }
/*     */   
/*     */   public char getThemeGroup(Theme theme) {
/* 199 */     return theme.getDisplayName().charAt(0);
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\input\AutoCompleteView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */