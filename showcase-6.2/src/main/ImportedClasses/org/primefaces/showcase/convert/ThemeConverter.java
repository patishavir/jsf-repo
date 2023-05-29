/*    */ package WEB-INF.classes.org.primefaces.showcase.convert;
/*    */ 
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.component.UIComponent;
/*    */ import javax.faces.context.FacesContext;
/*    */ import javax.faces.convert.Converter;
/*    */ import javax.faces.convert.ConverterException;
/*    */ import javax.faces.convert.FacesConverter;
/*    */ import org.primefaces.showcase.domain.Theme;
/*    */ import org.primefaces.showcase.service.ThemeService;
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
/*    */ @FacesConverter("themeConverter")
/*    */ public class ThemeConverter
/*    */   implements Converter
/*    */ {
/*    */   public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
/* 32 */     if (value != null && value.trim().length() > 0) {
/*    */       try {
/* 34 */         ThemeService service = (ThemeService)fc.getExternalContext().getApplicationMap().get("themeService");
/* 35 */         return service.getThemes().get(Integer.parseInt(value));
/* 36 */       } catch (NumberFormatException e) {
/* 37 */         throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
/*    */       } 
/*    */     }
/*    */     
/* 41 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getAsString(FacesContext fc, UIComponent uic, Object object) {
/* 46 */     if (object != null) {
/* 47 */       return String.valueOf(((Theme)object).getId());
/*    */     }
/*    */     
/* 50 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\convert\ThemeConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */