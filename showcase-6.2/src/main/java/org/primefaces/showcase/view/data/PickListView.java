/*     */
package org.primefaces.showcase.view.data;

/*     */
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ManagedProperty;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.event.SelectEvent;
/*     */ import org.primefaces.event.TransferEvent;
/*     */ import org.primefaces.event.UnselectEvent;
/*     */ import org.primefaces.model.DualListModel;
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
/*     */
/*     */ @ManagedBean
/*     */ public class PickListView
/*     */ {
	/*     */ @ManagedProperty("#{themeService}")
	/*     */ private ThemeService service;
	/*     */ private DualListModel<String> cities;
	/*     */ private DualListModel<Theme> themes;

	/*     */
	/*     */ @PostConstruct
	/*     */ public void init() {
		/* 45 */ List<String> citiesSource = new ArrayList<String>();
		/* 46 */ List<String> citiesTarget = new ArrayList<String>();
		/*     */
		/* 48 */ citiesSource.add("San Francisco");
		/* 49 */ citiesSource.add("London");
		/* 50 */ citiesSource.add("Paris");
		/* 51 */ citiesSource.add("Istanbul");
		/* 52 */ citiesSource.add("Berlin");
		/* 53 */ citiesSource.add("Barcelona");
		/* 54 */ citiesSource.add("Rome");
		/*     */
		/* 56 */ this.cities = new DualListModel(citiesSource, citiesTarget);
		/*     */
		/*     */
		/* 59 */ List<Theme> themesSource = this.service.getThemes().subList(0, 5);
		/* 60 */ List<Theme> themesTarget = new ArrayList<Theme>();
		/*     */
		/* 62 */ this.themes = new DualListModel(themesSource, themesTarget);
		/*     */ }

	/*     */
	/*     */
	/*     */ public DualListModel<String> getCities() {
		/* 67 */ return this.cities;
		/*     */ }

	/*     */
	/*     */ public void setCities(DualListModel<String> cities) {
		/* 71 */ this.cities = cities;
		/*     */ }

	/*     */
	/*     */ public ThemeService getService() {
		/* 75 */ return this.service;
		/*     */ }

	/*     */
	/*     */ public void setService(ThemeService service) {
		/* 79 */ this.service = service;
		/*     */ }

	/*     */
	/*     */ public DualListModel<Theme> getThemes() {
		/* 83 */ return this.themes;
		/*     */ }

	/*     */
	/*     */ public void setThemes(DualListModel<Theme> themes) {
		/* 87 */ this.themes = themes;
		/*     */ }

	/*     */
	/*     */ public void onTransfer(TransferEvent event) {
		/* 91 */ StringBuilder builder = new StringBuilder();
		/* 92 */ for (Object item : event.getItems()) {
			/* 93 */ builder.append(((Theme) item).getName()).append("<br />");
			/*     */ }
		/*     */
		/* 96 */ FacesMessage msg = new FacesMessage();
		/* 97 */ msg.setSeverity(FacesMessage.SEVERITY_INFO);
		/* 98 */ msg.setSummary("Items Transferred");
		/* 99 */ msg.setDetail(builder.toString());
		/*     */
		/* 101 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*     */ }

	/*     */
	/*     */ public void onSelect(SelectEvent event) {
		/* 105 */ FacesContext context = FacesContext.getCurrentInstance();
		/* 106 */ context.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", event.getObject().toString()));
		/*     */ }

	/*     */
	/*     */ public void onUnselect(UnselectEvent event) {
		/* 110 */ FacesContext context = FacesContext.getCurrentInstance();
		/* 111 */ context.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
		/*     */ }

	/*     */
	/*     */ public void onReorder() {
		/* 115 */ FacesContext context = FacesContext.getCurrentInstance();
		/* 116 */ context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "List Reordered", null));
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\PickListView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */