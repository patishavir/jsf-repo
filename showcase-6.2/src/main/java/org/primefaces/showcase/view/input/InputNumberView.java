/*     */
package org.primefaces.showcase.view.input;

/*     */
/*     */ import java.math.BigDecimal;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.faces.bean.ViewScoped;

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
/*     */ @ViewScoped
/*     */ public class InputNumberView
/*     */ {
	/* 26 */ private Double input1 = new Double(0.0D);
	/* 27 */ private Double input2 = new Double(0.0D);
	/* 28 */ private Double input3 = new Double(0.0D);
	/* 29 */ private Double input4 = new Double(0.0D);
	/* 30 */ private Double input5 = new Double(0.0D);
	/* 31 */ private Double input6 = new Double(0.0D);
	/* 32 */ private Double input7 = null;
	/* 33 */ private BigDecimal input8 = new BigDecimal(0);

	/*     */
	/*     */
	/*     */ public InputNumberView() {
		/* 37 */ this.input1 = Double.valueOf(0.0D);
		/* 38 */ this.input2 = Double.valueOf(0.0D);
		/* 39 */ this.input3 = Double.valueOf(0.0D);
		/* 40 */ this.input4 = Double.valueOf(0.0D);
		/* 41 */ this.input5 = Double.valueOf(251.31D);
		/* 42 */ this.input6 = Double.valueOf(60.0D);
		/* 43 */ this.input8 = new BigDecimal("1234.000000001");
		/*     */ }

	/*     */
	/*     */ public Double getInput1() {
		/* 47 */ return this.input1;
		/*     */ }

	/*     */
	/*     */ public void setInput1(Double input1) {
		/* 51 */ this.input1 = input1;
		/*     */ }

	/*     */
	/*     */ public Double getInput2() {
		/* 55 */ return this.input2;
		/*     */ }

	/*     */
	/*     */ public void setInput2(Double input2) {
		/* 59 */ this.input2 = input2;
		/*     */ }

	/*     */
	/*     */ public Double getInput3() {
		/* 63 */ return this.input3;
		/*     */ }

	/*     */
	/*     */ public void setInput3(Double input3) {
		/* 67 */ this.input3 = input3;
		/*     */ }

	/*     */
	/*     */ public Double getInput4() {
		/* 71 */ return this.input4;
		/*     */ }

	/*     */
	/*     */ public void setInput4(Double input4) {
		/* 75 */ this.input4 = input4;
		/*     */ }

	/*     */
	/*     */ public Double getInput5() {
		/* 79 */ return this.input5;
		/*     */ }

	/*     */
	/*     */ public void setInput5(Double input5) {
		/* 83 */ this.input5 = input5;
		/*     */ }

	/*     */
	/*     */ public Double getInput6() {
		/* 87 */ return this.input6;
		/*     */ }

	/*     */
	/*     */ public void setInput6(Double input6) {
		/* 91 */ this.input6 = input6;
		/*     */ }

	/*     */
	/*     */ public Double getInput7() {
		/* 95 */ return this.input7;
		/*     */ }

	/*     */
	/*     */ public void setInput7(Double input7) {
		/* 99 */ this.input7 = input7;
		/*     */ }

	/*     */
	/*     */ public BigDecimal getInput8() {
		/* 103 */ return this.input8;
		/*     */ }

	/*     */
	/*     */ public void setInput8(BigDecimal input8) {
		/* 107 */ this.input8 = input8;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\input\InputNumberView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */