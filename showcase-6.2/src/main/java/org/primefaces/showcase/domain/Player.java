/*    */
package org.primefaces.showcase.domain;

/*    */
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;

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
/*    */ public class Player
/*    */ {
	/*    */ private String name;
	/*    */ private Map<Integer, Integer> goals;

	/*    */
	/*    */ public Player() {
		/* 28 */ this.goals = new LinkedHashMap<Integer, Integer>();
		/*    */ }

	/*    */
	/*    */ public Player(String name, Map<Integer, Integer> goals) {
		/* 32 */ this.name = name;
		/* 33 */ this.goals = goals;
		/*    */ }

	/*    */
	/*    */ public String getName() {
		/* 37 */ return this.name;
		/*    */ }

	/*    */
	/*    */ public void setName(String name) {
		/* 41 */ this.name = name;
		/*    */ }

	/*    */
	/*    */ public int getGoals(int year) {
		/* 45 */ return ((Integer) this.goals.get(Integer.valueOf(year))).intValue();
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * domain\Player.class Java compiler version: 6 (50.0) JD-Core Version: 1.1.3
 */