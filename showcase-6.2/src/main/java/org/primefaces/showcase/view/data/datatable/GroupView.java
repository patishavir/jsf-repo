/*     */
package org.primefaces.showcase.view.data.datatable;

/*     */
/*     */ import java.io.Serializable;
/*     */ import java.text.DecimalFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;
/*     */ import org.primefaces.showcase.domain.Player;
/*     */ import org.primefaces.showcase.domain.Sale;

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
/*     */
/*     */
/*     */
/*     */
/*     */ @ManagedBean(name = "dtGroupView")
/*     */ @ViewScoped
/*     */ public class GroupView/*     */ implements Serializable
/*     */ {
	/* 42 */ private static final String[] manufacturers = new String[10];
	private List<Sale> sales;
	static {
		/* 43 */ manufacturers[0] = "Apple";
		/* 44 */ manufacturers[1] = "Samsung";
		/* 45 */ manufacturers[2] = "Microsoft";
		/* 46 */ manufacturers[3] = "Philips";
		/* 47 */ manufacturers[4] = "Sony";
		/* 48 */ manufacturers[5] = "LG";
		/* 49 */ manufacturers[6] = "Sharp";
		/* 50 */ manufacturers[7] = "Panasonic";
		/* 51 */ manufacturers[8] = "HTC";
		/* 52 */ manufacturers[9] = "Nokia";
		/*     */ }
	/*     */
	/*     */
	/* 56 */ private static final String[] playerNames = new String[10];
	private List<Integer> years;
	static {
		/* 57 */ playerNames[0] = "Lionel Messi";
		/* 58 */ playerNames[1] = "Cristiano Ronaldo";
		/* 59 */ playerNames[2] = "Arjen Robben";
		/* 60 */ playerNames[3] = "Franck Ribery";
		/* 61 */ playerNames[4] = "Ronaldinho";
		/* 62 */ playerNames[5] = "Luis Suarez";
		/* 63 */ playerNames[6] = "Sergio Aguero";
		/* 64 */ playerNames[7] = "Zlatan Ibrahimovic";
		/* 65 */ playerNames[8] = "Neymar Jr";
		/* 66 */ playerNames[9] = "Andres Iniesta";
		/*     */ }
	/*     */ private List<Player> players;

	/*     */ @PostConstruct
	/*     */ public void init() {
		/* 71 */ this.sales = new ArrayList<Sale>();
		int i;
		/* 72 */ for (i = 0; i < 10; i++) {
			/* 73 */ this.sales.add(new Sale(manufacturers[i], getRandomAmount(), getRandomAmount(),
					getRandomPercentage(), getRandomPercentage()));
			/*     */ }
		/*     */
		/* 76 */ this.years = new ArrayList<Integer>();
		/* 77 */ this.years.add(Integer.valueOf(2010));
		/* 78 */ this.years.add(Integer.valueOf(2011));
		/* 79 */ this.years.add(Integer.valueOf(2012));
		/* 80 */ this.years.add(Integer.valueOf(2013));
		/* 81 */ this.years.add(Integer.valueOf(2014));
		/*     */
		/* 83 */ this.players = new ArrayList<Player>();
		/* 84 */ for (i = 0; i < 10; i++) {
			/* 85 */ this.players.add(new Player(playerNames[i], generateRandomGoalStatsData()));
			/*     */ }
		/*     */ }

	/*     */
	/*     */ public List<Sale> getSales() {
		/* 90 */ return this.sales;
		/*     */ }

	/*     */
	/*     */ private int getRandomAmount() {
		/* 94 */ return (int) (Math.random() * 100000.0D);
		/*     */ }

	/*     */
	/*     */ private int getRandomPercentage() {
		/* 98 */ return (int) (Math.random() * 100.0D);
		/*     */ }

	/*     */
	/*     */ public String getLastYearTotal() {
		/* 102 */ int total = 0;
		/*     */
		/* 104 */ for (Sale sale : getSales()) {
			/* 105 */ total += sale.getLastYearSale();
			/*     */ }
		/*     */
		/* 108 */ return (new DecimalFormat("###,###.###")).format(total);
		/*     */ }

	/*     */
	/*     */ public String getThisYearTotal() {
		/* 112 */ int total = 0;
		/*     */
		/* 114 */ for (Sale sale : getSales()) {
			/* 115 */ total += sale.getThisYearSale();
			/*     */ }
		/*     */
		/* 118 */ return (new DecimalFormat("###,###.###")).format(total);
		/*     */ }

	/*     */
	/*     */ public List<Integer> getYears() {
		/* 122 */ return this.years;
		/*     */ }

	/*     */
	/*     */ public int getYearCount() {
		/* 126 */ return this.years.size();
		/*     */ }

	/*     */
	/*     */ public List<Player> getPlayers() {
		/* 130 */ return this.players;
		/*     */ }

	/*     */
	/*     */ private Map<Integer, Integer> generateRandomGoalStatsData() {
		/* 134 */ Map<Integer, Integer> stats = new LinkedHashMap<Integer, Integer>();
		/* 135 */ for (int i = 0; i < 5; i++) {
			/* 136 */ stats.put(this.years.get(i), Integer.valueOf(getRandomGoals()));
			/*     */ }
		/*     */
		/* 139 */ return stats;
		/*     */ }

	/*     */
	/*     */ private int getRandomGoals() {
		/* 143 */ return (int) (Math.random() * 50.0D);
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\data\datatable\GroupView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */