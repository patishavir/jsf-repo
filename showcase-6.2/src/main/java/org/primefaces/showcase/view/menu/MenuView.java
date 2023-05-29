/*    */
package org.primefaces.showcase.view.menu;

/*    */
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.application.FacesMessage;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.faces.context.FacesContext;
/*    */ import org.primefaces.model.menu.DefaultMenuItem;
/*    */ import org.primefaces.model.menu.DefaultMenuModel;
/*    */ import org.primefaces.model.menu.DefaultSubMenu;
/*    */ import org.primefaces.model.menu.MenuElement;
/*    */ import org.primefaces.model.menu.MenuModel;

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
/*    */ public class MenuView
/*    */ {
	/*    */ private MenuModel model;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/* 34 */ this.model = (MenuModel) new DefaultMenuModel();
		/*    */
		/*    */
		/* 37 */ DefaultSubMenu firstSubmenu = new DefaultSubMenu("Dynamic Submenu");
		/*    */
		/* 39 */ DefaultMenuItem item = new DefaultMenuItem("External");
		/* 40 */ item.setUrl("http://www.primefaces.org");
		/* 41 */ item.setIcon("ui-icon-home");
		/* 42 */ firstSubmenu.addElement((MenuElement) item);
		/*    */
		/* 44 */ this.model.addElement((MenuElement) firstSubmenu);
		/*    */
		/*    */
		/* 47 */ DefaultSubMenu secondSubmenu = new DefaultSubMenu("Dynamic Actions");
		/*    */
		/* 49 */ item = new DefaultMenuItem("Save");
		/* 50 */ item.setIcon("ui-icon-disk");
		/* 51 */ item.setCommand("#{menuView.save}");
		/* 52 */ item.setUpdate("messages");
		/* 53 */ secondSubmenu.addElement((MenuElement) item);
		/*    */
		/* 55 */ item = new DefaultMenuItem("Delete");
		/* 56 */ item.setIcon("ui-icon-close");
		/* 57 */ item.setCommand("#{menuView.delete}");
		/* 58 */ item.setAjax(false);
		/* 59 */ secondSubmenu.addElement((MenuElement) item);
		/*    */
		/* 61 */ item = new DefaultMenuItem("Redirect");
		/* 62 */ item.setIcon("ui-icon-search");
		/* 63 */ item.setCommand("#{menuView.redirect}");
		/* 64 */ secondSubmenu.addElement((MenuElement) item);
		/*    */
		/* 66 */ this.model.addElement((MenuElement) secondSubmenu);
		/*    */ }

	/*    */
	/*    */ public MenuModel getModel() {
		/* 70 */ return this.model;
		/*    */ }

	/*    */
	/*    */ public void save() {
		/* 74 */ addMessage("Success", "Data saved");
		/*    */ }

	/*    */
	/*    */ public void update() {
		/* 78 */ addMessage("Success", "Data updated");
		/*    */ }

	/*    */
	/*    */ public void delete() {
		/* 82 */ addMessage("Success", "Data deleted");
		/*    */ }

	/*    */
	/*    */ public void addMessage(String summary, String detail) {
		/* 86 */ FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		/* 87 */ FacesContext.getCurrentInstance().addMessage(null, message);
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\menu\MenuView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */