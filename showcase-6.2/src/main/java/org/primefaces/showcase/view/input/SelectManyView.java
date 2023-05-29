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
/*    */ @ManagedBean
/*    */ public class SelectManyView
/*    */ {
	/*    */ private List<String> selectedOptions;
	/*    */ private List<Theme> selectedThemes;
	/*    */ private List<Theme> themes;
	/*    */ @ManagedProperty("#{themeService}")
	/*    */ private ThemeService service;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 38 */ this.themes = this.service.getThemes();
		/*    */ }

	/*    */
	/*    */ public List<Theme> getThemes() {
		/* 42 */ return this.themes;
		/*    */ }

	/*    */
	/*    */ public void setService(ThemeService service) {
		/* 46 */ this.service = service;
		/*    */ }

	/*    */
	/*    */ public List<String> getSelectedOptions() {
		/* 50 */ return this.selectedOptions;
		/*    */ }

	/*    */
	/*    */ public void setSelectedOptions(List<String> selectedOptions) {
		/* 54 */ this.selectedOptions = selectedOptions;
		/*    */ }

	/*    */
	/*    */ public List<Theme> getSelectedThemes() {
		/* 58 */ return this.selectedThemes;
		/*    */ }

	/*    */
	/*    */ public void setSelectedThemes(List<Theme> selectedThemes) {
		/* 62 */ this.selectedThemes = selectedThemes;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\input\SelectManyView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */