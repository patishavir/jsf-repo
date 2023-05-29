/*    */ package WEB-INF.classes.org.primefaces.showcase.view.csv;
/*    */ 
/*    */ import java.util.Map;
/*    */ import java.util.regex.Pattern;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.component.UIComponent;
/*    */ import javax.faces.context.FacesContext;
/*    */ import javax.faces.validator.FacesValidator;
/*    */ import javax.faces.validator.Validator;
/*    */ import javax.faces.validator.ValidatorException;
/*    */ import org.primefaces.validate.ClientValidator;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @FacesValidator("custom.emailValidator")
/*    */ public class EmailValidator
/*    */   implements Validator, ClientValidator
/*    */ {
/* 40 */   private Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
/*    */   private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
/*    */   
/*    */   public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
/* 44 */     if (value == null) {
/*    */       return;
/*    */     }
/*    */     
/* 48 */     if (!this.pattern.matcher(value.toString()).matches()) {
/* 49 */       throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation Error", value + " is not a valid email;"));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Object> getMetadata() {
/* 55 */     return null;
/*    */   }
/*    */   
/*    */   public String getValidatorId() {
/* 59 */     return "custom.emailValidator";
/*    */   }
/*    */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\csv\EmailValidator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */