/*     */
package org.primefaces.showcase.view.chart;

/*     */
/*     */ import java.io.Serializable;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.annotation.PostConstruct;
/*     */ import javax.faces.application.FacesMessage;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.context.FacesContext;
/*     */ import org.primefaces.event.ItemSelectEvent;
/*     */ import org.primefaces.model.chart.Axis;
/*     */ import org.primefaces.model.chart.AxisType;
/*     */ import org.primefaces.model.chart.BarChartModel;
/*     */ import org.primefaces.model.chart.BarChartSeries;
/*     */ import org.primefaces.model.chart.BubbleChartModel;
/*     */ import org.primefaces.model.chart.BubbleChartSeries;
/*     */ import org.primefaces.model.chart.CartesianChartModel;
/*     */ import org.primefaces.model.chart.CategoryAxis;
/*     */ import org.primefaces.model.chart.ChartSeries;
/*     */ import org.primefaces.model.chart.DateAxis;
/*     */ import org.primefaces.model.chart.DonutChartModel;
/*     */ import org.primefaces.model.chart.HorizontalBarChartModel;
/*     */ import org.primefaces.model.chart.LineChartModel;
/*     */ import org.primefaces.model.chart.LineChartSeries;
/*     */ import org.primefaces.model.chart.LinearAxis;
/*     */ import org.primefaces.model.chart.MeterGaugeChartModel;
/*     */ import org.primefaces.model.chart.OhlcChartModel;
/*     */ import org.primefaces.model.chart.OhlcChartSeries;
/*     */ import org.primefaces.model.chart.PieChartModel;

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
/*     */ public class ChartView/*     */ implements Serializable
/*     */ {
	/*     */ private LineChartModel lineModel1;
	/*     */ private LineChartModel lineModel2;
	/*     */ private LineChartModel zoomModel;
	/*     */ private CartesianChartModel combinedModel;
	/*     */ private CartesianChartModel fillToZero;
	/*     */ private LineChartModel areaModel;
	/*     */ private BarChartModel barModel;
	/*     */ private HorizontalBarChartModel horizontalBarModel;
	/*     */ private PieChartModel pieModel1;
	/*     */ private PieChartModel pieModel2;
	/*     */ private DonutChartModel donutModel1;
	/*     */ private DonutChartModel donutModel2;
	/*     */ private MeterGaugeChartModel meterGaugeModel1;
	/*     */ private MeterGaugeChartModel meterGaugeModel2;
	/*     */ private BubbleChartModel bubbleModel1;
	/*     */ private BubbleChartModel bubbleModel2;
	/*     */ private OhlcChartModel ohlcModel;
	/*     */ private OhlcChartModel ohlcModel2;
	/*     */ private PieChartModel livePieModel;
	/*     */ private LineChartModel animatedModel1;
	/*     */ private BarChartModel animatedModel2;
	/*     */ private LineChartModel multiAxisModel;
	/*     */ private LineChartModel dateModel;

	/*     */
	/*     */ @PostConstruct
	/*     */ public void init() {
		/* 78 */ createLineModels();
		/* 79 */ createAreaModel();
		/* 80 */ createPieModels();
		/* 81 */ createDonutModels();
		/* 82 */ createBubbleModels();
		/* 83 */ createOhlcModels();
		/* 84 */ createFillToZero();
		/* 85 */ createMeterGaugeModels();
		/* 86 */ createBarModels();
		/* 87 */ createAnimatedModels();
		/* 88 */ createCombinedModel();
		/* 89 */ createMultiAxisModel();
		/* 90 */ createDateModel();
		/*     */ }

	/*     */
	/*     */
	/*     */ public void itemSelect(ItemSelectEvent event) {
		/* 95 */ FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
				"Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
		/*     */
		/* 97 */ FacesContext.getCurrentInstance().addMessage(null, msg);
		/*     */ }

	/*     */
	/*     */ public LineChartModel getLineModel1() {
		/* 101 */ return this.lineModel1;
		/*     */ }

	/*     */
	/*     */ public LineChartModel getLineModel2() {
		/* 105 */ return this.lineModel2;
		/*     */ }

	/*     */
	/*     */ public LineChartModel getZoomModel() {
		/* 109 */ return this.zoomModel;
		/*     */ }

	/*     */
	/*     */ public CartesianChartModel getCombinedModel() {
		/* 113 */ return this.combinedModel;
		/*     */ }

	/*     */
	/*     */ public CartesianChartModel getAreaModel() {
		/* 117 */ return (CartesianChartModel) this.areaModel;
		/*     */ }

	/*     */
	/*     */ public PieChartModel getPieModel1() {
		/* 121 */ return this.pieModel1;
		/*     */ }

	/*     */
	/*     */ public PieChartModel getPieModel2() {
		/* 125 */ return this.pieModel2;
		/*     */ }

	/*     */
	/*     */ public MeterGaugeChartModel getMeterGaugeModel1() {
		/* 129 */ return this.meterGaugeModel1;
		/*     */ }

	/*     */
	/*     */ public MeterGaugeChartModel getMeterGaugeModel2() {
		/* 133 */ return this.meterGaugeModel2;
		/*     */ }

	/*     */
	/*     */ public DonutChartModel getDonutModel1() {
		/* 137 */ return this.donutModel1;
		/*     */ }

	/*     */
	/*     */ public DonutChartModel getDonutModel2() {
		/* 141 */ return this.donutModel2;
		/*     */ }

	/*     */
	/*     */ public CartesianChartModel getFillToZero() {
		/* 145 */ return this.fillToZero;
		/*     */ }

	/*     */
	/*     */ public BubbleChartModel getBubbleModel1() {
		/* 149 */ return this.bubbleModel1;
		/*     */ }

	/*     */
	/*     */ public BubbleChartModel getBubbleModel2() {
		/* 153 */ return this.bubbleModel2;
		/*     */ }

	/*     */
	/*     */ public OhlcChartModel getOhlcModel() {
		/* 157 */ return this.ohlcModel;
		/*     */ }

	/*     */
	/*     */ public OhlcChartModel getOhlcModel2() {
		/* 161 */ return this.ohlcModel2;
		/*     */ }

	/*     */
	/*     */ public BarChartModel getBarModel() {
		/* 165 */ return this.barModel;
		/*     */ }

	/*     */
	/*     */ public HorizontalBarChartModel getHorizontalBarModel() {
		/* 169 */ return this.horizontalBarModel;
		/*     */ }

	/*     */
	/*     */ public LineChartModel getAnimatedModel1() {
		/* 173 */ return this.animatedModel1;
		/*     */ }

	/*     */
	/*     */ public BarChartModel getAnimatedModel2() {
		/* 177 */ return this.animatedModel2;
		/*     */ }

	/*     */
	/*     */ public LineChartModel getMultiAxisModel() {
		/* 181 */ return this.multiAxisModel;
		/*     */ }

	/*     */
	/*     */ public LineChartModel getDateModel() {
		/* 185 */ return this.dateModel;
		/*     */ }

	/*     */
	/*     */ public PieChartModel getLivePieModel() {
		/* 189 */ int random1 = (int) (Math.random() * 1000.0D);
		/* 190 */ int random2 = (int) (Math.random() * 1000.0D);
		/*     */
		/* 192 */ this.livePieModel.getData().put("Candidate 1", Integer.valueOf(random1));
		/* 193 */ this.livePieModel.getData().put("Candidate 2", Integer.valueOf(random2));
		/*     */
		/* 195 */ this.livePieModel.setTitle("Votes");
		/* 196 */ this.livePieModel.setLegendPosition("ne");
		/*     */
		/* 198 */ return this.livePieModel;
		/*     */ }

	/*     */
	/*     */ private LineChartModel initCategoryModel() {
		/* 202 */ LineChartModel model = new LineChartModel();
		/*     */
		/* 204 */ ChartSeries boys = new ChartSeries();
		/* 205 */ boys.setLabel("Boys");
		/* 206 */ boys.set("2004", Integer.valueOf(120));
		/* 207 */ boys.set("2005", Integer.valueOf(100));
		/* 208 */ boys.set("2006", Integer.valueOf(44));
		/* 209 */ boys.set("2007", Integer.valueOf(150));
		/* 210 */ boys.set("2008", Integer.valueOf(25));
		/*     */
		/* 212 */ ChartSeries girls = new ChartSeries();
		/* 213 */ girls.setLabel("Girls");
		/* 214 */ girls.set("2004", Integer.valueOf(52));
		/* 215 */ girls.set("2005", Integer.valueOf(60));
		/* 216 */ girls.set("2006", Integer.valueOf(110));
		/* 217 */ girls.set("2007", Integer.valueOf(90));
		/* 218 */ girls.set("2008", Integer.valueOf(120));
		/*     */
		/* 220 */ model.addSeries(boys);
		/* 221 */ model.addSeries(girls);
		/*     */
		/* 223 */ return model;
		/*     */ }

	/*     */
	/*     */ private void createLineModels() {
		/* 227 */ this.lineModel1 = initLinearModel();
		/* 228 */ this.lineModel1.setTitle("Linear Chart");
		/* 229 */ this.lineModel1.setLegendPosition("e");
		/* 230 */ Axis yAxis = this.lineModel1.getAxis(AxisType.Y);
		/* 231 */ yAxis.setMin(Integer.valueOf(0));
		/* 232 */ yAxis.setMax(Integer.valueOf(10));
		/*     */
		/* 234 */ this.lineModel2 = initCategoryModel();
		/* 235 */ this.lineModel2.setTitle("Category Chart");
		/* 236 */ this.lineModel2.setLegendPosition("e");
		/* 237 */ this.lineModel2.setShowPointLabels(true);
		/* 238 */ this.lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Years"));
		/* 239 */ yAxis = this.lineModel2.getAxis(AxisType.Y);
		/* 240 */ yAxis.setLabel("Births");
		/* 241 */ yAxis.setMin(Integer.valueOf(0));
		/* 242 */ yAxis.setMax(Integer.valueOf(200));
		/*     */
		/* 244 */ this.zoomModel = initLinearModel();
		/* 245 */ this.zoomModel.setTitle("Zoom");
		/* 246 */ this.zoomModel.setZoom(true);
		/* 247 */ this.zoomModel.setLegendPosition("e");
		/* 248 */ yAxis = this.zoomModel.getAxis(AxisType.Y);
		/* 249 */ yAxis.setMin(Integer.valueOf(0));
		/* 250 */ yAxis.setMax(Integer.valueOf(10));
		/*     */ }

	/*     */
	/*     */ private void createAreaModel() {
		/* 254 */ this.areaModel = new LineChartModel();
		/*     */
		/* 256 */ LineChartSeries boys = new LineChartSeries();
		/* 257 */ boys.setFill(true);
		/* 258 */ boys.setLabel("Boys");
		/* 259 */ boys.set("2004", Integer.valueOf(120));
		/* 260 */ boys.set("2005", Integer.valueOf(100));
		/* 261 */ boys.set("2006", Integer.valueOf(44));
		/* 262 */ boys.set("2007", Integer.valueOf(150));
		/* 263 */ boys.set("2008", Integer.valueOf(25));
		/*     */
		/* 265 */ LineChartSeries girls = new LineChartSeries();
		/* 266 */ girls.setFill(true);
		/* 267 */ girls.setLabel("Girls");
		/* 268 */ girls.set("2004", Integer.valueOf(52));
		/* 269 */ girls.set("2005", Integer.valueOf(60));
		/* 270 */ girls.set("2006", Integer.valueOf(110));
		/* 271 */ girls.set("2007", Integer.valueOf(90));
		/* 272 */ girls.set("2008", Integer.valueOf(120));
		/*     */
		/* 274 */ this.areaModel.addSeries((ChartSeries) boys);
		/* 275 */ this.areaModel.addSeries((ChartSeries) girls);
		/*     */
		/* 277 */ this.areaModel.setTitle("Area Chart");
		/* 278 */ this.areaModel.setLegendPosition("ne");
		/* 279 */ this.areaModel.setStacked(true);
		/* 280 */ this.areaModel.setShowPointLabels(true);
		/*     */
		/* 282 */ CategoryAxis categoryAxis = new CategoryAxis("Years");
		/* 283 */ this.areaModel.getAxes().put(AxisType.X, categoryAxis);
		/* 284 */ Axis yAxis = this.areaModel.getAxis(AxisType.Y);
		/* 285 */ yAxis.setLabel("Births");
		/* 286 */ yAxis.setMin(Integer.valueOf(0));
		/* 287 */ yAxis.setMax(Integer.valueOf(300));
		/*     */ }

	/*     */
	/*     */ private BarChartModel initBarModel() {
		/* 291 */ BarChartModel model = new BarChartModel();
		/*     */
		/* 293 */ ChartSeries boys = new ChartSeries();
		/* 294 */ boys.setLabel("Boys");
		/* 295 */ boys.set("2004", Integer.valueOf(120));
		/* 296 */ boys.set("2005", Integer.valueOf(100));
		/* 297 */ boys.set("2006", Integer.valueOf(44));
		/* 298 */ boys.set("2007", Integer.valueOf(150));
		/* 299 */ boys.set("2008", Integer.valueOf(25));
		/*     */
		/* 301 */ ChartSeries girls = new ChartSeries();
		/* 302 */ girls.setLabel("Girls");
		/* 303 */ girls.set("2004", Integer.valueOf(52));
		/* 304 */ girls.set("2005", Integer.valueOf(60));
		/* 305 */ girls.set("2006", Integer.valueOf(110));
		/* 306 */ girls.set("2007", Integer.valueOf(135));
		/* 307 */ girls.set("2008", Integer.valueOf(120));
		/*     */
		/* 309 */ model.addSeries(boys);
		/* 310 */ model.addSeries(girls);
		/*     */
		/* 312 */ return model;
		/*     */ }

	/*     */
	/*     */ private void createBarModels() {
		/* 316 */ createBarModel();
		/* 317 */ createHorizontalBarModel();
		/*     */ }

	/*     */
	/*     */ private void createBarModel() {
		/* 321 */ this.barModel = initBarModel();
		/*     */
		/* 323 */ this.barModel.setTitle("Bar Chart");
		/* 324 */ this.barModel.setLegendPosition("ne");
		/*     */
		/* 326 */ Axis xAxis = this.barModel.getAxis(AxisType.X);
		/* 327 */ xAxis.setLabel("Gender");
		/*     */
		/* 329 */ Axis yAxis = this.barModel.getAxis(AxisType.Y);
		/* 330 */ yAxis.setLabel("Births");
		/* 331 */ yAxis.setMin(Integer.valueOf(0));
		/* 332 */ yAxis.setMax(Integer.valueOf(200));
		/*     */ }

	/*     */
	/*     */ private void createHorizontalBarModel() {
		/* 336 */ this.horizontalBarModel = new HorizontalBarChartModel();
		/*     */
		/* 338 */ ChartSeries boys = new ChartSeries();
		/* 339 */ boys.setLabel("Boys");
		/* 340 */ boys.set("2004", Integer.valueOf(50));
		/* 341 */ boys.set("2005", Integer.valueOf(96));
		/* 342 */ boys.set("2006", Integer.valueOf(44));
		/* 343 */ boys.set("2007", Integer.valueOf(55));
		/* 344 */ boys.set("2008", Integer.valueOf(25));
		/*     */
		/* 346 */ ChartSeries girls = new ChartSeries();
		/* 347 */ girls.setLabel("Girls");
		/* 348 */ girls.set("2004", Integer.valueOf(52));
		/* 349 */ girls.set("2005", Integer.valueOf(60));
		/* 350 */ girls.set("2006", Integer.valueOf(82));
		/* 351 */ girls.set("2007", Integer.valueOf(35));
		/* 352 */ girls.set("2008", Integer.valueOf(120));
		/*     */
		/* 354 */ this.horizontalBarModel.addSeries(boys);
		/* 355 */ this.horizontalBarModel.addSeries(girls);
		/*     */
		/* 357 */ this.horizontalBarModel.setTitle("Horizontal and Stacked");
		/* 358 */ this.horizontalBarModel.setLegendPosition("e");
		/* 359 */ this.horizontalBarModel.setStacked(true);
		/*     */
		/* 361 */ Axis xAxis = this.horizontalBarModel.getAxis(AxisType.X);
		/* 362 */ xAxis.setLabel("Births");
		/* 363 */ xAxis.setMin(Integer.valueOf(0));
		/* 364 */ xAxis.setMax(Integer.valueOf(200));
		/*     */
		/* 366 */ Axis yAxis = this.horizontalBarModel.getAxis(AxisType.Y);
		/* 367 */ yAxis.setLabel("Gender");
		/*     */ }

	/*     */
	/*     */ private void createCombinedModel() {
		/* 371 */ this.combinedModel = (CartesianChartModel) new BarChartModel();
		/*     */
		/* 373 */ BarChartSeries boys = new BarChartSeries();
		/* 374 */ boys.setLabel("Boys");
		/*     */
		/* 376 */ boys.set("2004", Integer.valueOf(120));
		/* 377 */ boys.set("2005", Integer.valueOf(100));
		/* 378 */ boys.set("2006", Integer.valueOf(44));
		/* 379 */ boys.set("2007", Integer.valueOf(150));
		/* 380 */ boys.set("2008", Integer.valueOf(25));
		/*     */
		/* 382 */ LineChartSeries girls = new LineChartSeries();
		/* 383 */ girls.setLabel("Girls");
		/*     */
		/* 385 */ girls.set("2004", Integer.valueOf(52));
		/* 386 */ girls.set("2005", Integer.valueOf(60));
		/* 387 */ girls.set("2006", Integer.valueOf(110));
		/* 388 */ girls.set("2007", Integer.valueOf(135));
		/* 389 */ girls.set("2008", Integer.valueOf(120));
		/*     */
		/* 391 */ this.combinedModel.addSeries((ChartSeries) boys);
		/* 392 */ this.combinedModel.addSeries((ChartSeries) girls);
		/*     */
		/* 394 */ this.combinedModel.setTitle("Bar and Line");
		/* 395 */ this.combinedModel.setLegendPosition("ne");
		/* 396 */ this.combinedModel.setMouseoverHighlight(false);
		/* 397 */ this.combinedModel.setShowDatatip(false);
		/* 398 */ this.combinedModel.setShowPointLabels(true);
		/* 399 */ Axis yAxis = this.combinedModel.getAxis(AxisType.Y);
		/* 400 */ yAxis.setMin(Integer.valueOf(0));
		/* 401 */ yAxis.setMax(Integer.valueOf(200));
		/*     */ }

	/*     */
	/*     */ private void createMultiAxisModel() {
		/* 405 */ this.multiAxisModel = new LineChartModel();
		/*     */
		/* 407 */ BarChartSeries boys = new BarChartSeries();
		/* 408 */ boys.setLabel("Boys");
		/*     */
		/* 410 */ boys.set("2004", Integer.valueOf(120));
		/* 411 */ boys.set("2005", Integer.valueOf(100));
		/* 412 */ boys.set("2006", Integer.valueOf(44));
		/* 413 */ boys.set("2007", Integer.valueOf(150));
		/* 414 */ boys.set("2008", Integer.valueOf(25));
		/*     */
		/* 416 */ LineChartSeries girls = new LineChartSeries();
		/* 417 */ girls.setLabel("Girls");
		/* 418 */ girls.setXaxis(AxisType.X2);
		/* 419 */ girls.setYaxis(AxisType.Y2);
		/*     */
		/* 421 */ girls.set("A", Integer.valueOf(52));
		/* 422 */ girls.set("B", Integer.valueOf(60));
		/* 423 */ girls.set("C", Integer.valueOf(110));
		/* 424 */ girls.set("D", Integer.valueOf(135));
		/* 425 */ girls.set("E", Integer.valueOf(120));
		/*     */
		/* 427 */ this.multiAxisModel.addSeries((ChartSeries) boys);
		/* 428 */ this.multiAxisModel.addSeries((ChartSeries) girls);
		/*     */
		/* 430 */ this.multiAxisModel.setTitle("Multi Axis Chart");
		/* 431 */ this.multiAxisModel.setMouseoverHighlight(false);
		/*     */
		/* 433 */ this.multiAxisModel.getAxes().put(AxisType.X, new CategoryAxis("Years"));
		/* 434 */ this.multiAxisModel.getAxes().put(AxisType.X2, new CategoryAxis("Period"));
		/*     */
		/* 436 */ Axis yAxis = this.multiAxisModel.getAxis(AxisType.Y);
		/* 437 */ yAxis.setLabel("Birth");
		/* 438 */ yAxis.setMin(Integer.valueOf(0));
		/* 439 */ yAxis.setMax(Integer.valueOf(200));
		/*     */
		/* 441 */ LinearAxis linearAxis = new LinearAxis("Number");
		/* 442 */ linearAxis.setMin(Integer.valueOf(0));
		/* 443 */ linearAxis.setMax(Integer.valueOf(200));
		/*     */
		/* 445 */ this.multiAxisModel.getAxes().put(AxisType.Y2, linearAxis);
		/*     */ }

	/*     */
	/*     */ private void createOhlcModels() {
		/* 449 */ createOhlcModel1();
		/* 450 */ createOhlcModel2();
		/*     */ }

	/*     */
	/*     */ private void createOhlcModel1() {
		/* 454 */ this.ohlcModel = new OhlcChartModel();
		/*     */
		/* 456 */ this.ohlcModel.add(new OhlcChartSeries(Integer.valueOf(2007), 143.82D, 144.56D, 136.04D, 136.97D));
		/* 457 */ this.ohlcModel.add(new OhlcChartSeries(Integer.valueOf(2008), 138.7D, 139.68D, 135.18D, 135.4D));
		/* 458 */ this.ohlcModel.add(new OhlcChartSeries(Integer.valueOf(2009), 143.46D, 144.66D, 139.79D, 140.02D));
		/* 459 */ this.ohlcModel.add(new OhlcChartSeries(Integer.valueOf(2010), 140.67D, 143.56D, 132.88D, 142.44D));
		/* 460 */ this.ohlcModel.add(new OhlcChartSeries(Integer.valueOf(2011), 136.01D, 139.5D, 134.53D, 139.48D));
		/* 461 */ this.ohlcModel.add(new OhlcChartSeries(Integer.valueOf(2012), 124.76D, 135.9D, 124.55D, 135.81D));
		/* 462 */ this.ohlcModel.add(new OhlcChartSeries(Integer.valueOf(2013), 123.73D, 129.31D, 121.57D, 122.5D));
		/*     */
		/* 464 */ this.ohlcModel.setTitle("OHLC Chart");
		/* 465 */ this.ohlcModel.getAxis(AxisType.X).setLabel("Year");
		/* 466 */ this.ohlcModel.getAxis(AxisType.Y).setLabel("Price Change $K/Unit");
		/*     */ }

	/*     */
	/*     */ private void createOhlcModel2() {
		/* 470 */ this.ohlcModel2 = new OhlcChartModel();
		/*     */
		/* 472 */ for (int i = 1; i < 41; i++) {
			/* 473 */ this.ohlcModel2.add(new OhlcChartSeries(Integer.valueOf(i), Math.random() * 80.0D + 80.0D,
					Math.random() * 50.0D + 110.0D, Math.random() * 20.0D + 80.0D, Math.random() * 80.0D + 80.0D));
			/*     */ }
		/*     */
		/* 476 */ this.ohlcModel2.setTitle("Candlestick");
		/* 477 */ this.ohlcModel2.setCandleStick(true);
		/* 478 */ this.ohlcModel2.getAxis(AxisType.X).setLabel("Sector");
		/* 479 */ this.ohlcModel2.getAxis(AxisType.Y).setLabel("Index Value");
		/*     */ }

	/*     */
	/*     */ private void createBubbleModels() {
		/* 483 */ this.bubbleModel1 = initBubbleModel();
		/* 484 */ this.bubbleModel1.setTitle("Bubble Chart");
		/* 485 */ this.bubbleModel1.getAxis(AxisType.X).setLabel("Price");
		/* 486 */ Axis yAxis = this.bubbleModel1.getAxis(AxisType.Y);
		/* 487 */ yAxis.setMin(Integer.valueOf(0));
		/* 488 */ yAxis.setMax(Integer.valueOf(250));
		/* 489 */ yAxis.setLabel("Labels");
		/*     */
		/* 491 */ this.bubbleModel2 = initBubbleModel();
		/* 492 */ this.bubbleModel2.setTitle("Custom Options");
		/* 493 */ this.bubbleModel2.setShadow(false);
		/* 494 */ this.bubbleModel2.setBubbleGradients(true);
		/* 495 */ this.bubbleModel2.setBubbleAlpha(0.8D);
		/* 496 */ this.bubbleModel2.getAxis(AxisType.X).setTickAngle(-50);
		/* 497 */ yAxis = this.bubbleModel2.getAxis(AxisType.Y);
		/* 498 */ yAxis.setMin(Integer.valueOf(0));
		/* 499 */ yAxis.setMax(Integer.valueOf(250));
		/* 500 */ yAxis.setTickAngle(50);
		/*     */ }

	/*     */
	/*     */ private BubbleChartModel initBubbleModel() {
		/* 504 */ BubbleChartModel model = new BubbleChartModel();
		/*     */
		/* 506 */ model.add(new BubbleChartSeries("Acura", 70, 183, 55));
		/* 507 */ model.add(new BubbleChartSeries("Alfa Romeo", 45, 92, 36));
		/* 508 */ model.add(new BubbleChartSeries("AM General", 24, 104, 40));
		/* 509 */ model.add(new BubbleChartSeries("Bugatti", 50, 123, 60));
		/* 510 */ model.add(new BubbleChartSeries("BMW", 15, 89, 25));
		/* 511 */ model.add(new BubbleChartSeries("Audi", 40, 180, 80));
		/* 512 */ model.add(new BubbleChartSeries("Aston Martin", 70, 70, 48));
		/*     */
		/* 514 */ return model;
		/*     */ }

	/*     */
	/*     */ private LineChartModel initLinearModel() {
		/* 518 */ LineChartModel model = new LineChartModel();
		/*     */
		/* 520 */ LineChartSeries series1 = new LineChartSeries();
		/* 521 */ series1.setLabel("Series 1");
		/*     */
		/* 523 */ series1.set(Integer.valueOf(1), Integer.valueOf(2));
		/* 524 */ series1.set(Integer.valueOf(2), Integer.valueOf(1));
		/* 525 */ series1.set(Integer.valueOf(3), Integer.valueOf(3));
		/* 526 */ series1.set(Integer.valueOf(4), Integer.valueOf(6));
		/* 527 */ series1.set(Integer.valueOf(5), Integer.valueOf(8));
		/*     */
		/* 529 */ LineChartSeries series2 = new LineChartSeries();
		/* 530 */ series2.setLabel("Series 2");
		/*     */
		/* 532 */ series2.set(Integer.valueOf(1), Integer.valueOf(6));
		/* 533 */ series2.set(Integer.valueOf(2), Integer.valueOf(3));
		/* 534 */ series2.set(Integer.valueOf(3), Integer.valueOf(2));
		/* 535 */ series2.set(Integer.valueOf(4), Integer.valueOf(7));
		/* 536 */ series2.set(Integer.valueOf(5), Integer.valueOf(9));
		/*     */
		/* 538 */ model.addSeries((ChartSeries) series1);
		/* 539 */ model.addSeries((ChartSeries) series2);
		/*     */
		/* 541 */ return model;
		/*     */ }

	/*     */
	/*     */ private void createPieModels() {
		/* 545 */ createPieModel1();
		/* 546 */ createPieModel2();
		/* 547 */ createLivePieModel();
		/*     */ }

	/*     */
	/*     */ private void createPieModel1() {
		/* 551 */ this.pieModel1 = new PieChartModel();
		/*     */
		/* 553 */ this.pieModel1.set("Brand 1", Integer.valueOf(540));
		/* 554 */ this.pieModel1.set("Brand 2", Integer.valueOf(325));
		/* 555 */ this.pieModel1.set("Brand 3", Integer.valueOf(702));
		/* 556 */ this.pieModel1.set("Brand 4", Integer.valueOf(421));
		/*     */
		/* 558 */ this.pieModel1.setTitle("Simple Pie");
		/* 559 */ this.pieModel1.setLegendPosition("w");
		/*     */ }

	/*     */
	/*     */ private void createPieModel2() {
		/* 563 */ this.pieModel2 = new PieChartModel();
		/*     */
		/* 565 */ this.pieModel2.set("Brand 1", Integer.valueOf(540));
		/* 566 */ this.pieModel2.set("Brand 2", Integer.valueOf(325));
		/* 567 */ this.pieModel2.set("Brand 3", Integer.valueOf(702));
		/* 568 */ this.pieModel2.set("Brand 4", Integer.valueOf(421));
		/*     */
		/* 570 */ this.pieModel2.setTitle("Custom Pie");
		/* 571 */ this.pieModel2.setLegendPosition("e");
		/* 572 */ this.pieModel2.setFill(false);
		/* 573 */ this.pieModel2.setShowDataLabels(true);
		/* 574 */ this.pieModel2.setDiameter(150);
		/*     */ }

	/*     */
	/*     */ private void createDonutModels() {
		/* 578 */ this.donutModel1 = initDonutModel();
		/* 579 */ this.donutModel1.setTitle("Donut Chart");
		/* 580 */ this.donutModel1.setLegendPosition("w");
		/*     */
		/* 582 */ this.donutModel2 = initDonutModel();
		/* 583 */ this.donutModel2.setTitle("Custom Options");
		/* 584 */ this.donutModel2.setLegendPosition("e");
		/* 585 */ this.donutModel2.setSliceMargin(5);
		/* 586 */ this.donutModel2.setShowDataLabels(true);
		/* 587 */ this.donutModel2.setDataFormat("value");
		/* 588 */ this.donutModel2.setShadow(false);
		/*     */ }

	/*     */
	/*     */ private DonutChartModel initDonutModel() {
		/* 592 */ DonutChartModel model = new DonutChartModel();
		/*     */
		/* 594 */ Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
		/* 595 */ circle1.put("Brand 1", Integer.valueOf(150));
		/* 596 */ circle1.put("Brand 2", Integer.valueOf(400));
		/* 597 */ circle1.put("Brand 3", Integer.valueOf(200));
		/* 598 */ circle1.put("Brand 4", Integer.valueOf(10));
		/* 599 */ model.addCircle(circle1);
		/*     */
		/* 601 */ Map<String, Number> circle2 = new LinkedHashMap<String, Number>();
		/* 602 */ circle2.put("Brand 1", Integer.valueOf(540));
		/* 603 */ circle2.put("Brand 2", Integer.valueOf(125));
		/* 604 */ circle2.put("Brand 3", Integer.valueOf(702));
		/* 605 */ circle2.put("Brand 4", Integer.valueOf(421));
		/* 606 */ model.addCircle(circle2);
		/*     */
		/* 608 */ Map<String, Number> circle3 = new LinkedHashMap<String, Number>();
		/* 609 */ circle3.put("Brand 1", Integer.valueOf(40));
		/* 610 */ circle3.put("Brand 2", Integer.valueOf(325));
		/* 611 */ circle3.put("Brand 3", Integer.valueOf(402));
		/* 612 */ circle3.put("Brand 4", Integer.valueOf(421));
		/* 613 */ model.addCircle(circle3);
		/*     */
		/* 615 */ return model;
		/*     */ }

	/*     */
	/*     */ private void createLivePieModel() {
		/* 619 */ this.livePieModel = new PieChartModel();
		/*     */
		/* 621 */ this.livePieModel.set("Candidate 1", Integer.valueOf(540));
		/* 622 */ this.livePieModel.set("Candidate 2", Integer.valueOf(325));
		/*     */ }

	/*     */
	/*     */ private void createFillToZero() {
		/* 626 */ this.fillToZero = new CartesianChartModel();
		/*     */
		/* 628 */ LineChartSeries series1 = new LineChartSeries();
		/* 629 */ series1.setLabel("Series 1");
		/*     */
		/* 631 */ series1.set("4, -3, 3, 6, 2, -2", Integer.valueOf(0));
		/*     */
		/* 633 */ this.fillToZero.addSeries((ChartSeries) series1);
		/*     */ }

	/*     */
	/*     */ private MeterGaugeChartModel initMeterGaugeModel() {
		/* 637 */ Object object = new Object(this);
		/*     */
		/*     */
		/*     */
		/*     */
		/*     */
		/*     */
		/* 644 */ return new MeterGaugeChartModel(Integer.valueOf(140), (List) object);
		/*     */ }

	/*     */
	/*     */ private void createMeterGaugeModels() {
		/* 648 */ this.meterGaugeModel1 = initMeterGaugeModel();
		/* 649 */ this.meterGaugeModel1.setTitle("MeterGauge Chart");
		/* 650 */ this.meterGaugeModel1.setGaugeLabel("km/h");
		/* 651 */ this.meterGaugeModel1.setGaugeLabelPosition("bottom");
		/*     */
		/* 653 */ this.meterGaugeModel2 = initMeterGaugeModel();
		/* 654 */ this.meterGaugeModel2.setTitle("Custom Options");
		/* 655 */ this.meterGaugeModel2.setSeriesColors("66cc66,93b75f,E7E658,cc6666");
		/* 656 */ this.meterGaugeModel2.setGaugeLabel("km/h");
		/* 657 */ this.meterGaugeModel2.setGaugeLabelPosition("bottom");
		/* 658 */ this.meterGaugeModel2.setShowTickLabels(false);
		/* 659 */ this.meterGaugeModel2.setLabelHeightAdjust(110);
		/* 660 */ this.meterGaugeModel2.setIntervalOuterRadius(Integer.valueOf(100));
		/*     */ }

	/*     */
	/*     */ private void createAnimatedModels() {
		/* 664 */ this.animatedModel1 = initLinearModel();
		/* 665 */ this.animatedModel1.setTitle("Line Chart");
		/* 666 */ this.animatedModel1.setAnimate(true);
		/* 667 */ this.animatedModel1.setLegendPosition("se");
		/* 668 */ Axis yAxis = this.animatedModel1.getAxis(AxisType.Y);
		/* 669 */ yAxis.setMin(Integer.valueOf(0));
		/* 670 */ yAxis.setMax(Integer.valueOf(10));
		/*     */
		/* 672 */ this.animatedModel2 = initBarModel();
		/* 673 */ this.animatedModel2.setTitle("Bar Charts");
		/* 674 */ this.animatedModel2.setAnimate(true);
		/* 675 */ this.animatedModel2.setLegendPosition("ne");
		/* 676 */ yAxis = this.animatedModel2.getAxis(AxisType.Y);
		/* 677 */ yAxis.setMin(Integer.valueOf(0));
		/* 678 */ yAxis.setMax(Integer.valueOf(200));
		/*     */ }

	/*     */
	/*     */ private void createDateModel() {
		/* 682 */ this.dateModel = new LineChartModel();
		/* 683 */ LineChartSeries series1 = new LineChartSeries();
		/* 684 */ series1.setLabel("Series 1");
		/*     */
		/* 686 */ series1.set("2014-01-01", Integer.valueOf(51));
		/* 687 */ series1.set("2014-01-06", Integer.valueOf(22));
		/* 688 */ series1.set("2014-01-12", Integer.valueOf(65));
		/* 689 */ series1.set("2014-01-18", Integer.valueOf(74));
		/* 690 */ series1.set("2014-01-24", Integer.valueOf(24));
		/* 691 */ series1.set("2014-01-30", Integer.valueOf(51));
		/*     */
		/* 693 */ LineChartSeries series2 = new LineChartSeries();
		/* 694 */ series2.setLabel("Series 2");
		/*     */
		/* 696 */ series2.set("2014-01-01", Integer.valueOf(32));
		/* 697 */ series2.set("2014-01-06", Integer.valueOf(73));
		/* 698 */ series2.set("2014-01-12", Integer.valueOf(24));
		/* 699 */ series2.set("2014-01-18", Integer.valueOf(12));
		/* 700 */ series2.set("2014-01-24", Integer.valueOf(74));
		/* 701 */ series2.set("2014-01-30", Integer.valueOf(62));
		/*     */
		/* 703 */ this.dateModel.addSeries((ChartSeries) series1);
		/* 704 */ this.dateModel.addSeries((ChartSeries) series2);
		/*     */
		/* 706 */ this.dateModel.setTitle("Zoom for Details");
		/* 707 */ this.dateModel.setZoom(true);
		/* 708 */ this.dateModel.getAxis(AxisType.Y).setLabel("Values");
		/* 709 */ DateAxis axis = new DateAxis("Dates");
		/* 710 */ axis.setTickAngle(-50);
		/* 711 */ axis.setMax("2014-02-01");
		/* 712 */ axis.setTickFormat("%b %#d, %y");
		/*     */
		/* 714 */ this.dateModel.getAxes().put(AxisType.X, axis);
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\chart\ChartView.class Java compiler version: 6 (50.0) JD-Core Version:
 * 1.1.3
 */