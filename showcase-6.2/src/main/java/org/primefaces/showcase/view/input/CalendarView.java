/*     */
package org.primefaces.showcase.view.input;

/*     */
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.PrimeFaces;
/*     */ import org.primefaces.event.SelectEvent;

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
/*     */ public class CalendarView
/*     */ {
	/*     */ private Date date1;
	/*     */ private Date date2;
	/*     */ private Date date3;
	/*     */ private Date date4;
	/*     */ private Date date5;
	/*     */ private Date date6;
	/*     */ private Date date7;
	/*     */ private Date date8;
	/*     */ private Date date9;
	/*     */ private Date date10;
	/*     */ private Date date11;

	/*     */
	/*     */ public void onDateSelect(SelectEvent event) {
		/* 43 */ FacesContext facesContext = FacesContext.getCurrentInstance();
		/* 44 */ SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		/* 45 */ facesContext.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
		/*     */ }

	/*     */
	/*     */ public void click() {
		/* 49 */ PrimeFaces.current().ajax().update(new String[] { "form:display" });
		/* 50 */ PrimeFaces.current().executeScript("PF('dlg').show()");
		/*     */ }

	/*     */
	/*     */ public Date getDate1() {
		/* 54 */ return this.date1;
		/*     */ }

	/*     */
	/*     */ public void setDate1(Date date1) {
		/* 58 */ this.date1 = date1;
		/*     */ }

	/*     */
	/*     */ public Date getDate2() {
		/* 62 */ return this.date2;
		/*     */ }

	/*     */
	/*     */ public void setDate2(Date date2) {
		/* 66 */ this.date2 = date2;
		/*     */ }

	/*     */
	/*     */ public Date getDate3() {
		/* 70 */ return this.date3;
		/*     */ }

	/*     */
	/*     */ public void setDate3(Date date3) {
		/* 74 */ this.date3 = date3;
		/*     */ }

	/*     */
	/*     */ public Date getDate4() {
		/* 78 */ return this.date4;
		/*     */ }

	/*     */
	/*     */ public void setDate4(Date date4) {
		/* 82 */ this.date4 = date4;
		/*     */ }

	/*     */
	/*     */ public Date getDate5() {
		/* 86 */ return this.date5;
		/*     */ }

	/*     */
	/*     */ public void setDate5(Date date5) {
		/* 90 */ this.date5 = date5;
		/*     */ }

	/*     */
	/*     */ public Date getDate6() {
		/* 94 */ return this.date6;
		/*     */ }

	/*     */
	/*     */ public void setDate6(Date date6) {
		/* 98 */ this.date6 = date6;
		/*     */ }

	/*     */
	/*     */ public Date getDate7() {
		/* 102 */ return this.date7;
		/*     */ }

	/*     */
	/*     */ public void setDate7(Date date7) {
		/* 106 */ this.date7 = date7;
		/*     */ }

	/*     */
	/*     */ public Date getDate8() {
		/* 110 */ return this.date8;
		/*     */ }

	/*     */
	/*     */ public void setDate8(Date date8) {
		/* 114 */ this.date8 = date8;
		/*     */ }

	/*     */
	/*     */ public Date getDate9() {
		/* 118 */ return this.date9;
		/*     */ }

	/*     */
	/*     */ public void setDate9(Date date9) {
		/* 122 */ this.date9 = date9;
		/*     */ }

	/*     */
	/*     */ public Date getDate10() {
		/* 126 */ return this.date10;
		/*     */ }

	/*     */
	/*     */ public void setDate10(Date date10) {
		/* 130 */ this.date10 = date10;
		/*     */ }

	/*     */
	/*     */ public Date getDate11() {
		/* 134 */ return this.date11;
		/*     */ }

	/*     */
	/*     */ public void setDate11(Date date11) {
		/* 138 */ this.date11 = date11;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\input\CalendarView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */