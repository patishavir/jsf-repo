/*    */
package org.primefaces.showcase.view.input;

/*    */
/*    */ import java.util.List;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.bean.ManagedProperty;
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
/*    */
/*    */
/*    */
/*    */ @ManagedBean
/*    */ public class SelectOneView
/*    */ {
	/*    */ private String option;
	/*    */ private Theme theme;
	/*    */ private List<Theme> themes;
	/*    */ @ManagedProperty("#{themeService}")
	/*    */ private ThemeService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 39 */ this.themes = this.service.getThemes();
		/*    */ }

	/*    */
	/*    */ public String getOption() {
		/* 43 */ return this.option;
		/*    */ }

	/*    */
	/*    */ public void setOption(String option) {
		/* 47 */ this.option = option;
		/*    */ }

	/*    */
	/*    */ public Theme getTheme() {
		/* 51 */ return this.theme;
		/*    */ }

	/*    */
	/*    */ public void setTheme(Theme theme) {
		/* 55 */ this.theme = theme;
		/*    */ }

	/*    */
	/*    */ public List<Theme> getThemes() {
		/* 59 */ return this.themes;
		/*    */ }

	/*    */
	/*    */ public void setService(ThemeService service) {
		/* 63 */ this.service = service;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\input\SelectOneView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */