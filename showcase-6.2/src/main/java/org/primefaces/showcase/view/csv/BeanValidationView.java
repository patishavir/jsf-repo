/*     */
package org.primefaces.showcase.view.csv;

/*     */
/*     */ import java.util.Date;
/*     */ import javax.faces.bean.ManagedBean;
/*     */ import javax.validation.constraints.AssertTrue;
/*     */ import javax.validation.constraints.DecimalMax;
/*     */ import javax.validation.constraints.Digits;
/*     */ import javax.validation.constraints.Future;
/*     */ import javax.validation.constraints.Max;
/*     */ import javax.validation.constraints.Min;
/*     */ import javax.validation.constraints.NotNull;
/*     */ import javax.validation.constraints.Past;
/*     */ import javax.validation.constraints.Pattern;
/*     */ import javax.validation.constraints.Size;

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
/*     */ @ManagedBean
/*     */ public class BeanValidationView
/*     */ {
	/*     */ @Size(min = 2, max = 5)
	/*     */ private String name;
	/*     */ @Min(10L)
	/*     */ @Max(20L)
	/*     */ private Integer age;
	/*     */ @DecimalMax(value = "99.9", message = "Shold not exceed 99.9")
	/*     */ private Double amount;
	/*     */ @Digits(integer = 3, fraction = 2)
	/*     */ private Double amount2;
	/*     */ @AssertTrue
	/*     */ private boolean checked;
	/*     */ @Past
	/*     */ private Date pastDate;
	/*     */ @Future
	/*     */ private Date futureDate;
	/*     */ @Pattern(regexp = "^[-+]?\\d+$")
	/*     */ private String pattern;
	/*     */ @NotNull
	/*     */ private Boolean bool;

	/*     */
	/*     */ public String getName() {
		/* 62 */ return this.name;
		/*     */ }

	/*     */ public void setName(String name) {
		/* 65 */ this.name = name;
		/*     */ }

	/*     */
	/*     */ public Integer getAge() {
		/* 69 */ return this.age;
		/*     */ }

	/*     */ public void setAge(Integer age) {
		/* 72 */ this.age = age;
		/*     */ }

	/*     */
	/*     */ public Double getAmount() {
		/* 76 */ return this.amount;
		/*     */ }

	/*     */ public void setAmount(Double amount) {
		/* 79 */ this.amount = amount;
		/*     */ }

	/*     */
	/*     */ public Double getAmount2() {
		/* 83 */ return this.amount2;
		/*     */ }

	/*     */ public void setAmount2(Double amount2) {
		/* 86 */ this.amount2 = amount2;
		/*     */ }

	/*     */
	/*     */ public boolean isChecked() {
		/* 90 */ return this.checked;
		/*     */ }

	/*     */ public void setChecked(boolean checked) {
		/* 93 */ this.checked = checked;
		/*     */ }

	/*     */
	/*     */ public Date getPastDate() {
		/* 97 */ return this.pastDate;
		/*     */ }

	/*     */ public void setPastDate(Date pastDate) {
		/* 100 */ this.pastDate = pastDate;
		/*     */ }

	/*     */
	/*     */ public Date getFutureDate() {
		/* 104 */ return this.futureDate;
		/*     */ }

	/*     */ public void setFutureDate(Date futureDate) {
		/* 107 */ this.futureDate = futureDate;
		/*     */ }

	/*     */
	/*     */ public String getPattern() {
		/* 111 */ return this.pattern;
		/*     */ }

	/*     */ public void setPattern(String pattern) {
		/* 114 */ this.pattern = pattern;
		/*     */ }

	/*     */
	/*     */ public Boolean getBool() {
		/* 118 */ return this.bool;
		/*     */ }

	/*     */ public void setBool(Boolean bool) {
		/* 121 */ this.bool = bool;
		/*     */ }
	/*     */ }

/*
 * Location:
 * D:\oj\j\primefaces\showcase-6.2.war!\WEB-INF\classes\org\primefaces\showcase\
 * view\csv\BeanValidationView.class Java compiler version: 6 (50.0) JD-Core
 * Version: 1.1.3
 */