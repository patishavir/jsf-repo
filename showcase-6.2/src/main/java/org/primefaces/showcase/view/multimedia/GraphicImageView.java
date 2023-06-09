/*    */
package org.primefaces.showcase.view.multimedia;

/*    */
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.ByteArrayInputStream;
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import javax.annotation.PostConstruct;
/*    */ import javax.faces.bean.ManagedBean;
/*    */ import javax.imageio.ImageIO;
/*    */ import org.jfree.chart.ChartFactory;
/*    */ import org.jfree.chart.ChartUtilities;
/*    */ import org.jfree.chart.JFreeChart;
/*    */ import org.jfree.data.general.DefaultPieDataset;
/*    */ import org.jfree.data.general.PieDataset;
/*    */ import org.primefaces.model.DefaultStreamedContent;
/*    */ import org.primefaces.model.StreamedContent;

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
/*    */ public class GraphicImageView
/*    */ {
	/*    */ private StreamedContent graphicText;
	/*    */ private StreamedContent chart;

	/*    */
	/*    */ @PostConstruct
	/*    */ public void init() {
		/*    */ try {
			/* 47 */ BufferedImage bufferedImg = new BufferedImage(100, 25, 1);
			/* 48 */ Graphics2D g2 = bufferedImg.createGraphics();
			/* 49 */ g2.drawString("This is a text", 0, 10);
			/* 50 */ ByteArrayOutputStream os = new ByteArrayOutputStream();
			/* 51 */ ImageIO.write(bufferedImg, "png", os);
			/* 52 */ this.graphicText = (StreamedContent) new DefaultStreamedContent(
					new ByteArrayInputStream(os.toByteArray()), "image/png");
			/*    */
			/*    */
			/* 55 */ JFreeChart jfreechart = ChartFactory.createPieChart("Cities", createDataset(), true, true, false);
			/* 56 */ File chartFile = new File("dynamichart");
			/* 57 */ ChartUtilities.saveChartAsPNG(chartFile, jfreechart, 375, 300);
			/* 58 */ this.chart = (StreamedContent) new DefaultStreamedContent(new FileInputStream(chartFile),
					"image/png");
			/*    */ }
		/* 60 */ catch (Exception e) {
			/* 61 */ e.printStackTrace();
			/*    */ }
		/*    */ }

	/*    */
	/*    */ public StreamedContent getGraphicText() {
		/* 66 */ return this.graphicText;
		/*    */ }

	/*    */
	/*    */ public StreamedContent getChart() {
		/* 70 */ return this.chart;
		/*    */ }

	/*    */
	/*    */ private PieDataset createDataset() {
		/* 74 */ DefaultPieDataset dataset = new DefaultPieDataset();
		/* 75 */ dataset.setValue("New York", new Double(45.0D));
		/* 76 */ dataset.setValue("London", new Double(15.0D));
		/* 77 */ dataset.setValue("Paris", new Double(25.2D));
		/* 78 */ dataset.setValue("Berlin", new Double(14.8D));
		/*    */
		/* 80 */ return (PieDataset) dataset;
		/*    */ }
	/*    */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\multimedia\GraphicImageView.class Java compiler version: 6 (50.0)
 * JD-Core Version: 1.1.3
 */