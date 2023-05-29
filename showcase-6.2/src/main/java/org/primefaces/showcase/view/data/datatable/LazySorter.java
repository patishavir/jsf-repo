/*    */
package org.primefaces.showcase.view.data.datatable;

/*    */
/*    */ import java.util.Comparator;
/*    */ import org.primefaces.model.SortOrder;
/*    */ import org.primefaces.showcase.domain.Car;

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
/*    */ public class LazySorter/*    */ implements Comparator<Car>
/*    */ {
	/*    */ private String sortField;
	/*    */ private SortOrder sortOrder;

	/*    */
	/*    */ public LazySorter(String sortField, SortOrder sortOrder) {
		/* 29 */ this.sortField = sortField;
		/* 30 */ this.sortOrder = sortOrder;
		/*    */ }

	/*    */
	/*    */ public int compare(Car car1, Car car2) {
		/*    */ try {
			/* 35 */ Object value1 = Car.class.getField(this.sortField).get(car1);
			/* 36 */ Object value2 = Car.class.getField(this.sortField).get(car2);
			/*    */
			/* 38 */ int value = ((Comparable<Object>) value1).compareTo(value2);
			/*    */
			/* 40 */ return SortOrder.ASCENDING.equals(this.sortOrder) ? value : (-1 * value);
			/*    */ }
		/* 42 */ catch (Exception e) {
			/* 43 */ throw new RuntimeException();
			/*    */ }
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\LazySorter.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */