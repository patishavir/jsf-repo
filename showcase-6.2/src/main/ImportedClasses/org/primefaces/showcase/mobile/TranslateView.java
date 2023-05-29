/*     */ package WEB-INF.classes.org.primefaces.showcase.mobile;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.URL;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.ResourceBundle;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.json.JSONArray;
/*     */ import org.primefaces.json.JSONObject;
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
/*     */ public class TranslateView
/*     */ {
/*     */   private static final String TRANSLATE_URL_KEY = "translate.url";
/*     */   private static final String BUNDLE_NAME = "translate";
/*     */   private String translateURL;
/*     */   private String from;
/*     */   private String to;
/*     */   private String text;
/*     */   private String result;
/*     */   private Map<String, String> languages;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  46 */     this.languages = new LinkedHashMap<String, String>();
/*  47 */     this.languages.put("English", "en");
/*  48 */     this.languages.put("Turkish", "tr");
/*  49 */     this.languages.put("Italian", "it");
/*  50 */     this.languages.put("Spanish", "es");
/*  51 */     this.languages.put("German", "de");
/*  52 */     this.languages.put("French", "fr");
/*  53 */     this.languages.put("Portuguese", "pt");
/*     */     
/*  55 */     Map<String, Object> app = FacesContext.getCurrentInstance().getExternalContext().getApplicationMap();
/*  56 */     this.translateURL = (String)app.get("translate.url");
/*     */     
/*  58 */     if (this.translateURL == null) {
/*  59 */       this.translateURL = ResourceBundle.getBundle("translate").getString("translate.url");
/*  60 */       app.put("translate.url", this.translateURL);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void translate() throws Exception {
/*  65 */     String url = this.translateURL + "&lang=" + this.from + "-" + this.to + "&text=" + this.text;
/*  66 */     String response = getResponse(url);
/*  67 */     JSONObject json = new JSONObject(response);
/*  68 */     JSONArray jsonArray = json.getJSONArray("text");
/*  69 */     this.result = jsonArray.getString(0);
/*     */   }
/*     */   
/*     */   private String getResponse(String url) throws Exception {
/*  73 */     URL obj = new URL(url);
/*  74 */     HttpURLConnection con = (HttpURLConnection)obj.openConnection();
/*  75 */     con.setRequestMethod("GET");
/*  76 */     int responseCode = con.getResponseCode();
/*  77 */     BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
/*     */     
/*  79 */     StringBuilder response = new StringBuilder();
/*     */     String inputLine;
/*  81 */     while ((inputLine = in.readLine()) != null) {
/*  82 */       response.append(inputLine);
/*     */     }
/*     */     
/*  85 */     return response.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getLanguages() {
/*  89 */     return this.languages;
/*     */   }
/*     */   
/*     */   public String getFrom() {
/*  93 */     return this.from;
/*     */   }
/*     */   public void setFrom(String from) {
/*  96 */     this.from = from;
/*     */   }
/*     */   
/*     */   public String getTo() {
/* 100 */     return this.to;
/*     */   }
/*     */   public void setTo(String to) {
/* 103 */     this.to = to;
/*     */   }
/*     */   
/*     */   public String getText() {
/* 107 */     return this.text;
/*     */   }
/*     */   public void setText(String text) {
/* 110 */     this.text = text;
/*     */   }
/*     */   
/*     */   public String getResult() {
/* 114 */     return this.result;
/*     */   }
/*     */   
/*     */   public void setResult(String result) {
/* 118 */     this.result = result;
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\mobile\TranslateView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */