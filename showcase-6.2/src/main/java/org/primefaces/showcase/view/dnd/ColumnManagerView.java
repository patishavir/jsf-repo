/*     */
package org.primefaces.showcase.view.dnd;

/*     */
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ManagedProperty;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.model.DefaultTreeNode;
/*     */ import org.primefaces.model.TreeNode;
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
/*     */ @ManagedBean
/*     */ @ViewScoped
/*     */ public class ColumnManagerView/*     */ implements Serializable
/*     */ {
	/* 37 */ private final List<String> VALID_COLUMN_KEYS = Arrays
			.asList(new String[] { "id", "brand", "year", "color" });
	/*     */
	/* 39 */ private List<ColumnModel> columns = new ArrayList<ColumnModel>();
	/*     */
	/*     */ private List<Car> cars;
	/*     */
	/*     */ private TreeNode availableColumns;
	/*     */
	/*     */ @ManagedProperty("#{carService}")
	/*     */ private CarService service;

	/*     */
	/*     */ @PostConstruct
	/*     */ public void init() {
		/* 50 */ this.cars = this.service.createCars(9);
		/* 51 */ createAvailableColumns();
		/* 52 */ createDynamicColumns();
		/*     */ }

	/*     */
	/*     */ private void createAvailableColumns() {
		/* 56 */ this.availableColumns = (TreeNode) new DefaultTreeNode("Root", null);
		/* 57 */ DefaultTreeNode defaultTreeNode1 = new DefaultTreeNode("Columns", this.availableColumns);
		/* 58 */ defaultTreeNode1.setExpanded(true);
		/* 59 */ DefaultTreeNode defaultTreeNode2 = new DefaultTreeNode("column", new ColumnModel("Id", "id"),
				(TreeNode) defaultTreeNode1);
		/* 60 */ DefaultTreeNode defaultTreeNode3 = new DefaultTreeNode("column", new ColumnModel("Year", "year"),
				(TreeNode) defaultTreeNode1);
		/* 61 */ DefaultTreeNode defaultTreeNode4 = new DefaultTreeNode("column", new ColumnModel("Brand", "brand"),
				(TreeNode) defaultTreeNode1);
		/* 62 */ DefaultTreeNode defaultTreeNode5 = new DefaultTreeNode("column", new ColumnModel("Color", "color"),
				(TreeNode) defaultTreeNode1);
		/*     */ }

	/*     */
	/*     */ public void createDynamicColumns() {
		/* 66 */ String[] columnKeys = { "id", "year", "brand" };
		/* 67 */ this.columns.clear();
		/*     */
		/* 69 */ for (String columnKey : columnKeys) {
			/* 70 */ String key = columnKey.trim();
			/*     */
			/* 72 */ if (this.VALID_COLUMN_KEYS.contains(key)) {
				/* 73 */ this.columns.add(new ColumnModel(columnKey.toUpperCase(), columnKey));
				/*     */ }
			/*     */ }
		/*     */ }

	/*     */
	/*     */ public void treeToTable() {
		/* 79 */ Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap();
		/* 80 */ String property = params.get("property");
		/* 81 */ String droppedColumnId = params.get("droppedColumnId");
		/* 82 */ String dropPos = params.get("dropPos");
		/*     */
		/* 84 */ String[] droppedColumnTokens = droppedColumnId.split(":");
		/* 85 */ int draggedColumnIndex = Integer.parseInt(droppedColumnTokens[droppedColumnTokens.length - 1]);
		/* 86 */ int dropColumnIndex = draggedColumnIndex + Integer.parseInt(dropPos);
		/*     */
		/*     */
		/* 89 */ this.columns.add(dropColumnIndex, new ColumnModel(property.toUpperCase(), property));
		/*     */
		/*     */
		/* 92 */ TreeNode root = this.availableColumns.getChildren().get(0);
		/* 93 */ for (TreeNode node : root.getChildren()) {
			/* 94 */ ColumnModel model = (ColumnModel) node.getData();
			/* 95 */ if (model.getProperty().equals(property)) {
				/* 96 */ root.getChildren().remove(node);
				/*     */ break;
				/*     */ }
			/*     */ }
		/*     */ }

	/*     */
	/*     */ public void tableToTree() {
		/* 103 */ Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap();
		/* 104 */ int colIndex = Integer.parseInt(params.get("colIndex"));
		/*     */
		/*     */
		/* 107 */ ColumnModel model = this.columns.remove(colIndex);
		/*     */
		/*     */
		/* 110 */ DefaultTreeNode defaultTreeNode = new DefaultTreeNode("column", model,
				this.availableColumns.getChildren().get(0));
		/*     */ }

	/*     */
	/*     */ public List<Car> getCars() {
		/* 114 */ return this.cars;
		/*     */ }

	/*     */
	/*     */ public List<ColumnModel> getColumns() {
		/* 118 */ return this.columns;
		/*     */ }

	/*     */
	/*     */ public TreeNode getAvailableColumns() {
		/* 122 */ return this.availableColumns;
		/*     */ }

	/*     */
	/*     */ public void setService(CarService service) {
		/* 126 */ this.service = service;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\dnd\ColumnManagerView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */