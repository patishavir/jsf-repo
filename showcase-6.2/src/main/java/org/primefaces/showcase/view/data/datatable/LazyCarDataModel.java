/*     */
package org.primefaces.showcase.view.data.datatable;

/*     */
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.primefaces.model.LazyDataModel;
/*     */ import org.primefaces.model.SortOrder;
/*     */ import org.primefaces.showcase.domain.Car;
/*     */ import org.primefaces.showcase.view.data.datatable.LazySorter;

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
/*     */ public class LazyCarDataModel/*     */ extends LazyDataModel<Car>
/*     */ {
	/*     */ private List<Car> datasource;

	/*     */
	/*     */ public LazyCarDataModel(List<Car> datasource) {
		/* 35 */ this.datasource = datasource;
		/*     */ }

	/*     */
	/*     */
	/*     */ public Car getRowData(String rowKey) {
		/* 40 */ for (Car car : this.datasource) {
			/* 41 */ if (car.getId().equals(rowKey)) {
				/* 42 */ return car;
				/*     */ }
			/*     */ }
		/* 45 */ return null;
		/*     */ }

	/*     */
	/*     */
	/*     */ public Object getRowKey(Car car) {
		/* 50 */ return car.getId();
		/*     */ }

	/*     */
	/*     */
	/*     */ public List<Car> load(int first, int pageSize, String sortField, SortOrder sortOrder,
			Map<String, Object> filters) {
		/* 55 */ List<Car> data = new ArrayList<Car>();
		/*     */
		/*     */
		/* 58 */ for (Car car : this.datasource) {
			/* 59 */ boolean match = true;
			/*     */
			/* 61 */ if (filters != null) {
				/* 62 */ for (Iterator<String> it = filters.keySet().iterator(); it.hasNext();) {
					/*     */ try {
						/* 64 */ String filterProperty = it.next();
						/* 65 */ Object filterValue = filters.get(filterProperty);
						/* 66 */ String fieldValue = String.valueOf(car.getClass().getField(filterProperty).get(car));
						/*     */
						/* 68 */ if (filterValue == null || fieldValue.startsWith(filterValue.toString())) {
							/* 69 */ match = true;
							/*     */ continue;
							/*     */ }
						/* 72 */ match = false;
						/*     */
						/*     */ break;
						/* 75 */ } catch (Exception e) {
						/* 76 */ match = false;
						/*     */ }
					/*     */ }
				/*     */ }
			/*     */
			/* 81 */ if (match) {
				/* 82 */ data.add(car);
				/*     */ }
			/*     */ }
		/*     */
		/*     */
		/* 87 */ if (sortField != null) {
			/* 88 */ Collections.sort(data, (Comparator<? super Car>) new LazySorter(sortField, sortOrder));
			/*     */ }
		/*     */
		/*     */
		/* 92 */ int dataSize = data.size();
		/* 93 */ setRowCount(dataSize);
		/*     */
		/*     */
		/* 96 */ if (dataSize > pageSize) {
			/*     */ try {
				/* 98 */ return data.subList(first, first + pageSize);
				/*     */ }
			/* 100 */ catch (IndexOutOfBoundsException e) {
				/* 101 */ return data.subList(first, first + dataSize % pageSize);
				/*     */ }
			/*     */ }
		/*     */
		/* 105 */ return data;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\LazyCarDataModel.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */