/*     */ package WEB-INF.classes.org.primefaces.showcase.view.data.dataexporter;
/*     */ 
/*     */ import com.lowagie.text.BadElementException;
/*     */ import com.lowagie.text.Document;
/*     */ import com.lowagie.text.DocumentException;
/*     */ import com.lowagie.text.Element;
/*     */ import com.lowagie.text.Image;
/*     */ import com.lowagie.text.PageSize;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.Serializable;
/*     */ import java.util.List;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ManagedProperty;
/*     */ import javax.faces.context.ExternalContext;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.apache.poi.hssf.usermodel.HSSFCell;
/*     */ import org.apache.poi.hssf.usermodel.HSSFCellStyle;
/*     */ import org.apache.poi.hssf.usermodel.HSSFRow;
/*     */ import org.apache.poi.hssf.usermodel.HSSFSheet;
/*     */ import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/*     */ import org.apache.poi.hssf.util.HSSFColor;
/*     */ import org.apache.poi.ss.usermodel.FillPatternType;
/*     */ import org.primefaces.component.export.ExcelOptions;
/*     */ import org.primefaces.component.export.PDFOptions;
/*     */ import org.primefaces.showcase.domain.Car;
/*     */ import org.primefaces.showcase.service.CarService;
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
/*     */ public class CustomizedDocumentsView
/*     */   implements Serializable
/*     */ {
/*     */   private List<Car> cars;
/*     */   private List<Car> cars2;
/*     */   private ExcelOptions excelOpt;
/*     */   private PDFOptions pdfOpt;
/*     */   @ManagedProperty("#{carService}")
/*     */   private CarService service;
/*     */   
/*     */   @PostConstruct
/*     */   public void init() {
/*  61 */     this.cars = this.service.createCars(100);
/*     */     
/*  63 */     this.cars2 = this.service.createCars(100);
/*  64 */     customizationOptions();
/*     */   }
/*     */   
/*     */   public void customizationOptions() {
/*  68 */     this.excelOpt = new ExcelOptions();
/*  69 */     this.excelOpt.setFacetBgColor("#F88017");
/*  70 */     this.excelOpt.setFacetFontSize("10");
/*  71 */     this.excelOpt.setFacetFontColor("#0000ff");
/*  72 */     this.excelOpt.setFacetFontStyle("BOLD");
/*  73 */     this.excelOpt.setCellFontColor("#00ff00");
/*  74 */     this.excelOpt.setCellFontSize("8");
/*     */     
/*  76 */     this.pdfOpt = new PDFOptions();
/*  77 */     this.pdfOpt.setFacetBgColor("#F88017");
/*  78 */     this.pdfOpt.setFacetFontColor("#0000ff");
/*  79 */     this.pdfOpt.setFacetFontStyle("BOLD");
/*  80 */     this.pdfOpt.setCellFontSize("12");
/*     */   }
/*     */   
/*     */   public List<Car> getCars() {
/*  84 */     return this.cars;
/*     */   }
/*     */   
/*     */   public List<Car> getCars2() {
/*  88 */     return this.cars2;
/*     */   }
/*     */   
/*     */   public ExcelOptions getExcelOpt() {
/*  92 */     return this.excelOpt;
/*     */   }
/*     */   
/*     */   public void setExcelOpt(ExcelOptions excelOpt) {
/*  96 */     this.excelOpt = excelOpt;
/*     */   }
/*     */   
/*     */   public PDFOptions getPdfOpt() {
/* 100 */     return this.pdfOpt;
/*     */   }
/*     */   
/*     */   public void setPdfOpt(PDFOptions pdfOpt) {
/* 104 */     this.pdfOpt = pdfOpt;
/*     */   }
/*     */   
/*     */   public void setService(CarService service) {
/* 108 */     this.service = service;
/*     */   }
/*     */   
/*     */   public void postProcessXLS(Object document) {
/* 112 */     HSSFWorkbook wb = (HSSFWorkbook)document;
/* 113 */     HSSFSheet sheet = wb.getSheetAt(0);
/* 114 */     HSSFRow header = sheet.getRow(0);
/*     */     
/* 116 */     HSSFCellStyle cellStyle = wb.createCellStyle();
/* 117 */     cellStyle.setFillForegroundColor(HSSFColor.GREEN.index);
/* 118 */     cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
/*     */     
/* 120 */     for (int i = 0; i < header.getPhysicalNumberOfCells(); i++) {
/* 121 */       HSSFCell cell = header.getCell(i);
/*     */       
/* 123 */       cell.setCellStyle(cellStyle);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void preProcessPDF(Object document) throws IOException, BadElementException, DocumentException {
/* 128 */     Document pdf = (Document)document;
/* 129 */     pdf.open();
/* 130 */     pdf.setPageSize(PageSize.A4);
/*     */     
/* 132 */     ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
/* 133 */     String logo = externalContext.getRealPath("") + File.separator + "resources" + File.separator + "demo" + File.separator + "images" + File.separator + "prime_logo.png";
/*     */     
/* 135 */     pdf.add((Element)Image.getInstance(logo));
/*     */   }
/*     */ }


/* Location:              D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\view\data\dataexporter\CustomizedDocumentsView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */